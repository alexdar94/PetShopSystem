/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet.shop.system.nb.Frame;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import javafx.scene.control.ComboBox;
import javax.swing.*;
import pet.shop.system.nb.Connect;
import pet.shop.system.nb.Vet;

/**
 *
 * @author User
 */
public class Frame_Owner_Create_Working_Timetable extends javax.swing.JFrame {
private Connection conn=null;
private ResultSet rs=null;
private PreparedStatement pst=null;
private List<Boolean> expertiseBooleans1=new ArrayList<Boolean>();
private List<Boolean> expertiseBooleans2=new ArrayList<Boolean>();
private List<Boolean> expertiseBooleans3=new ArrayList<Boolean>();
private List<Vet> vets=new ArrayList<Vet>();
private String[] names={"Wayne Allard","Michael Archinal","Chris Back","Harold William Bennetts","Denis Barberet","Christ Brown","Justin Bieber","Bean Bieber"};
private String[] firstNames={"Wayne","Michael","Chris","Harold","Denis","Christ","Justin","Bean"};
private Boolean[] booleans=new Boolean[7];
    /**
     * Creates new form Frame_Owner_Create_Working_Timetable
     */
    public Frame_Owner_Create_Working_Timetable() {
        initComponents();
        for(int i=0;i<8;i++){
            Vet vet=new Vet(firstNames[i]);
            vets.add(vet);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cb_mon_1 = new javax.swing.JComboBox();
        cb_mon_2 = new javax.swing.JComboBox();
        cb_mon_3 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        cb_tues_1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cb_wed_1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        cb_thurs_1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        cb_fri_1 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        cb_sat_1 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        cb_sun_1 = new javax.swing.JComboBox();
        cb_tues_2 = new javax.swing.JComboBox();
        cb_tues_3 = new javax.swing.JComboBox();
        cb_wed_2 = new javax.swing.JComboBox();
        cb_wed_3 = new javax.swing.JComboBox();
        cb_thurs_2 = new javax.swing.JComboBox();
        cb_thurs_3 = new javax.swing.JComboBox();
        cb_fri_2 = new javax.swing.JComboBox();
        cb_fri_3 = new javax.swing.JComboBox();
        cb_sat_2 = new javax.swing.JComboBox();
        cb_sat_3 = new javax.swing.JComboBox();
        cb_sun_2 = new javax.swing.JComboBox();
        cb_sun_3 = new javax.swing.JComboBox();
        btn_check6 = new javax.swing.JButton();
        btn_check2 = new javax.swing.JButton();
        btn_check3 = new javax.swing.JButton();
        btn_check7 = new javax.swing.JButton();
        btn_check4 = new javax.swing.JButton();
        btn_check5 = new javax.swing.JButton();
        btn_check1 = new javax.swing.JButton();
        btn_timetable_done = new javax.swing.JButton();
        lbl_1 = new javax.swing.JLabel();
        lbl_2 = new javax.swing.JLabel();
        lbl_3 = new javax.swing.JLabel();
        lbl_4 = new javax.swing.JLabel();
        lbl_5 = new javax.swing.JLabel();
        lbl_6 = new javax.swing.JLabel();
        lbl_7 = new javax.swing.JLabel();

        lbl3.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Monday");

        cb_mon_1.setModel(new javax.swing.DefaultComboBoxModel(names));

        cb_mon_2.setModel(new javax.swing.DefaultComboBoxModel(names));

        cb_mon_3.setModel(new javax.swing.DefaultComboBoxModel(names));

        jLabel2.setText("Tuesday");

        cb_tues_1.setModel(new javax.swing.DefaultComboBoxModel(names));

        jLabel3.setText("Wednesday");

        cb_wed_1.setModel(new javax.swing.DefaultComboBoxModel(names));

        jLabel4.setText("Thursday");

        cb_thurs_1.setModel(new javax.swing.DefaultComboBoxModel(names));

        jLabel5.setText("Friday");

        cb_fri_1.setModel(new javax.swing.DefaultComboBoxModel(names));

        jLabel6.setText("Saturday");

        cb_sat_1.setModel(new javax.swing.DefaultComboBoxModel(names));

        jLabel7.setText("Sunday");

        cb_sun_1.setModel(new javax.swing.DefaultComboBoxModel(names));

        cb_tues_2.setModel(new javax.swing.DefaultComboBoxModel(names));

        cb_tues_3.setModel(new javax.swing.DefaultComboBoxModel(names));

        cb_wed_2.setModel(new javax.swing.DefaultComboBoxModel(names));

        cb_wed_3.setModel(new javax.swing.DefaultComboBoxModel(names));

        cb_thurs_2.setModel(new javax.swing.DefaultComboBoxModel(names));

        cb_thurs_3.setModel(new javax.swing.DefaultComboBoxModel(names));

        cb_fri_2.setModel(new javax.swing.DefaultComboBoxModel(names));

        cb_fri_3.setModel(new javax.swing.DefaultComboBoxModel(names));

        cb_sat_2.setModel(new javax.swing.DefaultComboBoxModel(names));

        cb_sat_3.setModel(new javax.swing.DefaultComboBoxModel(names));

        cb_sun_2.setModel(new javax.swing.DefaultComboBoxModel(names));

        cb_sun_3.setModel(new javax.swing.DefaultComboBoxModel(names));

        btn_check6.setText("Check");
        btn_check6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_check6MouseClicked(evt);
            }
        });

        btn_check2.setText("Check");
        btn_check2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_check2MouseClicked(evt);
            }
        });

        btn_check3.setText("Check");
        btn_check3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_check3MouseClicked(evt);
            }
        });

        btn_check7.setText("Check");
        btn_check7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_check7MouseClicked(evt);
            }
        });

        btn_check4.setText("Check");
        btn_check4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_check4MouseClicked(evt);
            }
        });

        btn_check5.setText("Check");
        btn_check5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_check5MouseClicked(evt);
            }
        });

        btn_check1.setText("Check");
        btn_check1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_check1MouseClicked(evt);
            }
        });

        btn_timetable_done.setText("Done");
        btn_timetable_done.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_timetable_doneMouseClicked(evt);
            }
        });

        lbl_1.setText("FALSE");

        lbl_2.setText("FALSE");

        lbl_3.setText("FALSE");

        lbl_4.setText("FALSE");

        lbl_5.setText("FALSE");

        lbl_6.setText("FALSE");

        lbl_7.setText("FALSE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_timetable_done)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cb_mon_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_tues_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cb_mon_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_mon_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_check1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cb_tues_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_tues_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_check2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cb_fri_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cb_thurs_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(cb_wed_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cb_wed_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_wed_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_check3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cb_thurs_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_thurs_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_check4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cb_fri_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_fri_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_check5))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cb_sat_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_sat_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_sat_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_check6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cb_sun_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_sun_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_sun_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_check7)))))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lbl_5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lbl_7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                        .addComponent(lbl_6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cb_mon_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_mon_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_mon_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_check1)
                    .addComponent(lbl_1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cb_tues_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_tues_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_tues_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_check2)
                    .addComponent(lbl_2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(cb_wed_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cb_wed_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cb_wed_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_check3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cb_thurs_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_thurs_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_thurs_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_check4)
                    .addComponent(lbl_4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cb_fri_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_fri_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_fri_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_check5)
                    .addComponent(lbl_5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cb_sat_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_sat_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_sat_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_check6)
                    .addComponent(lbl_6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cb_sun_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_sun_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_sun_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_check7)
                    .addComponent(lbl_7))
                .addGap(114, 114, 114)
                .addComponent(btn_timetable_done)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Vet check(String x){
        switch(x){
            case "Wayne Allard":return vets.get(0);
            case "Michael Archinal":return vets.get(1);
            case "Chris Back":return vets.get(2);
            case "Harold William Bennetts":return vets.get(3);
            case "Denis Barberet":return vets.get(4);
            case "Christ Brown":return vets.get(5);
            case "Justin Bieber":return vets.get(6);
            case "Bean Bieber":return vets.get(7);
            default:return null;
        }
    }
    
    private void assignBoolean(JComboBox cb1,JComboBox cb2,JComboBox cb3, JLabel lbl){
        expertiseBooleans1=check(cb1.getSelectedItem().toString()).getExpertiseBooleans();
        expertiseBooleans2=check(cb2.getSelectedItem().toString()).getExpertiseBooleans();
        expertiseBooleans3=check(cb3.getSelectedItem().toString()).getExpertiseBooleans();
        System.out.println(expertiseBooleans1);
        for(int i=0;i<expertiseBooleans1.size();i++){
            if(expertiseBooleans1.get(i)||expertiseBooleans2.get(i)||expertiseBooleans3.get(i)==true){
                lbl.setText("TRUE");
            }else{
                lbl.setText("FALSE");
                break;
            }     
        }      
    }
    
    private void btn_check1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_check1MouseClicked
        assignBoolean(cb_mon_1, cb_mon_2, cb_mon_3,lbl_1);  
        booleans[0]=lbl_1.getText().equals("TRUE")?true:false;
    }//GEN-LAST:event_btn_check1MouseClicked

    private void btn_check2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_check2MouseClicked
        assignBoolean(cb_tues_1, cb_tues_2, cb_tues_3,lbl_2);
        booleans[1]=lbl_2.getText().equals("TRUE")?true:false;
    }//GEN-LAST:event_btn_check2MouseClicked

    private void btn_check3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_check3MouseClicked
        assignBoolean(cb_wed_1, cb_wed_2, cb_wed_3,lbl_3);
        booleans[2]=lbl_3.getText().equals("TRUE")?true:false;
    }//GEN-LAST:event_btn_check3MouseClicked

    private void btn_check4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_check4MouseClicked
        assignBoolean(cb_thurs_1, cb_thurs_2, cb_thurs_3,lbl_4);
        booleans[3]=lbl_4.getText().equals("TRUE")?true:false;
    }//GEN-LAST:event_btn_check4MouseClicked

    private void btn_check5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_check5MouseClicked
        assignBoolean(cb_fri_1, cb_fri_2, cb_fri_3,lbl_5);
        booleans[4]=lbl_5.getText().equals("TRUE")?true:false;
    }//GEN-LAST:event_btn_check5MouseClicked

    private void btn_check6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_check6MouseClicked
        assignBoolean(cb_sat_1, cb_sat_2, cb_sat_3,lbl_6);
        booleans[5]=lbl_6.getText().equals("TRUE")?true:false;
    }//GEN-LAST:event_btn_check6MouseClicked

    private void btn_check7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_check7MouseClicked
        assignBoolean(cb_sun_1, cb_sun_2, cb_sun_3,lbl_7);
        booleans[6]=lbl_7.getText().equals("TRUE")?true:false;
    }//GEN-LAST:event_btn_check7MouseClicked

    private void btn_timetable_doneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_timetable_doneMouseClicked
        if(booleans[0]==null||booleans[1]==null||booleans[2]==null||booleans[3]==null||booleans[4]==null||booleans[5]==null||booleans[6]==null){
            JOptionPane.showMessageDialog(null, "Please check timetable balance.");
        }else{
            if(booleans[0]&&booleans[1]&&booleans[2]&&booleans[3]&&booleans[4]&&booleans[5]&&booleans[6]==true){
                String sql1="INSERT INTO WorkingTimeTable VALUES('Monday"+"','"+cb_mon_1.getSelectedItem().toString()+"','"+cb_mon_2.getSelectedItem().toString()+"','"+cb_mon_3.getSelectedItem().toString()+"')";
                String sql2="INSERT INTO WorkingTimeTable VALUES('Tuesday"+"','"+cb_tues_1.getSelectedItem().toString()+"','"+cb_tues_2.getSelectedItem().toString()+"','"+cb_tues_3.getSelectedItem().toString()+"')";
                String sql3="INSERT INTO WorkingTimeTable VALUES('Wednesday"+"','"+cb_wed_1.getSelectedItem().toString()+"','"+cb_wed_2.getSelectedItem().toString()+"','"+cb_wed_3.getSelectedItem().toString()+"')";
                String sql4="INSERT INTO WorkingTimeTable VALUES('Thursday"+"','"+cb_thurs_1.getSelectedItem().toString()+"','"+cb_thurs_2.getSelectedItem().toString()+"','"+cb_thurs_3.getSelectedItem().toString()+"')";
                String sql5="INSERT INTO WorkingTimeTable VALUES('Friday"+"','"+cb_fri_1.getSelectedItem().toString()+"','"+cb_fri_2.getSelectedItem().toString()+"','"+cb_fri_3.getSelectedItem().toString()+"')";
                String sql6="INSERT INTO WorkingTimeTable VALUES('Saturday"+"','"+cb_sat_1.getSelectedItem().toString()+"','"+cb_sat_2.getSelectedItem().toString()+"','"+cb_sat_3.getSelectedItem().toString()+"')";
                String sql7="INSERT INTO WorkingTimeTable VALUES('Sunday"+"','"+cb_sun_1.getSelectedItem().toString()+"','"+cb_sun_2.getSelectedItem().toString()+"','"+cb_sun_3.getSelectedItem().toString()+"')";
                List<String> sqls=new ArrayList<String>();
                sqls.add(sql1);sqls.add(sql2);sqls.add(sql3);sqls.add(sql4);sqls.add(sql5);sqls.add(sql6);sqls.add(sql7);
                conn=Connect.connectDB();
                try{
                    for(String sql:sqls){
                        pst=conn.prepareStatement(sql);
                        pst.execute(); 
                    }
                }catch(Exception e){
                    e.printStackTrace();
                }
                JOptionPane.showMessageDialog(null, "Time table saved.");
            }else{
                JOptionPane.showMessageDialog(null, "Time table not balance.");
            }
        }
    }//GEN-LAST:event_btn_timetable_doneMouseClicked

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
            java.util.logging.Logger.getLogger(Frame_Owner_Create_Working_Timetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_Owner_Create_Working_Timetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_Owner_Create_Working_Timetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_Owner_Create_Working_Timetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_Owner_Create_Working_Timetable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_check1;
    private javax.swing.JButton btn_check2;
    private javax.swing.JButton btn_check3;
    private javax.swing.JButton btn_check4;
    private javax.swing.JButton btn_check5;
    private javax.swing.JButton btn_check6;
    private javax.swing.JButton btn_check7;
    private javax.swing.JButton btn_timetable_done;
    private javax.swing.JComboBox cb_fri_1;
    private javax.swing.JComboBox cb_fri_2;
    private javax.swing.JComboBox cb_fri_3;
    private javax.swing.JComboBox cb_mon_1;
    private javax.swing.JComboBox cb_mon_2;
    private javax.swing.JComboBox cb_mon_3;
    private javax.swing.JComboBox cb_sat_1;
    private javax.swing.JComboBox cb_sat_2;
    private javax.swing.JComboBox cb_sat_3;
    private javax.swing.JComboBox cb_sun_1;
    private javax.swing.JComboBox cb_sun_2;
    private javax.swing.JComboBox cb_sun_3;
    private javax.swing.JComboBox cb_thurs_1;
    private javax.swing.JComboBox cb_thurs_2;
    private javax.swing.JComboBox cb_thurs_3;
    private javax.swing.JComboBox cb_tues_1;
    private javax.swing.JComboBox cb_tues_2;
    private javax.swing.JComboBox cb_tues_3;
    private javax.swing.JComboBox cb_wed_1;
    private javax.swing.JComboBox cb_wed_2;
    private javax.swing.JComboBox cb_wed_3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl_1;
    private javax.swing.JLabel lbl_2;
    private javax.swing.JLabel lbl_3;
    private javax.swing.JLabel lbl_4;
    private javax.swing.JLabel lbl_5;
    private javax.swing.JLabel lbl_6;
    private javax.swing.JLabel lbl_7;
    // End of variables declaration//GEN-END:variables
}
