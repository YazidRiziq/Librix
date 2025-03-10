package librix.Controller;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import librix.Query.OfficerQuery;

public class OfficerController extends BaseController {
    
    public boolean insertProcedure(Object[] params) throws SQLException {
        try {
            executeUpdate(OfficerQuery.AddOfficer, params);
            return true;
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    public ResultSet getAllOfficer() throws SQLException {
        return executeQuery(OfficerQuery.getAllOfficer);
    }
    
    public boolean deleteOfficer(String OffID) throws SQLException {
        return deleteData(OfficerQuery.DeleteOfficer, OffID);
    }
    
    public boolean updateOfficer(Object[] params) throws SQLException {
        return executeUpdate(OfficerQuery.UpdateOfficer, params) > 0;
    }
    
    public CachedRowSet searchOfficer(String keyword) throws SQLException {
        ResultSet rs = executeQuery(OfficerQuery.SearchOfficer, "%" + keyword + "%");
        CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet();
        crs.populate(rs);
        return crs;
    }
}
