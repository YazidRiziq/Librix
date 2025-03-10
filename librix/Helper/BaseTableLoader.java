package librix.Helper;
import javax.swing.JTable;
import java.sql.ResultSet;
import librix.Connection.DBConnection;
import net.proteanit.sql.DbUtils;
import java.sql.SQLException;

public class BaseTableLoader {
    private final DBConnection db = new DBConnection();

    public void LoadTable(JTable table, ResultSet rs) throws SQLException {
        table.setModel(DbUtils.resultSetToTableModel(rs));
        db.close(rs.getStatement().getConnection());
    }
}
