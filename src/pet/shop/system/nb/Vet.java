/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet.shop.system.nb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import pet.shop.system.nb.Enum.Enum_Species;
import pet.shop.system.nb.Frame.Frame_Vet_PR_Bird;
import pet.shop.system.nb.Frame.Frame_Vet_PR_Cat;
import pet.shop.system.nb.Frame.Frame_Vet_PR_Dog;
import pet.shop.system.nb.Frame.Frame_Vet_PR_Lizard;
import pet.shop.system.nb.Frame.Frame_Vet_PR_Rabbit;
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
public class Vet extends User{
private Connection conn=null;
private ResultSet rs=null;
private PreparedStatement pst=null;
private List<Enum_Species> expertises= new ArrayList<Enum_Species>();
private List<Boolean> expertisesBooleans= new ArrayList<Boolean>();

    public Vet() {}

    public Vet(String firstName){super.setFirstName(firstName);setExpertise();}
    
    public Vet(String firstName, String lastName, String address, String contact, String email){
        super(firstName, lastName, address, contact, email);
        setExpertise();
    }
    
    public void petHealthReport(Pet p){
        if(p instanceof Dog){
            Frame_Vet_PR_Dog fv=new Frame_Vet_PR_Dog();
            fv.setVisible(true);
        }else if(p instanceof Cat){
            Frame_Vet_PR_Cat fv=new Frame_Vet_PR_Cat();
            fv.setVisible(true);
        }else if(p instanceof Rabbit){
            Frame_Vet_PR_Rabbit fv=new Frame_Vet_PR_Rabbit();
            fv.setVisible(true);
        }else if(p instanceof Lizard){
            Frame_Vet_PR_Lizard fv=new Frame_Vet_PR_Lizard();
            fv.setVisible(true);
        }else if(p instanceof Bird){
            Frame_Vet_PR_Bird fv=new Frame_Vet_PR_Bird();
            fv.setVisible(true);
        }
    }
    
    public String getFirstName(){
        return super.getFirstName();
    }
    
    public String getName(){
        return super.getFirstName()+" "+super.getLastName();
    }
    
    public void setExpertise(){
        String sql="SELECT * FROM VetDetails WHERE first_name='"+super.getFirstName()+"'";
        conn=Connect.connectDB();
        try{
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            
            if(rs.next()){
                if(rs.getBoolean("dog")==true){expertises.add(Enum_Species.Dog);expertisesBooleans.add(true);}else{expertisesBooleans.add(false);}
                if(rs.getBoolean("cat")==true){expertises.add(Enum_Species.Cat);expertisesBooleans.add(true);}else{expertisesBooleans.add(false);}
                if(rs.getBoolean("rabbit")==true){expertises.add(Enum_Species.Rabbit);expertisesBooleans.add(true);}else{expertisesBooleans.add(false);}
                if(rs.getBoolean("lizard")==true){expertises.add(Enum_Species.Lizard);expertisesBooleans.add(true);}else{expertisesBooleans.add(false);}
                if(rs.getBoolean("bird")==true){expertises.add(Enum_Species.Bird);expertisesBooleans.add(true);}else{expertisesBooleans.add(false);}
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public List<Enum_Species> getExpertise(){
        return this.expertises;
    }
    
    public List<Boolean> getExpertiseBooleans(){
        return this.expertisesBooleans;
    }
    
}
