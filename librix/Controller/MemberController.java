package librix.Controller;
import librix.Query.MemberQuery;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

public class MemberController extends BaseController{
    
    public boolean insertProcedure(Object[] params) throws SQLException {
        try {
            executeUpdate(MemberQuery.AddMember, params);
            return true;
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    public ResultSet getAllMember() throws SQLException {
        return executeQuery(MemberQuery.getAllMember);
    }
    
    public boolean deleteMember(String MemID) throws SQLException {
        return deleteData(MemberQuery.DeleteMember, MemID);
    }
    
    public boolean updateMember(Object[] params) throws SQLException {
        return executeUpdate(MemberQuery.UpdateMember, params) > 0;
    }
    
    public CachedRowSet searchMember(String keyword) throws SQLException {
        ResultSet rs = executeQuery(MemberQuery.SearchMember, "%" + keyword + "%");
        CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet();
        crs.populate(rs);
        return crs;
    }
}
