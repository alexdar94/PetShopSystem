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
private int numberOfPetSeen;
private Pet pet= new Pet();

    public Vet() {}

    public Vet(String firstName){setFirstName(firstName);setExpertise();}
    
    public Vet(String firstName, String lastName, String address, String contact, String email){
        super(firstName, lastName, address, contact, email);
        setExpertise();
    }
    
    public void petHealthReport(Enum_Species species, Appointment appointment){
        switch(species){
                    case Dog:   Dog dog=new Dog(); pet=(Pet)dog;
                                Frame_Vet_PR_Dog fd=new Frame_Vet_PR_Dog(this,appointment);
                                fd.setVisible(true);break;
                    case Cat:   Frame_Vet_PR_Cat fc=new Frame_Vet_PR_Cat(this,appointment);
                                fc.setVisible(true);break;
                    case Rabbit:Frame_Vet_PR_Rabbit fr=new Frame_Vet_PR_Rabbit(this,appointment);
                                fr.setVisible(true);break;
                    case Lizard:Frame_Vet_PR_Lizard fl=new Frame_Vet_PR_Lizard(this,appointment);
                                fl.setVisible(true);break;
                    case Bird:  Frame_Vet_PR_Bird fb=new Frame_Vet_PR_Bird(this,appointment);
                                fb.setVisible(true);break;
                    default:break;
                }
    }
    
    
    
    public void setExpertise(){
        String sql="SELECT * FROM VetDetails WHERE first_name='"+getFirstName()+"'";
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
    
    public int getNumberOfPetSeen(Enum_Species species){
        String sql="SELECT * FROM VetDetails WHERE first_name='"+getFirstName()+"'";
        conn=Connect.connectDB();
        numberOfPetSeen=0;
        try{
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            
            if(rs.next()){
               switch(species){
                    case Dog:numberOfPetSeen=rs.getInt("number_of_dog_seen");break;
                    case Cat:numberOfPetSeen=rs.getInt("number_of_cat_seen");break;
                    case Rabbit:numberOfPetSeen=rs.getInt("number_of_rabbit_seen");break;
                    case Lizard:numberOfPetSeen=rs.getInt("number_of_lizard_seen");break;
                    case Bird:numberOfPetSeen=rs.getInt("number_of_bird_seen");break;
                    default:numberOfPetSeen=0;break;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return numberOfPetSeen;
    }
    
    public void setNumberOfPetSeen(Enum_Species species){
        numberOfPetSeen=getNumberOfPetSeen(species)+1;
        String sql="UPDATE VetDetails SET number_of_"+species.toString().toLowerCase()+"_seen="+numberOfPetSeen+
                   " WHERE first_name='"+getFirstName()+"'";
        conn=Connect.connectDB();
        try{
                pst=conn.prepareStatement(sql);
                pst.executeUpdate();
            }catch(Exception e){
                e.printStackTrace();
            }
    }
}
