/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet.shop.system.nb.Frame;

/**
 *
 * @author User
 */
public class Frame_Owner extends javax.swing.JFrame {

    /**
     * Creates new form Frame_Owner
     */
    public Frame_Owner() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_register_user = new javax.swing.JButton();
        btn_register_user1 = new javax.swing.JButton();
        btn_register_user2 = new javax.swing.JButton();
        btn_register_user3 = new javax.swing.JButton();
        btn_register_user4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_register_user.setText("Register New User");
        btn_register_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_register_userMouseClicked(evt);
            }
        });

        btn_register_user1.setText("Create vet working timetable");
        btn_register_user1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_register_user1MouseClicked(evt);
            }
        });

        btn_register_user2.setText("View pets staying overnight");
        btn_register_user2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_register_user2MouseClicked(evt);
            }
        });

        btn_register_user3.setText("View income");
        btn_register_user3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_register_user3MouseClicked(evt);
            }
        });

        btn_register_user4.setText("View pets seen by vet");
        btn_register_user4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_register_user4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_register_user1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_register_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_register_user2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_register_user3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_register_user4, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(116, 116, 116))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(btn_register_user)
                .addGap(18, 18, 18)
                .addComponent(btn_register_user1)
                .addGap(18, 18, 18)
                .addComponent(btn_register_user2)
                .addGap(18, 18, 18)
                .addComponent(btn_register_user3)
                .addGap(18, 18, 18)
                .addComponent(btn_register_user4)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_register_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_register_userMouseClicked
        Frame_Owner_Choose_User focu= new Frame_Owner_Choose_User();
        focu.setVisible(true);
    }//GEN-LAST:event_btn_register_userMouseClicked

    private void btn_register_user1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_register_user1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_register_user1MouseClicked

    private void btn_register_user2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_register_user2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_register_user2MouseClicked

    private void btn_register_user3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_register_user3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_register_user3MouseClicked

    private void btn_register_user4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_register_user4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_register_user4MouseClicked

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
            java.util.logging.Logger.getLogger(Frame_Owner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_Owner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_Owner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_Owner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_Owner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_register_user;
    private javax.swing.JButton btn_register_user1;
    private javax.swing.JButton btn_register_user2;
    private javax.swing.JButton btn_register_user3;
    private javax.swing.JButton btn_register_user4;
    // End of variables declaration//GEN-END:variables
}
