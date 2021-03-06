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
public class Frame_Owner_Choose_User extends javax.swing.JFrame {

    /**
     * Creates new form Frame_Owner_Choose_User
     */
    public Frame_Owner_Choose_User() {
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

        btn_new_receptionist = new javax.swing.JButton();
        btn_new_boarding_staff = new javax.swing.JButton();
        btn_new_vet = new javax.swing.JButton();
        btn_new_member = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_new_receptionist.setText("Receptionist");
        btn_new_receptionist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_new_receptionistMouseClicked(evt);
            }
        });

        btn_new_boarding_staff.setText("Boarding Staff");
        btn_new_boarding_staff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_new_boarding_staffMouseClicked(evt);
            }
        });

        btn_new_vet.setText("Vet");
        btn_new_vet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_new_vetMouseClicked(evt);
            }
        });

        btn_new_member.setText("Member");
        btn_new_member.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_new_memberMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_new_boarding_staff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_new_vet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_new_member, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_new_receptionist, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(btn_new_receptionist)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_new_boarding_staff)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_new_vet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_new_member)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_new_receptionistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_new_receptionistMouseClicked
        Frame_Owner_Create_New_User fr=new Frame_Owner_Create_New_User("receptionist");
        fr.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_new_receptionistMouseClicked

    private void btn_new_boarding_staffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_new_boarding_staffMouseClicked
        Frame_Owner_Create_New_User fr=new Frame_Owner_Create_New_User("boarding staff");
        fr.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_new_boarding_staffMouseClicked

    private void btn_new_vetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_new_vetMouseClicked
        Frame_Owner_Create_New_User fr=new Frame_Owner_Create_New_User("vet");
        fr.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_new_vetMouseClicked

    private void btn_new_memberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_new_memberMouseClicked
        Frame_Owner_Create_New_User fr=new Frame_Owner_Create_New_User("member");
        fr.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_new_memberMouseClicked

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
            java.util.logging.Logger.getLogger(Frame_Owner_Choose_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_Owner_Choose_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_Owner_Choose_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_Owner_Choose_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_Owner_Choose_User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_new_boarding_staff;
    private javax.swing.JButton btn_new_member;
    private javax.swing.JButton btn_new_receptionist;
    private javax.swing.JButton btn_new_vet;
    // End of variables declaration//GEN-END:variables
}
