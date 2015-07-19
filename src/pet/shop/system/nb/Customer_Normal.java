/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet.shop.system.nb;

import pet.shop.system.nb.Enum.Enum_Species;
import pet.shop.system.nb.Enum.Enum_Domestic_Exotic;
import pet.shop.system.nb.Pet.Pet;

/**
 *
 * @author User
 */
public class Customer_Normal extends User{
    private Pet pet;
    //Normal customer
    public Customer_Normal(String firstName, String lastName, String address, String contact, 
            String email, String petName,Enum_Species species,Enum_Domestic_Exotic doe){
        super(firstName, lastName, address, contact, email);
        pet=new Pet(petName,species,doe);
    }
    //Super for member
    public Customer_Normal(String firstName, String lastName, String address, String contact, 
            String email,String username, String password){
        super(firstName, lastName, address, contact, email, username, password);
    }
    
}
