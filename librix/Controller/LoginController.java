package librix.Controller;
import java.sql.SQLException;
import librix.Query.LoginQuery;

public class LoginController extends BaseController{
    public boolean insertProcedure(Object[] params) throws SQLException {
        try {
            executeQuery(LoginQuery.Login, params);
            return true;
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
}
