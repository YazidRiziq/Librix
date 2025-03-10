package librix.Controller;
import librix.Query.ReturnBookQuery;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

public class ReturnBookController extends BaseController{
    public ResultSet getViewReturnBook() throws SQLException {
        return executeQuery(ReturnBookQuery.getViewReturnBooks);
    }
    
    public ResultSet getViewReturnSuccess() throws SQLException {
        return executeQuery(ReturnBookQuery.getViewReturnSuccess);
    }
    
    public boolean returnBook(String copyCode, String loanCode) throws SQLException {
        return executeUpdate(ReturnBookQuery.ReturnBook, copyCode, loanCode) > 0;
    }
    
    public boolean addOverdueFine(String copyCode, String loanCode) throws SQLException {
        return executeUpdate(ReturnBookQuery.AddOverdueFIne, copyCode, loanCode) > 0;
    }
    
    public CachedRowSet searchReturnBook(String keyword) throws SQLException {
        ResultSet rs = executeQuery(ReturnBookQuery.SearchReturnBook, "%" + keyword + "%");
        CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet();
        crs.populate(rs);
        return crs;
    }
    
    public CachedRowSet searchReturnSuccess(String keyword) throws SQLException {
        ResultSet rs = executeQuery(ReturnBookQuery.SearchReturnSuccess, "%" + keyword + "%");
        CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet();
        crs.populate(rs);
        return crs;
    }
}
