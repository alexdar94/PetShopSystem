/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet.shop.system.nb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author User
 */
public class BoardingStaff extends User{
private Connection conn=null;
private ResultSet rs=null;
private PreparedStatement pst=null;

    public void updatePetStatus(String status, String ID){
        String sql="UPDATE BoardingServiceTable SET pet_status='"+ status+"' WHERE ID='"+ID+"'";
        conn=Connect.connectDB();
            try{
                pst=conn.prepareStatement(sql);
                pst.executeUpdate();
            }catch(Exception e){
                
            }
    }
    
    public void updatePetLastFed(){
        
    }
}
