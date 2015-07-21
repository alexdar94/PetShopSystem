/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet.shop.system.nb;

import pet.shop.system.nb.Enum.Enum_Species;
import pet.shop.system.nb.Enum.Enum_Gender;
import pet.shop.system.nb.Enum.Enum_Domestic_Exotic;
import pet.shop.system.nb.Pet.Pet;

/**
 *
 * @author User
 */
public class Customer_Member extends Customer_Normal{
    private Pet pet;
    private static double discount=0.85;
    
    public Customer_Member(String firstName, String lastName, String address, String contact, 
            String email, String username, String password,String petName,String age, String weight,
            Enum_Species species,Enum_Gender gender, Enum_Domestic_Exotic doe){
        super(firstName, lastName, address, contact, email, username, password);
        pet= new Pet(petName,age,weight,species,gender,doe);
    }    
    
    public String getPetName(){
        return pet.getName();
    }
    
    public String getPetAge(){
        return pet.getAge();
    }
    
    public String getPetWeight(){
        return pet.getWeight();
    }
    
    public String getPetGender(){
        return pet.getGender().toString();
    }
    
    public String getPetDoe(){
        return pet.getDoe().toString();
    }
    
    public void setDiscount(double discount){
        this.discount=discount;
    }
    
    public static double getDiscount(){
        return discount;
    }
}
