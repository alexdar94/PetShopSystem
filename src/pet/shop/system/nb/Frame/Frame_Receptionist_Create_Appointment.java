/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet.shop.system.nb.Frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import net.proteanit.sql.DbUtils;
import org.hsqldb.persist.Log;
import pet.shop.system.nb.Appointment;
import pet.shop.system.nb.Connect;
import pet.shop.system.nb.Enum.Enum_Domestic_Exotic;
import pet.shop.system.nb.Enum.Enum_Species;
/**
 *
 * @author User
 */
public class Frame_Receptionist_Create_Appointment extends javax.swing.JFrame {
Connection conn=null;
PreparedStatement pst=null;
ResultSet rs=null;
private Frame_Receptionist fr;
private SimpleDateFormat obDataFormat = new SimpleDateFormat("MMM dd yyyy");
private int id;
private String id_selected;
private boolean isEdit=false;
private String[] mon=new String[3],tues=new String[3],wed=new String[3],thurs=new String[3],fri=new String[3],sat=new String[3],sun=new String[3];
    /**
     * Creates new form Frame_CreateAppointment
     */
    public Frame_Receptionist_Create_Appointment() {
        initComponents();
    }

    public Frame_Receptionist_Create_Appointment(Frame_Receptionist fr) {
        initComponents();
        this.fr=fr;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        et_owner_first_name = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        et_owner_pet_name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cb_vet = new javax.swing.JComboBox();
        cb_domestic = new javax.swing.JCheckBox();
        cb_exotic = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        cb_time_start = new javax.swing.JComboBox();
        btn_done_appointment = new javax.swing.JButton();
        jdc_appointment = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        et_owner_last_name = new javax.swing.JTextField();
        et_owner_contact = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        et_owner_email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        et_owner_address = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cb_species = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cb_time_end = new javax.swing.JComboBox();
        cb_pet_gender = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cb_day = new javax.swing.JComboBox();
        btn_cancel_appointment = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setText("Owner First Name");

        jLabel6.setText("Date");

        jLabel8.setText("Pet name");

        jLabel9.setText("Vet");

        cb_vet.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));

        cb_domestic.setText("Domestic");

        cb_exotic.setText("Exotic");

        jLabel10.setText("Time");

        cb_time_start.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10 am", "11 am", "12 pm", "1 pm","2 pm","3 pm","4 pm","5 pm","6 pm" }));

        btn_done_appointment.setText("Done");
        btn_done_appointment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_done_appointmentMouseClicked(evt);
            }
        });

        jdc_appointment.setDateFormatString("MMM d, yyy");
        jdc_appointment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jdc_appointmentMouseClicked(evt);
            }
        });

        jLabel3.setText("Owner Last Name");

        jLabel5.setText("Email");

        jLabel4.setText("Address");

        jLabel11.setText("Contact");

        jLabel12.setText("Species");

        cb_species.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dog", "Cat", "Rabbit", "Lizard","Bird" }));

        jLabel13.setText("Start: ");

        jLabel14.setText("End:");

        cb_time_end.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "11 am", "12 pm", "1 pm", "2 pm","3 pm","4 pm","5 pm","6 pm","7 pm" }));

        cb_pet_gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male","Female" }));

        jLabel15.setText("Gender");

        jLabel16.setText("Day ");

        cb_day.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" }));

        btn_cancel_appointment.setText("Cancel");
        btn_cancel_appointment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cancel_appointmentMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel11)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12)
                            .addComponent(jLabel15))
                        .addGap(40, 40, 40))
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(et_owner_contact)
                    .addComponent(et_owner_last_name)
                    .addComponent(et_owner_first_name, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(et_owner_email)
                    .addComponent(et_owner_pet_name)
                    .addComponent(et_owner_address, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cb_domestic)
                        .addGap(18, 18, 18)
                        .addComponent(cb_exotic)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE))
                    .addComponent(cb_species, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_pet_gender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_time_start, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_time_end, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jdc_appointment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_done_appointment, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cancel_appointment, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_day, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_vet, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(115, 115, 115)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(et_owner_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(et_owner_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jdc_appointment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel13)
                                            .addComponent(cb_time_start, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14)
                                            .addComponent(cb_time_end, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(cb_day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel16))
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(et_owner_first_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(et_owner_last_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(et_owner_address, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))
                                        .addGap(18, 18, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(cb_vet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(et_owner_pet_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cb_domestic)
                                    .addComponent(cb_exotic))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cb_species, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addGap(30, 30, 30)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(cb_pet_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_done_appointment, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cancel_appointment, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(379, Short.MAX_VALUE)
                        .addComponent(jLabel7)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_done_appointmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_done_appointmentMouseClicked
        if(isEdit==true){
            if(cb_domestic.isSelected()){
            String sql="Update AppointmentTable set cust_first_name='"+et_owner_first_name.getText()+"',"+
                    "cust_last_name='"+et_owner_last_name.getText()+"',"+
                    "cust_address='"+et_owner_address.getText()+"',"+
                    "cust_contact='"+et_owner_contact.getText()+"',"+
                    "cust_email='"+et_owner_email.getText()+"',"+
                    "pet_name='"+et_owner_pet_name.getText()+"',"+
                    "pet_species='"+cb_species.getSelectedItem().toString()+"',"+
                    "pet_doe='"+ Enum_Domestic_Exotic.Domestic.toString()+"',"+
                    "vet_name='"+cb_vet.getSelectedItem().toString()+"',"+
                    "appointment_date='"+obDataFormat.format(jdc_appointment.getDate())+"',"+
                    "appointment_time_start='"+cb_time_start.getSelectedItem().toString()+"',"+
                    "appointment_time_end='"+cb_time_end.getSelectedItem().toString()+"' "+
                    "WHERE ID='"+id_selected+"'";
                query(sql);
            }else{
                String sql="Update AppointmentTable set cust_first_name='"+et_owner_first_name.getText()+"',"+
                    "cust_last_name='"+et_owner_last_name.getText()+"',"+
                    "cust_address='"+et_owner_address.getText()+"',"+
                    "cust_contact='"+et_owner_contact.getText()+"',"+
                    "cust_email='"+et_owner_email.getText()+"',"+
                    "pet_name='"+et_owner_pet_name.getText()+"',"+
                    "pet_species='"+cb_species.getSelectedItem().toString()+"',"+
                    "pet_doe='"+ Enum_Domestic_Exotic.Exotic.toString()+"',"+
                    "vet_name='"+cb_vet.getSelectedItem().toString()+"',"+
                    "appointment_date='"+obDataFormat.format(jdc_appointment.getDate())+"',"+
                    "appointment_time_start='"+cb_time_start.getSelectedItem().toString()+"',"+
                    "appointment_time_end='"+cb_time_end.getSelectedItem().toString()+"' "+
                    "WHERE ID='"+id_selected+"'";
                query(sql);
            }
            isEdit=false;
            JOptionPane.showMessageDialog(null, "Appointment updated.");
            this.setVisible(false);
        }else{
            //String sql="SELECT TOP 1 * FROM AppointmentTable ORDER BY ID DESC";
            String sql="SELECT * FROM AppointmentTable ORDER BY ID DESC LIMIT 1";
            try{
                pst=conn.prepareStatement(sql);
                rs=pst.executeQuery();
                if(rs.next()){id=Integer.parseInt(rs.getString("ID"));System.out.println(id+"");}
            }catch(Exception e){
                e.printStackTrace();
            }
            
            if(cb_domestic.isSelected()&&cb_exotic.isSelected()){
                JOptionPane.showMessageDialog(null,"Error creating appointment. Please select domestic or exotic.");
            }else if(cb_domestic.isSelected()){
                id++;
                Appointment appointment= new Appointment(id,et_owner_first_name.getText(), et_owner_last_name.getText(), 
                    et_owner_address.getText(), et_owner_contact.getText(), et_owner_email.getText(), 
                    et_owner_pet_name.getText(), Enum_Species.valueOf(cb_species.getSelectedItem().toString()),
                    Enum_Domestic_Exotic.Domestic, cb_vet.getSelectedItem().toString(),
                    jdc_appointment.getDate(), cb_time_start.getSelectedItem().toString(),cb_time_end.getSelectedItem().toString());
                insertToTable(Enum_Domestic_Exotic.Domestic.toString(),cb_species.getSelectedItem().toString());
                JOptionPane.showMessageDialog(null, "Appointment recorded.");
            }else if (cb_exotic.isSelected()){
                id++;
                Appointment appointment= new Appointment(id,et_owner_first_name.getText(), et_owner_last_name.getText(), 
                    et_owner_address.getText(), et_owner_contact.getText(), et_owner_email.getText(), 
                    et_owner_pet_name.getText(), Enum_Species.valueOf(cb_species.getSelectedItem().toString()),
                    Enum_Domestic_Exotic.Exotic, cb_vet.getSelectedItem().toString(),
                    jdc_appointment.getDate(), cb_time_start.getSelectedItem().toString(),cb_time_end.getSelectedItem().toString());
                insertToTable(Enum_Domestic_Exotic.Exotic.toString(),cb_species.getSelectedItem().toString());  
                JOptionPane.showMessageDialog(null, "Appointment recorded.");
            }else{
                JOptionPane.showMessageDialog(null,"Error creating appointment.");
            }
        }
        fr.updateJTable(fr.getJTable_Appointment());
        dispose();
    }//GEN-LAST:event_btn_done_appointmentMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conn=Connect.connectDB();
       
        String sql1="SELECT * FROM WorkingTimeTable WHERE Day='Monday'";
        String sql2="SELECT * FROM WorkingTimeTable WHERE Day='Tuesday'";
        String sql3="SELECT * FROM WorkingTimeTable WHERE Day='Wednesday'";
        String sql4="SELECT * FROM WorkingTimeTable WHERE Day='Thursday'";
        String sql5="SELECT * FROM WorkingTimeTable WHERE Day='Friday'";
        String sql6="SELECT * FROM WorkingTimeTable WHERE Day='Saturday'";
        String sql7="SELECT * FROM WorkingTimeTable WHERE Day='Sunday'";
        List<String> sqls=new ArrayList<String>();
        sqls.add(sql1);sqls.add(sql2);sqls.add(sql3);sqls.add(sql4);sqls.add(sql5);sqls.add(sql6);sqls.add(sql7);
        int count=1;
        for(String sql:sqls){
            try{
                pst=conn.prepareStatement(sql);
                rs= pst.executeQuery();
                if(rs.next()){
                    switch(count){
                        case 1:mon[0]=rs.getString("Vet1");mon[1]=rs.getString("Vet2");mon[2]=rs.getString("Vet3");
                        case 2:tues[0]=rs.getString("Vet1");tues[1]=rs.getString("Vet2");tues[2]=rs.getString("Vet3");
                        case 3:wed[0]=rs.getString("Vet1");wed[1]=rs.getString("Vet2");wed[2]=rs.getString("Vet3");
                        case 4:thurs[0]=rs.getString("Vet1");thurs[1]=rs.getString("Vet2");thurs[2]=rs.getString("Vet3");
                        case 5:fri[0]=rs.getString("Vet1");fri[1]=rs.getString("Vet2");fri[2]=rs.getString("Vet3");
                        case 6:sat[0]=rs.getString("Vet1");sat[1]=rs.getString("Vet2");sat[2]=rs.getString("Vet3");
                        case 7:sun[0]=rs.getString("Vet1");sun[1]=rs.getString("Vet2");sun[2]=rs.getString("Vet3");
                    }
                }
            }catch(Exception e){
                 e.printStackTrace();
            }
            count++;
        }
         
        if(isEdit==true){loadData();}
        cb_day.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch(cb_day.getSelectedItem().toString()){
                    case "Monday":cb_vet.setModel(new javax.swing.DefaultComboBoxModel(mon));break;
                    case "Tuesday":cb_vet.setModel(new javax.swing.DefaultComboBoxModel(tues));break;
                    case "Wednesday":cb_vet.setModel(new javax.swing.DefaultComboBoxModel(wed));break;
                    case "Thursday":cb_vet.setModel(new javax.swing.DefaultComboBoxModel(thurs));break;
                    case "Friday":cb_vet.setModel(new javax.swing.DefaultComboBoxModel(fri));break;
                    case "Saturday":cb_vet.setModel(new javax.swing.DefaultComboBoxModel(sat));break;
                    case "Sunday":cb_vet.setModel(new javax.swing.DefaultComboBoxModel(sun));break;
                }
            }
        });
         
    }//GEN-LAST:event_formWindowOpened

    private void jdc_appointmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jdc_appointmentMouseClicked
        
    }//GEN-LAST:event_jdc_appointmentMouseClicked

    private void btn_cancel_appointmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancel_appointmentMouseClicked
        dispose();
    }//GEN-LAST:event_btn_cancel_appointmentMouseClicked

    private void query(String sql){
        try{
                pst=conn.prepareStatement(sql);
                pst.executeUpdate();
            }catch(Exception e){
                e.printStackTrace();
            }
    }
    
    public void insertToTable(String doe, String species){
        String sql="INSERT INTO AppointmentTable VALUES('"+
                        id+"','"+
                        et_owner_first_name.getText()+"','"+
                        et_owner_last_name.getText()+"','"+
                        et_owner_address.getText()+"','"+
                        et_owner_contact.getText()+"','"+
                        et_owner_email.getText()+"','"+
                        et_owner_pet_name.getText()+"','"+
                        species+"','"+
                        doe+"','"+
                        cb_vet.getSelectedItem().toString()+"','"+
                        obDataFormat.format(jdc_appointment.getDate())+"','"+
                        cb_time_start.getSelectedItem().toString()+"','"+
                        cb_time_end.getSelectedItem().toString()+"')";
        try{
        pst=conn.prepareStatement(sql);
        pst.execute();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public void setID(String id){
        id_selected=id;
        isEdit=true;
    }
    
    public void loadData(){
        String sql="SELECT * FROM AppointmentTable WHERE ID = "+id_selected;
        try{
            pst=conn.prepareStatement(sql);
            rs= pst.executeQuery();
            
            if(rs.next()){
            et_owner_first_name.setText(rs.getString("cust_first_name"));
            et_owner_last_name.setText(rs.getString("cust_last_name"));
            et_owner_address.setText(rs.getString("cust_address"));
            et_owner_contact.setText(rs.getString("cust_contact"));
            et_owner_email.setText(rs.getString("cust_email"));
            et_owner_pet_name.setText(rs.getString("pet_name"));
            cb_species.setSelectedItem(rs.getString("pet_species"));
            if(rs.getString("pet_doe").equals("Domestic")){
                cb_domestic.setSelected(true);
            }else{
                cb_exotic.setSelected(true);    
            }
            cb_vet.setSelectedItem(rs.getString("vet_name"));
            jdc_appointment.setDate(obDataFormat.parse(rs.getString("appointment_date")));
            cb_time_start.setSelectedItem(rs.getString("appointment_time_start"));
            cb_time_end.setSelectedItem(rs.getString("appointment_time_end"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error.");
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
            java.util.logging.Logger.getLogger(Frame_Receptionist_Create_Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_Receptionist_Create_Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_Receptionist_Create_Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_Receptionist_Create_Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_Receptionist_Create_Appointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel_appointment;
    private javax.swing.JButton btn_done_appointment;
    private javax.swing.JComboBox cb_day;
    private javax.swing.JCheckBox cb_domestic;
    private javax.swing.JCheckBox cb_exotic;
    private javax.swing.JComboBox cb_pet_gender;
    private javax.swing.JComboBox cb_species;
    private javax.swing.JComboBox cb_time_end;
    private javax.swing.JComboBox cb_time_start;
    private javax.swing.JComboBox cb_vet;
    private javax.swing.JTextField et_owner_address;
    private javax.swing.JTextField et_owner_contact;
    private javax.swing.JTextField et_owner_email;
    private javax.swing.JTextField et_owner_first_name;
    private javax.swing.JTextField et_owner_last_name;
    private javax.swing.JTextField et_owner_pet_name;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.calendar.JDateChooser jdc_appointment;
    // End of variables declaration//GEN-END:variables
}
