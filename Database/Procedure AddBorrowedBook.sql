use librix;

Delimiter //
Create Procedure AddBorrowedBook(
	sLoanCode Char(13),
    sBookCode Char(8),
    Quantity Int
)
BEGIN
	Declare prCopyCode Char(12);
    Declare prLoanCode Char(13);
    Declare prTotalCopies int;
    Declare prCounter int Default 1;
    
	-- Verifying LoanCode
	Select LoanCode Into prLoanCode
	From Borrowing
	Where LoanCode = sLoanCode;
    
    -- Repetition of data entry
    REPEAT
        
		-- Get available CopyCode
		Select bc.CopyCode Into prCopyCode
		From BookCopy bc Left Outer Join BorrowedBook bb
		On bc.CopyCode = bb.CopyCode
        Where bc.BookCode = sBookCode
        And bc.BookStatus = 'Available'
        And (bb.ReturnCond = 'Good' OR bb.ReturnCond is Null)
        Order By bb.ActualReturnDate Desc
        Limit 1;
		
		-- Notification if CopyCode is not available
		IF prCopyCode IS NULL THEN
				SIGNAL SQLSTATE '45000'
				SET MESSAGE_TEXT = 'No available copies for the requested book.';
		END IF;
        
		-- Loan Quantity cannot be more than TotalCopies
		Select TotalCopies into prTotalCopies
		From Book
		Where BookCode = sBookCode;
		
		IF Quantity > prTotalCopies Then
			Signal SQLSTATE '45000'
			Set Message_Text = 'Not enough available copies for the requested book.';
		END IF;
		
		-- Entering data into the BorrowedBook table
		Insert Into BorrowedBook (CopyCode, LoanCode, ReturnCond, ActualReturnDate, OverdueFine)
		Values (prCopyCode, prLoanCode, 'Good', NULL, NULL);
		
		-- Book Status Update
		Update BookCopy
		Set BookStatus = 'Borrowed'
		Where CopyCode = prCopyCode;
        
		SET prCounter = prCounter + 1;
	
    Until prCounter > Quantity
	END REPEAT;
END;