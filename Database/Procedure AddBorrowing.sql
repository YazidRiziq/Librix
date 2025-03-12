use Librix;

Delimiter //
Create Procedure AddBorrowing(
	sOffName Varchar(50),
    sMemName Varchar(50),
    sBookTitle Varchar(50),
    sQuantity int
)
BEGIN
	Declare NewLoanCode Char(13);
    Declare prBookCode Char(8);
    Declare prOffID Char(10);
    Declare prMemID Char(11);
	Declare prLoanDate Date;
    Declare prReturnDate Date;
    
    Declare prCopyCode Char(12);
    Declare prTotalCopies int;

    Set prLoanDate = curdate();
    Set prReturnDate = Date_Add(prLoanDate, Interval 7 Day);

    -- Get BookCode, OffID, MemID
    Select BookCode into prBookCode From Book Where BookTitle = sBookTitle;
    Select OffID into prOffID From Officer Where OffName = sOffName;
    Select MemID into prMemID From Member Where MemName = sMemName;

    -- Check Book Availability
    Select bc.CopyCode Into prCopyCode
	From BookCopy bc 
    Left Join BorrowedBook bb On bc.CopyCode = bb.CopyCode
	Where bc.BookCode = prBookCode
	And bc.BookStatus = 'Available'
	And (bb.ReturnCond = 'Good' OR bb.ReturnCond IS NULL)
	Order By bb.ActualReturnDate Desc
	Limit 1;

	IF prCopyCode IS NULL THEN
		SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'No available copies for the requested book.';
	END IF;

	-- Check whether the quantity is valid
	Select TotalCopies into prTotalCopies From Book Where BookCode = prBookCode;
	IF sQuantity > prTotalCopies THEN
		SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Not enough available copies for the requested book.';
	END IF;

	-- Automatic LoanCode Creation
	Select Concat(
		'LN', '-', Substring(prMemID,4,3), '-', 
		Upper(Substring(md5(prLoanDate),1,4)), 
		LPAD(Coalesce(Min(Cast(Substring(LoanCode,12,2) As Unsigned)),0)+1,2,'0')
	) Into NewLoanCode
	From Borrowing
	Where Cast(Substring(LoanCode,12,2) As Unsigned)+1
	Not In (Select Cast(Substring(LoanCode,12,2) As Unsigned) From Borrowing);

	-- Insert into Borrowing
	Insert Into Borrowing (LoanCode, OffID, MemID, LoanDate, ReturnDate)
	Values (NewLoanCode, prOffID, prMemID, prLoanDate, prReturnDate);

	-- Insert into AddBorrowedBook
	Call AddBorrowedBook(NewLoanCode, prBookCode, sQuantity);
END;