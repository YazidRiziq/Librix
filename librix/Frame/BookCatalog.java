package librix.Frame;
import librix.Controller.BookController;
import librix.Helper.BaseTableLoader;
import librix.Helper.Helper;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class BookCatalog extends javax.swing.JFrame {
    private final BookController bc = new BookController();
    private final Helper helper = new Helper();
    private final BaseTableLoader btl = new BaseTableLoader();

    public BookCatalog() {
        initComponents();
        loadTable();
        btn_editbook.setEnabled(false);
        btn_deletebook.setEnabled(false);
    }
    
    private void loadTable() {
        try {
            ResultSet rs = bc.getAllBook();
            btl.LoadTable(tb_book, rs);  
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
        tb_book = new javax.swing.JTable();
        btn_addbook = new javax.swing.JButton();
        btn_editbook = new javax.swing.JButton();
        btn_deletebook = new javax.swing.JButton();
        btn_backbook = new javax.swing.JButton();
        btn_refreshbook = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tf_searchbook = new javax.swing.JTextField();
        btn_searchbook = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Book Catalog");

        tb_book.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Book Code", "Category Code", "ISBN", "Title", "Author", "Publisher", "Publication Year", "Number of Pages", "Total Copies"
            }
        ));
        tb_book.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tb_book.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb_bookMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tb_book);

        btn_addbook.setText("Add");
        btn_addbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addbookActionPerformed(evt);
            }
        });

        btn_editbook.setText("Edit");
        btn_editbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editbookActionPerformed(evt);
            }
        });

        btn_deletebook.setBackground(new java.awt.Color(255, 51, 51));
        btn_deletebook.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_deletebook.setText("Delete");
        btn_deletebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deletebookActionPerformed(evt);
            }
        });

        btn_backbook.setText("Back");
        btn_backbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backbookActionPerformed(evt);
            }
        });

        btn_refreshbook.setText("Refresh");
        btn_refreshbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshbookActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Book Title");

        btn_searchbook.setText("Search");
        btn_searchbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchbookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_addbook, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_refreshbook, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(tf_searchbook, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_searchbook, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_editbook, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_deletebook, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_backbook, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_addbook)
                    .addComponent(btn_refreshbook)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_searchbook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_searchbook))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_backbook)
                    .addComponent(btn_deletebook)
                    .addComponent(btn_editbook))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addbookActionPerformed
        AddBook addbook = new AddBook(() -> {
            loadTable();
        });
        addbook.setLocationRelativeTo(null);
        addbook.setVisible(true);
    }//GEN-LAST:event_btn_addbookActionPerformed

    private void btn_refreshbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshbookActionPerformed
        loadTable();
    }//GEN-LAST:event_btn_refreshbookActionPerformed

    private void btn_backbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backbookActionPerformed
        HomePage hp = new HomePage();
        hp.setLocationRelativeTo(null);
        hp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_backbookActionPerformed

    private void btn_deletebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deletebookActionPerformed
        helper.handleDelete(tb_book, "Book", primaryKey -> {
            try {
                return bc.deleteBook(primaryKey);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
                return false;
            }
        });
        loadTable();
        btn_deletebook.setEnabled(false);
    }//GEN-LAST:event_btn_deletebookActionPerformed

    private void tb_bookMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_bookMousePressed
        if (tb_book.getSelectedRow() != -1) {
            btn_deletebook.setEnabled(true);
            btn_editbook.setEnabled(true);
        }
    }//GEN-LAST:event_tb_bookMousePressed

    private void btn_editbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editbookActionPerformed
        int selectedRow = tb_book.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih data yang mau diedit!");
            return;
        }
        
        String BookCode = tb_book.getValueAt(selectedRow, 0).toString();
        String ISBN = tb_book.getValueAt(selectedRow, 2).toString();
        String Title = tb_book.getValueAt(selectedRow, 3).toString();
        String Author = tb_book.getValueAt(selectedRow, 4).toString();
        String Publisher = tb_book.getValueAt(selectedRow, 5).toString();
        int PubYear = Integer.parseInt(tb_book.getValueAt(selectedRow, 6).toString());
        int NumPages = Integer.parseInt(tb_book.getValueAt(selectedRow, 7).toString());
        int TotalCopies = Integer.parseInt(tb_book.getValueAt(selectedRow, 8).toString());

        EditBook edit = new EditBook(BookCode, ISBN, Title, Author, Publisher, PubYear, NumPages, TotalCopies);
        edit.setVisible(true);
        edit.setLocationRelativeTo(null);

        edit.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                loadTable();
                btn_editbook.setEnabled(false); 
            }
        });
    }//GEN-LAST:event_btn_editbookActionPerformed

    private void btn_searchbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchbookActionPerformed
        String keyword = tf_searchbook.getText();
        helper.handleSearch(tb_book, keyword, k -> bc.searchBook(k));
    }//GEN-LAST:event_btn_searchbookActionPerformed

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
            java.util.logging.Logger.getLogger(BookCatalog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookCatalog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookCatalog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookCatalog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookCatalog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addbook;
    private javax.swing.JButton btn_backbook;
    private javax.swing.JButton btn_deletebook;
    private javax.swing.JButton btn_editbook;
    private javax.swing.JButton btn_refreshbook;
    private javax.swing.JButton btn_searchbook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_book;
    private javax.swing.JTextField tf_searchbook;
    // End of variables declaration//GEN-END:variables
}
