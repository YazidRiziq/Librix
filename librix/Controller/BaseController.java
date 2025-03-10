package librix.Controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import librix.Connection.DBConnection;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

public abstract class BaseController {
    private final DBConnection db = new DBConnection();

    protected int executeUpdate(String query, Object... params) throws SQLException {
        Connection conn = db.open();
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            for (int i = 0; i < params.length; i++) {
                ps.setObject(i+1, params[i]);
            }
            return ps.executeUpdate();
        } finally {
            db.close(conn);
        }
    }

    protected ResultSet executeQuery(String query, Object... params) throws SQLException {
        Connection conn = db.open();
        PreparedStatement ps = conn.prepareStatement(query);
        for (int i = 0; i < params.length; i++) {
            ps.setObject(i+1, params[i]);
        }
        return ps.executeQuery();
    }
    
    public boolean deleteData(String query, String primaryKey) throws SQLException {
        return executeUpdate(query, primaryKey) > 0;
    }
    
    protected CachedRowSet toCachedRowSet(ResultSet rs) throws SQLException {
        CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet();
        crs.populate(rs);
        return crs;
    }
}