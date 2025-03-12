Use Librix;

-- Used in the borrowing table
CREATE VIEW View_LoanList AS
SELECT 
    b.LoanCode,
    o.OffName,
    m.MemName,
    b.LoanDate,
    b.ReturnDate
FROM Borrowing b
JOIN Officer o ON b.OffID = o.OffID
JOIN Member m ON b.MemID = m.MemID;

-- Use in the Book Borrowing Feature
CREATE VIEW View_BookStatistics AS
SELECT 
    b.BookTitle,
    COUNT(Distinct bc.CopyCode) AS TotalBooks,
    SUM(CASE WHEN bc.BookStatus = 'Available' THEN 1 ELSE 0 END) AS AvailableBooks,
    SUM(CASE WHEN bc.BookStatus = 'Borrowed' THEN 1 ELSE 0 END) AS BorrowedBooks
FROM Book  b
JOIN BookCopy bc ON b.BookCode = bc.BookCode
GROUP BY b.BookTitle;

-- Use for return transaction
CREATE VIEW View_BorrowedBooks AS
SELECT 
    bb.CopyCode,
    br.LoanCode,
    m.MemName,
    b.BookTitle,
    br.LoanDate,
    br.ReturnDate
FROM BorrowedBook bb
JOIN BookCopy bc ON bb.CopyCode = bc.CopyCode
JOIN Book b ON bc.BookCode = b.BookCode
JOIN Borrowing br ON bb.LoanCode = br.LoanCode
JOIN Member m ON br.MemID = m.MemID
Where ActualReturnDate is Null;

-- To see the results of the return transaction
CREATE VIEW View_BookReturned AS
SELECT 
    bb.CopyCode,
    br.LoanCode,
    m.MemName,
    b.BookTitle,
    bb.ActualReturnDate,
    bb.OverdueFine
FROM BorrowedBook bb
JOIN BookCopy bc ON bb.CopyCode = bc.CopyCode
JOIN Book b ON bc.BookCode = b.BookCode
JOIN Borrowing br ON bb.LoanCode = br.LoanCode
JOIN Member m ON br.MemID = m.MemID
Where ActualReturnDate is Not Null;

-- Only the 4 views above are used in this project --------------------------

-- To find out the availability status of all books
CREATE VIEW View_BookStatus AS
SELECT 
    b.BookTitle,
    bc.CopyCode,
    c.CatName,
    bc.BookStatus
FROM Book b
JOIN BookCopy bc ON b.BookCode = bc.BookCode
JOIN BookCategory c ON b.CatCode = c.CatCode;

-- To find out which books are in 'Not Good' condition
CREATE VIEW View_BookCond AS
SELECT 
    b.BookTitle,
    bc.CopyCode,
    c.CatName,
    bb.ReturnCond
FROM Book b
JOIN BookCopy bc ON b.BookCode = bc.BookCode
JOIN BookCategory c ON b.CatCode = c.CatCode
JOIN BorrowedBook bb ON bc.CopyCode = bb.CopyCode
Where ReturnCond <> 'Good';

-- To see all books that are currently being borrowed and the members who are borrowing them.
CREATE VIEW View_BorrowedBooks AS
SELECT 
    bb.CopyCode,
    br.LoanCode,
    m.MemName,
    b.BookTitle,
    br.LoanDate,
    br.ReturnDate,
    bb.ActualReturnDate,
    bb.OverdueFine
FROM BorrowedBook bb
JOIN BookCopy bc ON bb.CopyCode = bc.CopyCode
JOIN Book b ON bc.BookCode = b.BookCode
JOIN Borrowing br ON bb.LoanCode = br.LoanCode
JOIN Member m ON br.MemID = m.MemID;

-- To track books returned beyond the deadline
CREATE VIEW View_OverdueBooks AS
SELECT 
    bb.CopyCode,
    b.BookTitle,
    m.MemName,
    br.ReturnDate,
    bb.ActualReturnDate,
    bb.OverdueFine
FROM BorrowedBook bb
JOIN BookCopy bc ON bb.CopyCode = bc.CopyCode
JOIN Book b ON bc.BookCode = b.BookCode
JOIN Borrowing br ON bb.LoanCode = br.LoanCode
JOIN Member m ON br.MemID = m.MemID
WHERE bb.ActualReturnDate > br.ReturnDate;

-- To provide a summary of the number of books per category
CREATE VIEW View_BookStatistics AS
SELECT 
    c.CatName,
    COUNT(DISTINCT b.BookCode) AS TotalBooks,
    SUM(CASE WHEN bc.BookStatus = 'Available' THEN 1 ELSE 0 END) AS AvailableBooks,
    SUM(CASE WHEN bc.BookStatus = 'Borrowed' THEN 1 ELSE 0 END) AS BorrowedBooks
FROM BookCategory c
JOIN Book b ON c.CatCode = b.CatCode
JOIN BookCopy bc ON b.BookCode = bc.BookCode
GROUP BY c.CatName;

-- To view the borrowing history of a particular member
CREATE VIEW View_MemberLoanHistory AS
SELECT 
    m.MemID,
    m.MemName,
    br.LoanCode,
    b.BookTitle,
    bb.CopyCode,
    br.LoanDate,
    br.ReturnDate,
    bb.ActualReturnDate,
    bb.ReturnCond
FROM Member m
JOIN Borrowing br ON m.MemID = br.MemID
JOIN BorrowedBook bb ON br.LoanCode = bb.LoanCode
JOIN BookCopy bc ON bb.CopyCode = bc.CopyCode
JOIN Book b ON bc.BookCode = b.BookCode;

-- To find out who the officers are who handle loan/return transactions
CREATE VIEW View_OfficerTransactions AS
SELECT 
    o.OffID,
    o.OffName,
    br.LoanCode,
    br.LoanDate,
    br.ReturnDate
FROM Officer o
JOIN Borrowing br ON o.OffID = br.OffID;

-- To track members with the largest number of fines
CREATE VIEW View_TopFinedMembers AS
SELECT 
    m.MemID,
    m.MemName,
    SUM(bb.OverdueFine) AS TotalFine
FROM Member m
JOIN Borrowing br ON m.MemID = br.MemID
JOIN BorrowedBook bb ON br.LoanCode = bb.LoanCode
GROUP BY m.MemID, m.MemName
ORDER BY TotalFine DESC;