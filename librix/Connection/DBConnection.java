package librix.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/librix";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public Connection open() throws SQLException {
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");  // ini versi baru (pakai `cj`)
    } catch (ClassNotFoundException e) {
        throw new SQLException("MySQL driver not found!");
    }
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public void close(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
