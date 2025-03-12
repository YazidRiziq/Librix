Create Database Librix;
use Librix;

Create Table BookCategory
(
	CatCode Char(6) Not Null,
    CatName Varchar(50)
);

Create Table Book
(
	BookCode Char(8) Not Null,
    CatCode Char(6) Not Null,
    ISBN Char(17),
    BookTitle Varchar(50),
    AutName Varchar(30),
    Publisher Varchar(30),
    PubYear int,
    NumPages Int,
    TotalCopies Int
);

Create Table BookCopy
(
	CopyCode Char(12) Not Null,
    BookCode Char(8) Not Null,
    BookStatus Varchar(20),
    CopyNumber Int
);

Create Table BorrowedBook
(
	CopyCode Char(12) Not Null,
    LoanCode Char(13) Not Null,
    ReturnCond Varchar(15),
    ActualReturnDate Date,
    OverdueFine int
);

Create Table Borrowing
(
    LoanCode Char(13) Not Null,
    OffID Char(10) Not Null,
    MemID Char(11) Not Null,
    LoanDate Date,
    ReturnDate Date
);

Create Table Officer
(
	OffID Char(10) Not Null,
    OffName Varchar(50) Not Null,
    OffEmail Varchar(30),
    OffTelp Varchar(15)
);

Create Table Member
(
	MemID Char(11) Not Null,
    MemName Varchar(50) Not Null,
    MemEmail Varchar(30),
    MemTelp Varchar(15),
    MemAddress Varchar(100),
    RegDate Date Not Null
);


-- For Loginpage -----------------------------------------------
Create Table Login
(
	ID int Not Null,
    NameUser Varchar(100) Not Null,
    Username Varchar(100) Not Null,
    PasswordUser Varchar(100) Not Null,
    TypeUser Varchar(1) Not Null Default 'U'
);

ALTER TABLE Login ADD PRIMARY KEY (ID);

-- Example of Login Data
INSERT INTO Login (ID, NameUser, Username, PasswordUser, TypeUser) 
VALUES (1, 'Officer', 'admin', SHA2('admin', 256), 'A');