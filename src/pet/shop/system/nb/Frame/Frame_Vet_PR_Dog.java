/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet.shop.system.nb.Frame;

import pet.shop.system.nb.Enum.Enum_Species;
import pet.shop.system.nb.Appointment;
import pet.shop.system.nb.Pet.Dog;
import pet.shop.system.nb.Pet.Pet;
import pet.shop.system.nb.Vet;

/**
 *
 * @author User
 */
public class Frame_Vet_PR_Dog extends javax.swing.JFrame {
private Vet vet;
private Appointment appointment;
    /**
     * Creates new form Frame_Vet_HR_Dog
     */
    public Frame_Vet_PR_Dog() {
        initComponents();
    }

    public Frame_Vet_PR_Dog(Vet vet, Appointment appointment) {
        initComponents();
        this.vet=vet;
        this.appointment=appointment;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        yes6 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        no6 = new javax.swing.JCheckBox();
        yes3 = new javax.swing.JCheckBox();
        no3 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        yes5 = new javax.swing.JCheckBox();
        yes1 = new javax.swing.JCheckBox();
        no5 = new javax.swing.JCheckBox();
        no1 = new javax.swing.JCheckBox();
        yes4 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        no4 = new javax.swing.JCheckBox();
        yes2 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        no2 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        btn_diagnosis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        yes6.setText("Yes");

        jLabel3.setText("Coughing, sneezing or gagging?");

        no6.setText("No");

        yes3.setText("Yes");

        no3.setText("No");

        jLabel4.setText("Bad breath?");

        jLabel5.setText("Hair loss?");

        jLabel1.setText("Spayed or neutered: ");

        yes5.setText("Yes");

        yes1.setText("Yes");

        no5.setText("No");

        no1.setText("No");

        yes4.setText("Yes");

        jLabel2.setText("Any recent vomitting?");

        no4.setText("No");

        yes2.setText("Yes");

        jLabel6.setText("Diarrhea");

        no2.setText("No");

        jLabel7.setText("Prognosis");

        btn_diagnosis.setText("Diagnosis");
        btn_diagnosis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_diagnosisMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(yes1)
                                .addGap(18, 18, 18)
                                .addComponent(no1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(yes2)
                                .addGap(18, 18, 18)
                                .addComponent(no2))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addComponent(yes3)
                        .addGap(18, 18, 18)
                        .addComponent(no3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(yes5)
                        .addGap(18, 18, 18)
                        .addComponent(no5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(yes4)
                        .addGap(18, 18, 18)
                        .addComponent(no4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(btn_diagnosis))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(yes6)
                                .addGap(18, 18, 18)
                                .addComponent(no6)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(yes1)
                    .addComponent(no1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(yes2)
                    .addComponent(no2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(yes3)
                    .addComponent(no3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(yes4)
                    .addComponent(no4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(yes5)
                    .addComponent(no5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yes6)
                    .addComponent(no6)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(btn_diagnosis)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_diagnosisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_diagnosisMouseClicked
        Frame_Vet_DR dr= new Frame_Vet_DR(vet,Enum_Species.Dog,appointment);
        dr.setVisible(true);
    }//GEN-LAST:event_btn_diagnosisMouseClicked

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
            java.util.logging.Logger.getLogger(Frame_Vet_PR_Dog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_Vet_PR_Dog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_Vet_PR_Dog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_Vet_PR_Dog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_Vet_PR_Dog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_diagnosis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JCheckBox no1;
    private javax.swing.JCheckBox no2;
    private javax.swing.JCheckBox no3;
    private javax.swing.JCheckBox no4;
    private javax.swing.JCheckBox no5;
    private javax.swing.JCheckBox no6;
    private javax.swing.JCheckBox yes1;
    private javax.swing.JCheckBox yes2;
    private javax.swing.JCheckBox yes3;
    private javax.swing.JCheckBox yes4;
    private javax.swing.JCheckBox yes5;
    private javax.swing.JCheckBox yes6;
    // End of variables declaration//GEN-END:variables
}
