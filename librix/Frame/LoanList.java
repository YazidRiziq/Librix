package librix.Frame;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import librix.Controller.BorrowingController;
import librix.Helper.BaseTableLoader;
import librix.Helper.Helper;

public class LoanList extends javax.swing.JFrame {
    private final BorrowingController bc = new BorrowingController();
    private final Helper helper = new Helper();
    private final BaseTableLoader btl = new BaseTableLoader();

    public LoanList() {
        initComponents();
        loadTable1();
        loadTable2();
        btn_deleteloan.setEnabled(false);
    }
    
    private void loadTable1() {
        try {
            ResultSet rs = bc.getAllBorrowing();
            btl.LoadTable(tb_loan, rs);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal load data buku: " + e.getMessage());
        }
    }
    
    private void loadTable2() {
        try {
            ResultSet rs = bc.getAllBookStatistic();
            btl.LoadTable(tb_bookstatistic, rs);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal load data buku: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_backloan = new javax.swing.JButton();
        btn_deleteloan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_loan = new javax.swing.JTable();
        btn_addloan = new javax.swing.JButton();
        btn_refreshloan = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_bookstatistic = new javax.swing.JTable();
        tf_searchname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_searchloan = new javax.swing.JButton();
        tf_searchname1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btn_searchloan1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_backloan.setText("Back");
        btn_backloan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backloanActionPerformed(evt);
            }
        });

        btn_deleteloan.setBackground(new java.awt.Color(255, 51, 51));
        btn_deleteloan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_deleteloan.setText("Delete");
        btn_deleteloan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteloanActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Loan List");

        tb_loan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Loan Code", "Officer Name", "Member Name", "Loan Date", "Return Date"
            }
        ));
        tb_loan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb_loanMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tb_loan);

        btn_addloan.setText("Add");
        btn_addloan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addloanActionPerformed(evt);
            }
        });

        btn_refreshloan.setText("Refresh");
        btn_refreshloan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshloanActionPerformed(evt);
            }
        });

        tb_bookstatistic.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Book Title", "Total Books", "Available Books", "Borrowed Books"
            }
        ));
        tb_bookstatistic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb_bookstatisticMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tb_bookstatistic);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Member Name");

        btn_searchloan.setText("Search");
        btn_searchloan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchloanActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Book Title");

        btn_searchloan1.setText("Search");
        btn_searchloan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchloan1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn_addloan, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(tf_searchname, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btn_searchloan, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btn_deleteloan, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_backloan, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btn_refreshloan, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(tf_searchname1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btn_searchloan1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_searchloan1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_searchname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_refreshloan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_addloan)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_searchloan)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_searchname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_deleteloan)
                    .addComponent(btn_backloan))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addloanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addloanActionPerformed
        BookLending bl = new BookLending(() -> {
            loadTable1();
            loadTable2();
        });
        bl.setLocationRelativeTo(null);
        bl.setVisible(true);
    }//GEN-LAST:event_btn_addloanActionPerformed

    private void btn_refreshloanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshloanActionPerformed
        loadTable1();
        loadTable2();
    }//GEN-LAST:event_btn_refreshloanActionPerformed

    private void btn_backloanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backloanActionPerformed
        HomePage hp = new HomePage();
        hp.setLocationRelativeTo(null);
        hp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_backloanActionPerformed

    private void tb_loanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_loanMousePressed
        if (tb_loan.getSelectedRow() != -1) {
            btn_deleteloan.setEnabled(true);
        }
    }//GEN-LAST:event_tb_loanMousePressed

    private void btn_deleteloanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteloanActionPerformed
        helper.handleDelete(tb_loan, "Book Lending", primaryKey -> {
            try {
                return bc.deleteBorrowing(primaryKey);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
                return false;
            }
        });
        loadTable1();
        btn_deleteloan.setEnabled(false);
    }//GEN-LAST:event_btn_deleteloanActionPerformed

    private void tb_bookstatisticMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_bookstatisticMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tb_bookstatisticMousePressed

    private void btn_searchloanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchloanActionPerformed
        String keyword1 = tf_searchname.getText();
        helper.handleSearch(tb_loan, keyword1, k -> bc.searchLoanList(k));
    }//GEN-LAST:event_btn_searchloanActionPerformed

    private void btn_searchloan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchloan1ActionPerformed
        String keyword2 = tf_searchname1.getText();
        helper.handleSearch(tb_bookstatistic, keyword2, k -> bc.searchBookStatistic(k));
    }//GEN-LAST:event_btn_searchloan1ActionPerformed

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
            java.util.logging.Logger.getLogger(LoanList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoanList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoanList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoanList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoanList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addloan;
    private javax.swing.JButton btn_backloan;
    private javax.swing.JButton btn_deleteloan;
    private javax.swing.JButton btn_refreshloan;
    private javax.swing.JButton btn_searchloan;
    private javax.swing.JButton btn_searchloan1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tb_bookstatistic;
    private javax.swing.JTable tb_loan;
    private javax.swing.JTextField tf_searchname;
    private javax.swing.JTextField tf_searchname1;
    // End of variables declaration//GEN-END:variables
}
