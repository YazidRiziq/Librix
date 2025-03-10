package librix.Controller;
import librix.Query.BookCategoryQuery;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

public class BookCategoryController extends BaseController {
    
    public boolean insertProcedure(Object[] params) throws SQLException {
        try {
            executeUpdate(BookCategoryQuery.AddCategory, params);
            return true;
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    public ResultSet getAllCategory() throws SQLException {
        return executeQuery(BookCategoryQuery.getAllCategory);
    }
    
    public boolean deleteBookCategory(String CatCode) throws SQLException {
        return deleteData(BookCategoryQuery.DeleteBookCategory, CatCode);
    }
    
    public boolean updateCategory(Object[] params) throws SQLException {
        return executeUpdate(BookCategoryQuery.UpdateCategory, params) > 0;
    }
    
    public CachedRowSet searchCategory(String keyword) throws SQLException {
        ResultSet rs = executeQuery(BookCategoryQuery.SearchCategory, "%" + keyword + "%");
        CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet();
        crs.populate(rs);
        return crs;
    }
}
