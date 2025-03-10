package librix.Frame;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import librix.Controller.OfficerController;
import librix.Helper.BaseTableLoader;
import librix.Helper.Helper;

public class OfficerList extends javax.swing.JFrame {
    private final OfficerController oc = new OfficerController();
    private final BaseTableLoader btl = new BaseTableLoader();
    private final Helper helper = new Helper();
    
    public OfficerList() {
        initComponents();
        loadTable();
        btn_editofficer.setEnabled(false);
        btn_deleteofficer.setEnabled(false);
    }
    
    private void loadTable() {
        try {
            ResultSet rs = oc.getAllOfficer();
            btl.LoadTable(tb_officer, rs);
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
        tb_officer = new javax.swing.JTable();
        btn_addofficer = new javax.swing.JButton();
        btn_editofficer = new javax.swing.JButton();
        btn_deleteofficer = new javax.swing.JButton();
        btn_backofficer = new javax.swing.JButton();
        btn_refreshofficer = new javax.swing.JButton();
        tf_searchofficer = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_searchofficer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Officer List");

        tb_officer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Officer ID", "Name", "Email", "Telp"
            }
        ));
        tb_officer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb_officerMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tb_officer);

        btn_addofficer.setText("Add");
        btn_addofficer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addofficerActionPerformed(evt);
            }
        });

        btn_editofficer.setText("Edit");
        btn_editofficer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editofficerActionPerformed(evt);
            }
        });

        btn_deleteofficer.setBackground(new java.awt.Color(255, 51, 51));
        btn_deleteofficer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_deleteofficer.setText("Delete");
        btn_deleteofficer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteofficerActionPerformed(evt);
            }
        });

        btn_backofficer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_backofficer.setText("Back");
        btn_backofficer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backofficerActionPerformed(evt);
            }
        });

        btn_refreshofficer.setText("Refresh");
        btn_refreshofficer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshofficerActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Officer");

        btn_searchofficer.setText("Search");
        btn_searchofficer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchofficerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_addofficer, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_refreshofficer, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(tf_searchofficer, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_searchofficer, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_editofficer, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_deleteofficer, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_backofficer, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_searchofficer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_searchofficer))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_addofficer)
                        .addComponent(btn_refreshofficer)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_deleteofficer)
                    .addComponent(btn_backofficer)
                    .addComponent(btn_editofficer))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addofficerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addofficerActionPerformed
        OfficerRegistration or = new OfficerRegistration(() -> {
            loadTable();
        });
        or.setLocationRelativeTo(null);
        or.setVisible(true);
    }//GEN-LAST:event_btn_addofficerActionPerformed

    private void btn_refreshofficerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshofficerActionPerformed
        loadTable();
    }//GEN-LAST:event_btn_refreshofficerActionPerformed

    private void btn_backofficerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backofficerActionPerformed
        HomePage hp = new HomePage();
        hp.setLocationRelativeTo(null);
        hp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_backofficerActionPerformed

    private void tb_officerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_officerMousePressed
        if (tb_officer.getSelectedRow() != -1) {
            btn_deleteofficer.setEnabled(true);
            btn_editofficer.setEnabled(true);
        }
    }//GEN-LAST:event_tb_officerMousePressed

    private void btn_deleteofficerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteofficerActionPerformed
        helper.handleDelete(tb_officer, "Officer", primaryKey -> {
            try {
                return oc.deleteOfficer(primaryKey);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
                return false;
            }
        });
        loadTable();
        btn_deleteofficer.setEnabled(false);
    }//GEN-LAST:event_btn_deleteofficerActionPerformed

    private void btn_editofficerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editofficerActionPerformed
        int selectedRow = tb_officer.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih data yang mau diedit!");
            return;
        }
        
        String OffID = tb_officer.getValueAt(selectedRow, 0).toString();
        String OffName = tb_officer.getValueAt(selectedRow, 1).toString();
        String OffEmail = tb_officer.getValueAt(selectedRow, 2).toString();
        String OffTelp = tb_officer.getValueAt(selectedRow, 3).toString();

        EditOfficer edit = new EditOfficer(OffID, OffName, OffEmail, OffTelp);
        edit.setVisible(true);
        edit.setLocationRelativeTo(null);

        edit.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                loadTable();
                btn_editofficer.setEnabled(false); 
            }
        });
    }//GEN-LAST:event_btn_editofficerActionPerformed

    private void btn_searchofficerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchofficerActionPerformed
        String keyword = tf_searchofficer.getText();
        helper.handleSearch(tb_officer, keyword, k -> oc.searchOfficer(k));
    }//GEN-LAST:event_btn_searchofficerActionPerformed

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
            java.util.logging.Logger.getLogger(OfficerList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OfficerList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OfficerList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OfficerList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OfficerList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addofficer;
    private javax.swing.JButton btn_backofficer;
    private javax.swing.JButton btn_deleteofficer;
    private javax.swing.JButton btn_editofficer;
    private javax.swing.JButton btn_refreshofficer;
    private javax.swing.JButton btn_searchofficer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_officer;
    private javax.swing.JTextField tf_searchofficer;
    // End of variables declaration//GEN-END:variables
}
