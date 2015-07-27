/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet.shop.system.nb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Receptionist extends User{
private static Connection conn=null;
private static PreparedStatement pst=null;
private static ResultSet rs=null;

    public Receptionist(){}
    
    public Receptionist(String firstName, String lastName, String address, String contact, String email){
         super(firstName, lastName, address, contact, email);      
         conn=Connect.connectDB();
    }
    
    public void cancelBoarding(String id){
        String sql="DELETE * FROM BoardingServiceTable WHERE ID="+id;
        try{
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Boarding service canceled");           
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void cancelAppointment(String id){
        String sql="DELETE * FROM AppointmentTable WHERE ID="+id;
        try{
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Appointment canceled");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
