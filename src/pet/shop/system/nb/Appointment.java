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
import pet.shop.system.nb.Enum.Enum_Species;
import pet.shop.system.nb.Enum.Enum_Domestic_Exotic;
import java.util.Date;
import javax.swing.JOptionPane;
import org.apache.commons.lang.CharRange;
import pet.shop.system.nb.Pet.Bird;
import pet.shop.system.nb.Pet.Cat;
import pet.shop.system.nb.Pet.Dog;
import pet.shop.system.nb.Pet.Lizard;
import pet.shop.system.nb.Pet.Pet;
import pet.shop.system.nb.Pet.Rabbit;

/**
 *
 * @author User
 */
public class Appointment extends BusinessEvent{
    private Connection conn=null;
    private PreparedStatement pst=null;
    private ResultSet rs=null;
    private long id=0;
    private Customer_Normal cn;
    private Date date;
    private String vet, startTime,endTime;
    private double charge;
    
    public Appointment(int id,String firstName, String lastName, String address, String contact, 
            String email, String petName,Enum_Species species,Enum_Domestic_Exotic de, String vet, Date date,String startTime,String endTime){
        cn= new Customer_Normal(firstName,lastName,address,contact,email,petName,species,de);
        this.id=id;
        this.vet=vet;
        this.date=date;
        this.startTime=startTime;
        this.endTime=endTime;
    }
    
    @Override
    public double getCharge(){return 10;}
    
    public void getCharge(double charge){
        this.charge=charge;
    }
    
    public void getCharge(double charge, double discount){
         this.charge=charge*discount;
    }
    
    @Override
    public void payout(){
        updateProfitReport(charge);
    }
    
    public void updateProfitReport(double amount){
        String sql="INSERT INTO ProfitTable VALUES('"+new SimpleDateFormat("MMM dd yyyy").format(date)+"','"+
                   cn.getPetSpecies()+"',"+amount+",'"+vet+"')";
        conn=Connect.connectDB();
        try{
        pst=conn.prepareStatement(sql);
        pst.execute();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
