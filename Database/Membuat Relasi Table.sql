Alter table BookCategory
Add constraint primary key (CatCode);
Alter table Book
Add constraint primary key (BookCode);
Alter Table BookCopy
Add constraint primary key (CopyCode);
Alter Table BorrowedBook
Add constraint primary key (CopyCode, LoanCode);
Alter Table Borrowing
Add Constraint primary key (LoanCode);
Alter Table Officer
Add constraint primary key (OffID);
ALter Table Member
Add constraint primary key (MemID);


Alter table Book
Add constraint fkBook foreign key (CatCode)
references BookCategory(CatCode);
Alter Table BookCopy
Add constraint fkBookCopy foreign key (BookCode)
references Book(BookCode);
Alter Table BorrowedBook
Add constraint fkBorrowedBookCopy foreign key (CopyCode)
References BookCopy(CopyCode);
Alter Table BorrowedBook
Add constraint fkBorrowedBookLoan foreign key (LoanCode)
References Borrowing(LoanCode);
Alter Table Borrowing
Add Constraint fkBorrowingOff foreign key (OffID)
references Officer(OffID);
Alter Table Borrowing
Add Constraint fkBorrowingMem foreign key (MemID)
references Member(MemID);