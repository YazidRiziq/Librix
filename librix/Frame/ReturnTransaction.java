package librix.Frame;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import librix.Helper.BaseTableLoader;
import librix.Controller.ReturnBookController;
import librix.Helper.Helper;
import java.sql.SQLException;

public class ReturnTransaction extends javax.swing.JFrame {
    private final ReturnBookController rbc = new ReturnBookController();
    private final Helper helper = new Helper();
    private final BaseTableLoader btl = new BaseTableLoader();

    public ReturnTransaction() {
        initComponents();
        loadTable1();
        loadTable2();
        btn_bookreturn.setEnabled(false);
    }
    
    private void loadTable1() {
        try {
            ResultSet rs = rbc.getViewReturnBook();
            btl.LoadTable(tb_returntransaction, rs);  
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to load book data: " + e.getMessage());
        }
    }
    
    private void loadTable2() {
        try {
            ResultSet rs = rbc.getViewReturnSuccess();
            btl.LoadTable(tb_returntransactionsucces, rs);  
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to load book data: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_returntransaction = new javax.swing.JTable();
        btn_searchreturn = new javax.swing.JButton();
        btn_bookreturn = new javax.swing.JButton();
        btn_backreturn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tf_searchname = new javax.swing.JTextField();
        btn_refresh = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_returntransactionsucces = new javax.swing.JTable();
        btn_searchreturn1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tf_searchname1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Return Transaction");

        tb_returntransaction.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Copy Code", "Loan Code", "Member Name", "Book Title", "Loan Date", "Return Date"
            }
        ));
        tb_returntransaction.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb_returntransactionMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tb_returntransaction);

        btn_searchreturn.setText("Search");
        btn_searchreturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchreturnActionPerformed(evt);
            }
        });

        btn_bookreturn.setText("Return Book");
        btn_bookreturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bookreturnActionPerformed(evt);
            }
        });

        btn_backreturn.setText("Back");
        btn_backreturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backreturnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Member Name");

        btn_refresh.setText("Refresh");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });

        tb_returntransactionsucces.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Copy Code", "Loan Code", "Member Name", "Book Title", "Actual Return Date", "Overdue Fine"
            }
        ));
        tb_returntransactionsucces.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb_returntransactionsuccesMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tb_returntransactionsucces);

        btn_searchreturn1.setText("Search");
        btn_searchreturn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchreturn1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Member Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(tf_searchname, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_searchreturn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_backreturn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(tf_searchname1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_searchreturn1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btn_bookreturn, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_searchreturn)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_searchname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_refresh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_bookreturn)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_searchreturn1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_searchname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_backreturn)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_bookreturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bookreturnActionPerformed
        String[] keys = helper.getSelectedPrimaryKeyforReturn(tb_returntransaction);
        if (keys == null) return;

        int confirm = JOptionPane.showConfirmDialog(this, 
            "Are you sure you want to return the book with CopyCode: " + keys[0] + " and LoanCode: " + keys[1] + "?",
            "Confirmation", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            try {
                boolean result = rbc.returnBook(keys[0], keys[1]);
                boolean result1 = rbc.addOverdueFine(keys[0], keys[1]);
                if (result && result1) {
                    JOptionPane.showMessageDialog(this, "The book has been successfully returned!");
                    loadTable1();
                    loadTable2();
                    btn_bookreturn.setEnabled(false);
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to return book!");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btn_bookreturnActionPerformed

    private void tb_returntransactionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_returntransactionMousePressed
        if (tb_returntransaction.getSelectedRow() != -1) {
            btn_bookreturn.setEnabled(true);
        }
    }//GEN-LAST:event_tb_returntransactionMousePressed

    private void btn_backreturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backreturnActionPerformed
        HomePage hp = new HomePage();
        hp.setLocationRelativeTo(null);
        hp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_backreturnActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        loadTable1();
        loadTable2();
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void btn_searchreturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchreturnActionPerformed
        String keyword1 = tf_searchname.getText();
        helper.handleSearch(tb_returntransaction, keyword1, k -> rbc.searchReturnBook(k));
    }//GEN-LAST:event_btn_searchreturnActionPerformed

    private void tb_returntransactionsuccesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_returntransactionsuccesMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tb_returntransactionsuccesMousePressed

    private void btn_searchreturn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchreturn1ActionPerformed
        String keyword2 = tf_searchname1.getText();
        helper.handleSearch(tb_returntransactionsucces, keyword2, s -> rbc.searchReturnSuccess(s));
    }//GEN-LAST:event_btn_searchreturn1ActionPerformed

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
            java.util.logging.Logger.getLogger(ReturnTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnTransaction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_backreturn;
    private javax.swing.JButton btn_bookreturn;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_searchreturn;
    private javax.swing.JButton btn_searchreturn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tb_returntransaction;
    private javax.swing.JTable tb_returntransactionsucces;
    private javax.swing.JTextField tf_searchname;
    private javax.swing.JTextField tf_searchname1;
    // End of variables declaration//GEN-END:variables
}
