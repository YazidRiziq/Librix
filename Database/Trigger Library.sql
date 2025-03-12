use librix;

Delimiter $$
CREATE TRIGGER UpdateBorrowedBook
AFTER UPDATE ON BorrowedBook
FOR EACH ROW
BEGIN
    -- Update BookStatus to 'Available' in BookCopy table
    IF NEW.ActualReturnDate IS NOT NULL THEN
        UPDATE BookCopy
        SET BookStatus = 'Available'
        WHERE CopyCode = NEW.CopyCode;
    END IF;
END;
$$ Delimiter 