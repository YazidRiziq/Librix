package librix.Frame;

public class HomePage extends javax.swing.JFrame {
    
    CategoryCatalog cc = new CategoryCatalog();
    BookCatalog bc = new BookCatalog();
    LoanList ll = new LoanList();
    MemberList ml = new MemberList();
    OfficerList ol = new OfficerList();
    ReturnTransaction rt = new ReturnTransaction();

    public HomePage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_bookborrowinginput = new javax.swing.JButton();
        btn_categorycatalog = new javax.swing.JButton();
        btn_bookcatalog = new javax.swing.JButton();
        btn_memberlist = new javax.swing.JButton();
        btn_officerlist = new javax.swing.JButton();
        btn_returningbooks = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to Librix");

        btn_bookborrowinginput.setBackground(new java.awt.Color(51, 153, 255));
        btn_bookborrowinginput.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_bookborrowinginput.setForeground(new java.awt.Color(255, 255, 255));
        btn_bookborrowinginput.setText("Book Borrowing");
        btn_bookborrowinginput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bookborrowinginputActionPerformed(evt);
            }
        });

        btn_categorycatalog.setBackground(new java.awt.Color(51, 153, 255));
        btn_categorycatalog.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_categorycatalog.setForeground(new java.awt.Color(255, 255, 255));
        btn_categorycatalog.setText("Category Catalog");
        btn_categorycatalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_categorycatalogActionPerformed(evt);
            }
        });

        btn_bookcatalog.setBackground(new java.awt.Color(51, 153, 255));
        btn_bookcatalog.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_bookcatalog.setForeground(new java.awt.Color(255, 255, 255));
        btn_bookcatalog.setText("Book Catalog");
        btn_bookcatalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bookcatalogActionPerformed(evt);
            }
        });

        btn_memberlist.setBackground(new java.awt.Color(51, 153, 255));
        btn_memberlist.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_memberlist.setForeground(new java.awt.Color(255, 255, 255));
        btn_memberlist.setText("Member List");
        btn_memberlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_memberlistActionPerformed(evt);
            }
        });

        btn_officerlist.setBackground(new java.awt.Color(51, 153, 255));
        btn_officerlist.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_officerlist.setForeground(new java.awt.Color(255, 255, 255));
        btn_officerlist.setText("Officer List");
        btn_officerlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_officerlistActionPerformed(evt);
            }
        });

        btn_returningbooks.setBackground(new java.awt.Color(51, 153, 255));
        btn_returningbooks.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_returningbooks.setForeground(new java.awt.Color(255, 255, 255));
        btn_returningbooks.setText("Book Return");
        btn_returningbooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_returningbooksActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Loan and Return Process");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Library Recording");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_categorycatalog, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_bookborrowinginput, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_bookcatalog, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_memberlist, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_officerlist, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_returningbooks, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_bookborrowinginput, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_returningbooks, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_categorycatalog, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_bookcatalog, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_memberlist, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_officerlist, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden

    private void btn_bookborrowinginputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bookborrowinginputActionPerformed
        ll.setLocationRelativeTo(null);
        ll.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_bookborrowinginputActionPerformed

    private void btn_categorycatalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_categorycatalogActionPerformed
        cc.setLocationRelativeTo(null);
        cc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_categorycatalogActionPerformed

    private void btn_bookcatalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bookcatalogActionPerformed
        bc.setLocationRelativeTo(null);
        bc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_bookcatalogActionPerformed

    private void btn_memberlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_memberlistActionPerformed
        ml.setLocationRelativeTo(null);
        ml.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_memberlistActionPerformed

    private void btn_officerlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_officerlistActionPerformed
        ol.setLocationRelativeTo(null);
        ol.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_officerlistActionPerformed

    private void btn_returningbooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_returningbooksActionPerformed
        rt.setLocationRelativeTo(null);
        rt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_returningbooksActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_bookborrowinginput;
    private javax.swing.JButton btn_bookcatalog;
    private javax.swing.JButton btn_categorycatalog;
    private javax.swing.JButton btn_memberlist;
    private javax.swing.JButton btn_officerlist;
    private javax.swing.JButton btn_returningbooks;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
