use librix;

-- Create BookCode Automatically
Delimiter //
Create Procedure AddBook(
	IN prCatName Varchar(30),
    IN prISBN Char(17),
    IN prBookTitle Varchar(50),
    IN prAutName Varchar(30),
    IN prPublisher Varchar(30),
    IN prPubYear int(4),
    IN prNumPages Int,
    IN prTotalCopies int
)
Begin
	Declare NewBookCode Char(8);
	Declare prCatCode Char(6);
    
    Start Transaction;
    
    -- Get CatCode from the input book category
    Select CatCode into prCatCode From BookCategory
    Where CatName = prCatName;
    
    -- Sending message if Category not found
    IF prCatCode IS Null Then
		SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'Category not found!';
    END IF;
    
    -- Looks for empty values ​​and sets BookCode
    Select Concat(
			'BK',
            Substring(prCatCode, 5,2),
			'-',
            LPAD(Coalesce(Min(Cast(Substring(BookCode,7,2) AS Unsigned)),0)+1,3,'0'))
	Into NewBookCode From Book
    Where Substring(prCatCode,5,2) = Substring(BookCode,3,2) 
		And Concat(
				'BK',
				Substring(prCatCode, 5,2),
				'-',
				LPAD(Cast(Substring(BookCode,7,2) AS Unsigned)+1,3,'0'))
		Not in (Select BookCode From Book);
    
    -- Entering data into Table Book
    Insert into Book (BookCode, CatCode, ISBN, BookTitle, AutName, Publisher, PubYear, NumPages, TotalCopies)
    Values (NewBookCode, prCatCode, prISBN, prBookTitle, prAutName, prPublisher, prPubYear, prNumPages, prTotalCopies);
    Call AddCopy(NewBookCode);
    
    Commit;
End;