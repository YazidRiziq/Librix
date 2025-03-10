package librix.Controller;
import librix.Query.BookQuery;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

public class BookController extends BaseController {

    public boolean insertProcedure(Object[] params) throws SQLException {
        try {
            executeUpdate(BookQuery.AddBook, params);
            return true;
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    public ResultSet getAllBook() throws SQLException {
        return executeQuery(BookQuery.getAllBook);
    }
    
    public boolean deleteBook(String BookCode) throws SQLException {
        return deleteData(BookQuery.DeleteBook, BookCode);
    }
    
    public boolean updateBook(Object[] params) throws SQLException {
        return executeUpdate(BookQuery.UpdateBook, params) > 0;
    }

    public CachedRowSet searchBook(String keyword) throws SQLException {
        ResultSet rs = executeQuery(BookQuery.SearchBook, "%" + keyword + "%");
        CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet();
        crs.populate(rs);
        return crs;
    }
}

