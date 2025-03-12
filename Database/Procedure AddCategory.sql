use librix;

-- Create Automatic Categories
DELIMITER //
Create Procedure AddCategory(IN CatName Varchar(30))
Begin
	Declare NewCatCode Char(6);
    -- Check the empty code
    Select Concat('CAT', LPAD(Coalesce(Min(Cast(Substring(CatCode,4) AS Unsigned)),0)+1, 3, '0'))
	into NewCatCode From BookCategory
    Where Cast(Substring(CatCode,4) AS Unsigned)+1
    Not In (Select Cast(Substring(CatCode,4) AS Unsigned) From BookCategory);
    
    -- Enter data into the table
    Insert into BookCategory (CatCode, CatName)
    Values (NewCatCode, CatName);
End;