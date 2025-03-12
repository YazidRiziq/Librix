use librix;

Delimiter //
Create Procedure AddCopy(
	sBookCode Char(8)
)
Begin
	Declare NewBookCopy Char(12);
    Declare prBookCode Char(8);
    Declare prCopyNumber int Default 1;
    Declare prTotalCopies int;
    Declare prBookStatus Varchar(20);
    Set prBookStatus = 'Available';
    
    -- Validating BookCode from Table Book
    Select BookCode into prBookCode
    From Book
    Where BookCode = sBookCode;
    
	-- Retrieving TotalCopies Value from Book Table
    Select TotalCopies Into prTotalCopies 
    From Book
    Where BookCode = sBookCode;
    
    -- Entering data into the BookCopy Table
    REPEAT
    
    -- Create Automatic CopyCode
    Select Concat(
				'CPY',
                '-',
                Substring(prBookCode,3,2),
                Substring(prBookCode,6,3),
                '-',
                LPAD(Coalesce(Min(Cast(Substring(CopyCode,11,2) AS Unsigned)),0)+1,2,'0')
            )
    Into NewBookCopy
    From BookCopy
    Where Substring(CopyCode,5,2) = Substring(prBookCode,3,2)
    And Substring(CopyCode,7,3) = Substring(prBookCode,6,3)
    And Concat(
				'CPY',
                '-',
                Substring(prBookCode,3,2),
                Substring(prBookCode,6,3),
                '-',
                LPAD(Cast(Substring(CopyCode,11,2) AS Unsigned)+1,2,'0')
            )
    Not In (Select CopyCode From BookCopy);
    
		Insert Into BookCopy (CopyCode, BookCode, BookStatus, CopyNumber)
		Values (NewBookCopy, prBookCode, prBookStatus, prCopyNumber);
	Set prCopyNumber = prCopyNumber + 1;
	UNTIL prCopyNumber > prTotalCopies
    END REPEAT;
End;