package librix.Frame;
import librix.Controller.BookCategoryController;
import librix.Helper.BaseTableLoader;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import librix.Helper.Helper;

public class CategoryCatalog extends javax.swing.JFrame {
    private final BookCategoryController bcc = new BookCategoryController();
    private final BaseTableLoader btl = new BaseTableLoader();
    private final Helper helper = new Helper();

    public CategoryCatalog() {
        initComponents();
        loadTable();
        btn_editcategory.setEnabled(false);
        btn_deletecategory.setEnabled(false);
    }
    
    private void loadTable() {
        try {
            ResultSet rs = bcc.getAllCategory();
            btl.LoadTable(tb_category, rs);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal load data buku: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_category = new javax.swing.JTable();
        btn_addcategory = new javax.swing.JButton();
        btn_editcategory = new javax.swing.JButton();
        btn_backcategory = new javax.swing.JButton();
        btn_deletecategory = new javax.swing.JButton();
        btn_refreshcategory = new javax.swing.JButton();
        tf_searchcategory = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_searchcategory = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Category Catalog");

        tb_category.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Categoty Code", "Category Name"
            }
        ));
        tb_category.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb_categoryMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tb_category);

        btn_addcategory.setText("Add");
        btn_addcategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addcategoryActionPerformed(evt);
            }
        });

        btn_editcategory.setText("Edit");
        btn_editcategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editcategoryActionPerformed(evt);
            }
        });

        btn_backcategory.setText("Back");
        btn_backcategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backcategoryActionPerformed(evt);
            }
        });

        btn_deletecategory.setBackground(new java.awt.Color(255, 0, 0));
        btn_deletecategory.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_deletecategory.setText("Delete");
        btn_deletecategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deletecategoryActionPerformed(evt);
            }
        });

        btn_refreshcategory.setText("Refresh");
        btn_refreshcategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshcategoryActionPerformed(evt);
            }
        });

        jLabel2.setText("Category");

        btn_searchcategory.setText("Search");
        btn_searchcategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchcategoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_refreshcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_searchcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_editcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_deletecategory, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_backcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_addcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(tf_searchcategory)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_addcategory)
                    .addComponent(tf_searchcategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_refreshcategory)
                    .addComponent(btn_searchcategory))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_backcategory)
                    .addComponent(btn_deletecategory)
                    .addComponent(btn_editcategory))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addcategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addcategoryActionPerformed
        AddCategory ac = new AddCategory(() -> {
            loadTable();
        });
        ac.setLocationRelativeTo(null);
        ac.setVisible(true);
    }//GEN-LAST:event_btn_addcategoryActionPerformed

    private void btn_refreshcategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshcategoryActionPerformed
        loadTable();
    }//GEN-LAST:event_btn_refreshcategoryActionPerformed

    private void btn_deletecategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deletecategoryActionPerformed
        helper.handleDelete(tb_category, "Book Category", primaryKey -> {
            try {
                return bcc.deleteBookCategory(primaryKey);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
                return false;
            }
        });
        loadTable();
        btn_deletecategory.setEnabled(false);
    }//GEN-LAST:event_btn_deletecategoryActionPerformed

    private void btn_backcategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backcategoryActionPerformed
        HomePage hp = new HomePage();
        hp.setLocationRelativeTo(null);
        hp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_backcategoryActionPerformed

    private void tb_categoryMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_categoryMousePressed
        if (tb_category.getSelectedRow() != -1) {
            btn_deletecategory.setEnabled(true);
            btn_editcategory.setEnabled(true);
        }
    }//GEN-LAST:event_tb_categoryMousePressed

    private void btn_editcategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editcategoryActionPerformed
        int selectedRow = tb_category.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih data yang mau diedit!");
            return;
        }
        
        String CatCode = tb_category.getValueAt(selectedRow, 0).toString();
        String CatName = tb_category.getValueAt(selectedRow, 1).toString();

        EditCategory edit = new EditCategory(CatCode, CatName);
        edit.setVisible(true);
        edit.setLocationRelativeTo(null);

        edit.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                loadTable();
                btn_editcategory.setEnabled(false); 
            }
        });
    }//GEN-LAST:event_btn_editcategoryActionPerformed

    private void btn_searchcategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchcategoryActionPerformed
        String keyword = tf_searchcategory.getText();
        helper.handleSearch(tb_category, keyword, k -> bcc.searchCategory(k));
    }//GEN-LAST:event_btn_searchcategoryActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CategoryCatalog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CategoryCatalog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CategoryCatalog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CategoryCatalog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CategoryCatalog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addcategory;
    private javax.swing.JButton btn_backcategory;
    private javax.swing.JButton btn_deletecategory;
    private javax.swing.JButton btn_editcategory;
    private javax.swing.JButton btn_refreshcategory;
    private javax.swing.JButton btn_searchcategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_category;
    private javax.swing.JTextField tf_searchcategory;
    // End of variables declaration//GEN-END:variables
}
