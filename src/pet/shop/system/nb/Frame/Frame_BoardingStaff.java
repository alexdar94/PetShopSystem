/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet.shop.system.nb.Frame;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
import pet.shop.system.nb.BoardingStaff;
import pet.shop.system.nb.Connect;

/**
 *
 * @author User
 */
public class Frame_BoardingStaff extends javax.swing.JFrame {
private Connection conn=null;
private ResultSet rs=null;
private PreparedStatement pst=null;
private BoardingStaff bs;
    /**
     * Creates new form Frame_BoardingStuff
     */
    public Frame_BoardingStaff() {
        initComponents();
    }

    public Frame_BoardingStaff(BoardingStaff bs) {
        initComponents();
        conn=Connect.connectDB();
        this.bs=bs;
        updateJTable();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_boarding = new javax.swing.JTable();
        btn_last_fed = new javax.swing.JButton();
        btn_update_status = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable_boarding.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID","Pet Name", "Species", "Pet Status", "Last Fed"
            }
        ));
        jTable_boarding.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_boardingMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_boarding);

        btn_last_fed.setText("Update last fed");
        btn_last_fed.setEnabled(false);
        btn_last_fed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_last_fedMouseClicked(evt);
            }
        });

        btn_update_status.setText("Update pet health status");
        btn_update_status.setEnabled(false);
        btn_update_status.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_update_statusMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(btn_last_fed)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_update_status)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_last_fed)
                    .addComponent(btn_update_status))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_boardingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_boardingMouseClicked
        btn_last_fed.setEnabled(true);
        btn_update_status.setEnabled(true);
    }//GEN-LAST:event_jTable_boardingMouseClicked

    private void btn_last_fedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_last_fedMouseClicked
        String id=jTable_boarding.getModel().getValueAt(jTable_boarding.getSelectedRow(), 0).toString();
        bs.updatePetLastFed(id);
        updateJTable();
    }//GEN-LAST:event_btn_last_fedMouseClicked

    private void btn_update_statusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_update_statusMouseClicked
        String id=jTable_boarding.getModel().getValueAt(jTable_boarding.getSelectedRow(), 0).toString();
        Frame_BoardingStaff_Pet_Status fr= new Frame_BoardingStaff_Pet_Status(this,id,bs);
        fr.setVisible(true);
    }//GEN-LAST:event_btn_update_statusMouseClicked

    public void updateJTable(){  
        String sql="SELECT ID,pet_name,pet_species,pet_status,pet_last_fed FROM BoardingServiceTable WHERE appointment_date='"
                +new SimpleDateFormat("MMM dd yyyy").format(new Date()) +"'";
        try{
            pst=conn.prepareStatement(sql);
            rs= pst.executeQuery();
            jTable_boarding.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
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
            java.util.logging.Logger.getLogger(Frame_BoardingStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_BoardingStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_BoardingStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_BoardingStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_BoardingStaff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_last_fed;
    private javax.swing.JButton btn_update_status;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_boarding;
    // End of variables declaration//GEN-END:variables
}
