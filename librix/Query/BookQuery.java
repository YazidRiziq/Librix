package librix.Query;

public class BookQuery {
    public static String AddBook = "Call AddBook(?,?,?,?,?,?,?,?)";
    public static String getAllBook = "Select * From Book";
    public static String DeleteBook = "Delete From Book WHERE BookCode = ?";
    public static String UpdateBook = "UPDATE Book SET ISBN=?, BookTitle=?, AutName=?, Publisher=?, PubYear=?, NumPages=?, TotalCopies=? WHERE BookCode=?";
    public static String SearchBook = "SELECT * FROM Book WHERE BookTitle LIKE ?";
}
