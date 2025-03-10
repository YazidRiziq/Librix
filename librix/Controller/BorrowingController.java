package librix.Controller;
import librix.Query.BorrowingQuery;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

public class BorrowingController extends BaseController {
    
    public boolean insertProcedure(Object[] params) throws SQLException {
        try {
            executeUpdate(BorrowingQuery.AddBorrowing, params);
            return true;
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    public ResultSet getAllBorrowing() throws SQLException {
        return executeQuery(BorrowingQuery.getAllBorrowing);
    }
    
    public ResultSet getAllBookStatistic() throws SQLException {
        return executeQuery(BorrowingQuery.getAllBookStatistic);
    }
    
    public boolean deleteBorrowing(String LoanCode) throws SQLException {
        return deleteData(BorrowingQuery.DeleteBorrowing, LoanCode);
    }
    
    public CachedRowSet searchLoanList(String keyword) throws SQLException {
        ResultSet rs = executeQuery(BorrowingQuery.SearchLoanList, "%" + keyword + "%");
        CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet();
        crs.populate(rs);
        return crs;
    }
    
    public CachedRowSet searchBookStatistic(String keyword) throws SQLException {
        ResultSet rs = executeQuery(BorrowingQuery.SearchBookStatistic, "%" + keyword + "%");
        CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet();
        crs.populate(rs);
        return crs;
    }
    
}
