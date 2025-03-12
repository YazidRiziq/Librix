Use Librix;

CREATE INDEX idx_BookCode
ON BookCopy (BookCode);
CREATE INDEX idx_BookStatus
ON BookCopy (BookStatus);

CREATE INDEX idx_CopyCode
ON BorrowedBook (CopyCode);
CREATE INDEX idx_LoanCode
ON BorrowedBook (LoanCode);

CREATE INDEX idx_MemID
ON Borrowing (MemID);
CREATE INDEX idx_OffID
ON Borrowing (OffID);
CREATE INDEX idx_LoanDate
ON Borrowing (LoanDate);
CREATE INDEX idx_ReturnDate
ON Borrowing (ReturnDate);

-- Fulltext Search -------------------------------------------
CREATE FULLTEXT INDEX ftx_BookTitle 
ON Book(BookTitle);

CREATE FULLTEXT INDEX ftx_MemName
ON Member(MemName);
CREATE FULLTEXT INDEX ftx_OffName
ON Officer(OffName);
CREATE FULLTEXT INDEX ftx_MemAddress
ON Member(MemAddress);
