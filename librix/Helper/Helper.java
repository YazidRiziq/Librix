package librix.Helper;
import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.rowset.CachedRowSet;

public class Helper {
    public int parseIntWithValidation(String input, String fieldName) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, fieldName + " must be a number!");
            return -1;
        }
    }
    
    public String getSelectedPrimaryKey(JTable table) {
        int selectedRow = table.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select the data first!");
            return null;
        }
        return table.getValueAt(selectedRow, 0).toString();
    }
    
    public void handleDelete(JTable table, String itemName, DeleteAction action) {
        String primaryKey = getSelectedPrimaryKey(table);
        if (primaryKey == null) return;

        int confirm = JOptionPane.showConfirmDialog(
            null, 
            "Are you sure you want to delete " + itemName + " with the code: " + primaryKey + "?", 
            "Confirmation", 
            JOptionPane.YES_NO_OPTION
        );

        if (confirm == JOptionPane.YES_OPTION) {
            boolean result = action.delete(primaryKey);
            if (result) {
                JOptionPane.showMessageDialog(null, itemName + " was successfully deleted!");
            } else {
                JOptionPane.showMessageDialog(null, "Failed to delete " + itemName + "!");
            }
        }
    }
    
    public String[] getSelectedPrimaryKeyforReturn(JTable table) {
        int selectedRow = table.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select the data first!");
            return null;
        }
        String copyCode = table.getValueAt(selectedRow, 0).toString();
        String loanCode = table.getValueAt(selectedRow, 1).toString();
        return new String[]{copyCode, loanCode};
    }
    
    public void handleSearch(JTable table, String keyword, SearchAction action) {
        if (keyword.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter search keywords!");
            return;
        }

        try {
            CachedRowSet rs = action.search(keyword);
            if (rs != null && rs.size() > 0) {
                BaseTableLoader loader = new BaseTableLoader();
                loader.LoadTable(table, rs);
            } else {
                JOptionPane.showMessageDialog(null, "Data not found!");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed to perform search: " + e.getMessage());
        }
    }
}
