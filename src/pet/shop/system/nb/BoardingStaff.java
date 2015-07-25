/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet.shop.system.nb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author User
 */
public class BoardingStaff extends User{
private Connection conn=null;
private ResultSet rs=null;
private PreparedStatement pst=null;

    public BoardingStaff(){}
    
    public BoardingStaff(String firstName, String lastName, String address, String contact, String email){
        super(firstName, lastName, address, contact, email);
    }
    
    public void updatePetStatus(String status, String ID){
        String sql="UPDATE BoardingServiceTable SET pet_status='"+ status+"' WHERE ID='"+ID+"'";
        query(sql);
    }
    
    public void updatePetLastFed(String id){
        String sql="Update BoardingServiceTable SET pet_last_fed='"+new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime())+
                "' WHERE ID='"+id+"'"; 
        query(sql);
    }
    
    public void query(String sql){
        conn=Connect.connectDB();
        try{
            pst=conn.prepareStatement(sql);
            pst.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
