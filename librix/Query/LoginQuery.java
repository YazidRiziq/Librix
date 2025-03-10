package librix.Query;

public class LoginQuery {
    public static String Login = "Select * From Login Where Username=? And PasswordUser= SHA2(?,256)";
}
