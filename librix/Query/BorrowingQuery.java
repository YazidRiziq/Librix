package librix.Query;

public class BorrowingQuery {
    public static String AddBorrowing = "Call AddBorrowing(?,?,?,?)";
    public static String getAllBorrowing = "Select * From view_LoanList";
    public static String getAllBookStatistic = "Select * From view_bookstatistics";
    public static String DeleteBorrowing = "Delete From Borrowing WHERE LoanCode = ?";
    public static String SearchLoanList = "SELECT * FROM view_LoanList WHERE MemName LIKE ?";
    public static String SearchBookStatistic = "SELECT * FROM view_bookstatistics WHERE BookTitle LIKE ?";
}
