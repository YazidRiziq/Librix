package librix.Query;

public class BookCategoryQuery {
    public static String AddCategory = "Call AddCategory(?)";
    public static String getAllCategory = "Select * From BookCategory";
    public static String DeleteBookCategory = "Delete From BookCategory WHERE CatCode = ?";
    public static String UpdateCategory = "UPDATE BookCategory SET CatName=? WHERE CatCode=?";
    public static String SearchCategory = "SELECT * FROM BookCategory WHERE CatName LIKE ?";
}
