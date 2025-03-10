package librix.Query;

public class ReturnBookQuery {
    public static String getViewReturnBooks = "Select * From view_borrowedbooks";
    public static String getViewReturnSuccess = "Select * From view_BookReturned";
    public static String ReturnBook = "Update BorrowedBook set ActualReturnDate = Curdate() Where CopyCode = ? and LoanCode = ?";
    public static String AddOverdueFIne = "Call AddOverdueFine(?,?)";
    public static String SearchReturnBook = "SELECT * FROM view_borrowedbooks WHERE MemName LIKE ?";
    public static String SearchReturnSuccess = "SELECT * FROM view_BookReturned WHERE MemName LIKE ?";
}
