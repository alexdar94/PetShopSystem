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
import java.util.Date;

/**
 *
 * @author User
 */
public abstract class Owner extends User{

    public static String viewVetNumberOfPetSeen(){
        return "SELECT number_of_dog_seen,number_of_cat_seen,number_of_rabbit_seen,number_of_lizard_seen,number_of_bird_seen "
                + "FROM VetDetails";       
    }
    
    public static String viewProfitReport(){
        return "SELECT Date,Species,Amount,Staff FROM ProfitTable"; 
    }
    
    public static String viewTotalIncomeGenerated(){
        return "SELECT SUM (Amount) AS total FROM ProfitTable";
    }
    
    public static String viewNumberOfPetStayingOvernight(){
        return "SELECT COUNT(appointment_date) AS count FROM BoardingServiceTable WHERE appointment_date='"+new SimpleDateFormat("MMM dd yyyy").format(new Date())+"'";
    }
}
