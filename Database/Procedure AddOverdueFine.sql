Use Librix;

Delimiter //
Create Procedure AddOverduefine (
	sCopyCode Char(12),
    sLoanCode Char(13)
)
BEGIN
	DECLARE DaysLate Int;
    DECLARE FinePerDay DECIMAL(10, 2) DEFAULT 1000;
	DECLARE trReturnDate DATE;
	DECLARE trActualReturnDate DATE;
    
	SELECT ReturnDate INTO trReturnDate
    FROM Borrowing
    WHERE LoanCode = sLoanCode;
    
    Select ActualReturnDate INTO trActualReturnDate
    FROM BorrowedBook
    WHERE CopyCode = sCopyCode
    AND LoanCode = sLoanCode;
    
    IF trActualReturnDate > trReturnDate THEN
		SET DaysLate = DATEDIFF(trActualReturnDate, trReturnDate);
	ELSE
		SET DaysLate = 0;
	END IF;

	-- OverdueFine update on BorrowedBook
	Update BorrowedBook
    Set OverdueFine = DaysLate * FinePerDay
	WHERE CopyCode = sCopyCode
    AND LoanCode = sLoanCode;
END;