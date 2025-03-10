package librix.Helper;
import java.sql.SQLException;
import javax.sql.rowset.CachedRowSet;

public interface SearchAction {
    CachedRowSet search(String keyword) throws SQLException;
}
