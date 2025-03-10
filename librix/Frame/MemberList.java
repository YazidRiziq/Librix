package librix.Frame;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import librix.Controller.MemberController;
import librix.Helper.BaseTableLoader;
import librix.Helper.Helper;

public class MemberList extends javax.swing.JFrame {
    private final MemberController mc = new MemberController();
    private final BaseTableLoader btl = new BaseTableLoader();
    private final Helper helper = new Helper();

    public MemberList() {
        initComponents();
        loadTable();
        btn_editmember.setEnabled(false);
        btn_deletemember.setEnabled(false);
    }
    
    private void loadTable() {
        try {
            ResultSet rs = mc.getAllMember();
            btl.LoadTable(tb_member, rs);
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
        tb_member = new javax.swing.JTable();
        btn_addmember = new javax.swing.JButton();
        btn_editmember = new javax.swing.JButton();
        btn_deletemember = new javax.swing.JButton();
        btn_backmember = new javax.swing.JButton();
        btn_refreshmember = new javax.swing.JButton();
        tf_searchmember = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_searchmember = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Member List");

        tb_member.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Member ID", "Name", "Email", "Telp", "Address", "Registration Date"
            }
        ));
        tb_member.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb_memberMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tb_member);

        btn_addmember.setText("Add");
        btn_addmember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addmemberActionPerformed(evt);
            }
        });

        btn_editmember.setText("Edit");
        btn_editmember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editmemberActionPerformed(evt);
            }
        });

        btn_deletemember.setBackground(new java.awt.Color(255, 51, 51));
        btn_deletemember.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_deletemember.setText("Delete");
        btn_deletemember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deletememberActionPerformed(evt);
            }
        });

        btn_backmember.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_backmember.setText("Back");
        btn_backmember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backmemberActionPerformed(evt);
            }
        });

        btn_refreshmember.setText("Refresh");
        btn_refreshmember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshmemberActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Member");

        btn_searchmember.setText("Search");
        btn_searchmember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchmemberActionPerformed(evt);
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
                        .addComponent(btn_addmember, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_refreshmember, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(tf_searchmember, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_searchmember, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_editmember, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_deletemember, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_backmember, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
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
                        .addComponent(tf_searchmember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_searchmember))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_addmember)
                        .addComponent(btn_refreshmember)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_editmember, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_backmember)
                        .addComponent(btn_deletemember)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addmemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addmemberActionPerformed
        MemberRegistration mr = new MemberRegistration(() -> {
            loadTable();
        });
        mr.setLocationRelativeTo(null);
        mr.setVisible(true);
    }//GEN-LAST:event_btn_addmemberActionPerformed

    private void btn_refreshmemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshmemberActionPerformed
        loadTable();
    }//GEN-LAST:event_btn_refreshmemberActionPerformed

    private void btn_backmemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backmemberActionPerformed
        HomePage hp = new HomePage();
        hp.setLocationRelativeTo(null);
        hp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_backmemberActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formMousePressed

    private void btn_deletememberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deletememberActionPerformed
        helper.handleDelete(tb_member, "Member", primaryKey -> {
            try {
                return mc.deleteMember(primaryKey);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
                return false;
            }
        });
        loadTable();
        btn_deletemember.setEnabled(false);
    }//GEN-LAST:event_btn_deletememberActionPerformed

    private void tb_memberMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_memberMousePressed
        if (tb_member.getSelectedRow() != -1) {
            btn_deletemember.setEnabled(true);
            btn_editmember.setEnabled(true);
        }
    }//GEN-LAST:event_tb_memberMousePressed

    private void btn_editmemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editmemberActionPerformed
        int selectedRow = tb_member.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih data yang mau diedit!");
            return;
        }
        
        String MemID = tb_member.getValueAt(selectedRow, 0).toString();
        String MemName = tb_member.getValueAt(selectedRow, 1).toString();
        String MemEmail = tb_member.getValueAt(selectedRow, 2).toString();
        String MemTelp = tb_member.getValueAt(selectedRow, 3).toString();
        String MemAddress = tb_member.getValueAt(selectedRow, 4).toString();

        EditMember edit = new EditMember(MemID, MemName, MemEmail, MemTelp, MemAddress);
        edit.setVisible(true);
        edit.setLocationRelativeTo(null);

        edit.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                loadTable();
                btn_editmember.setEnabled(false); 
            }
        });
    }//GEN-LAST:event_btn_editmemberActionPerformed

    private void btn_searchmemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchmemberActionPerformed
        String keyword = tf_searchmember.getText();
        helper.handleSearch(tb_member, keyword, k -> mc.searchMember(k));
    }//GEN-LAST:event_btn_searchmemberActionPerformed

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
            java.util.logging.Logger.getLogger(MemberList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemberList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemberList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemberList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addmember;
    private javax.swing.JButton btn_backmember;
    private javax.swing.JButton btn_deletemember;
    private javax.swing.JButton btn_editmember;
    private javax.swing.JButton btn_refreshmember;
    private javax.swing.JButton btn_searchmember;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_member;
    private javax.swing.JTextField tf_searchmember;
    // End of variables declaration//GEN-END:variables
}
