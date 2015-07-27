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
import pet.shop.system.nb.Enum.Enum_Domestic_Exotic;
import pet.shop.system.nb.Enum.Enum_Gender;
import pet.shop.system.nb.Enum.Enum_Species;
import pet.shop.system.nb.Pet.Bird;
import pet.shop.system.nb.Pet.Cat;
import pet.shop.system.nb.Pet.Dog;
import pet.shop.system.nb.Pet.Lizard;
import pet.shop.system.nb.Pet.Rabbit;

/**
 *
 * @author User
 */
public class BoardingService extends BusinessEvent{
    private Connection conn=null;
    private PreparedStatement pst=null;
    private ResultSet rs=null;
    private int id;
    private Customer_Normal cn;
    private Date date;
    
    public BoardingService(int id,String firstName, String lastName, String address, String contact, 
            String email, String petName,Enum_Species species,Enum_Domestic_Exotic de, Date date){
        cn= new Customer_Normal(firstName,lastName,address,contact,email,petName,species,de);
        this.id=id;
        this.date=date;   
    }
    
    @Override
    public double getCharge(){
        if(cn.getPet() instanceof Dog){
            return Dog.getCharge(0);
        }else if(cn.getPet() instanceof Cat){
            return Cat.getCharge(0);
        }else if(cn.getPet() instanceof Rabbit){
            return Rabbit.getCharge(0);
        }else if(cn.getPet() instanceof Lizard){
            return Lizard.getCharge(0);
        }else if(cn.getPet() instanceof Bird){
            return Bird.getCharge(0);
        }else{
            return -1;
        }
    }
    
    public double getCharge(double discount){
        if(cn.getPet() instanceof Dog){
            return Dog.getCharge(0)*discount;
        }else if(cn.getPet() instanceof Cat){
            return Cat.getCharge(0)*discount;
        }else if(cn.getPet() instanceof Rabbit){
            return Rabbit.getCharge(0)*discount;
        }else if(cn.getPet() instanceof Lizard){
            return Lizard.getCharge(0)*discount;
        }else if(cn.getPet() instanceof Bird){
            return Bird.getCharge(0)*discount;
        }else{
            return -1;
        }
    }
    
    @Override
    public void payout(){
        if(cn.getPet() instanceof Dog){
            updateProfitReport(Dog.getCharge(0));
        }else if(cn.getPet() instanceof Cat){
            updateProfitReport(Cat.getCharge(0));
        }else if(cn.getPet() instanceof Rabbit){
            updateProfitReport(Rabbit.getCharge(0));
        }else if(cn.getPet() instanceof Lizard){
            updateProfitReport(Lizard.getCharge(0));
        }else if(cn.getPet() instanceof Bird){
            updateProfitReport(Bird.getCharge(0));
        }
    }
    
    public void payout(double discount){
        if(cn.getPet() instanceof Dog){
            updateProfitReport(Dog.getCharge(0)*discount);
        }else if(cn.getPet() instanceof Cat){
            updateProfitReport(Cat.getCharge(0)*discount);
        }else if(cn.getPet() instanceof Rabbit){
            updateProfitReport(Rabbit.getCharge(0)*discount);
        }else if(cn.getPet() instanceof Lizard){
            updateProfitReport(Lizard.getCharge(0)*discount);
        }else if(cn.getPet() instanceof Bird){
            updateProfitReport(Bird.getCharge(0)*discount);
        }
    }
    
    public void updateProfitReport(double amount){
        String sql="INSERT INTO ProfitTable VALUES('"+new SimpleDateFormat("MMM dd yyyy").format(date)+"','"+
                   cn.getPetSpecies()+"',"+amount+",'Boarding Staff')";
        conn=Connect.connectDB();
        try{
        pst=conn.prepareStatement(sql);
        pst.execute();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
