/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet.shop.system.nb;

import pet.shop.system.nb.Enum.Enum_Species;
import pet.shop.system.nb.Enum.Enum_Domestic_Exotic;
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
public class Customer_Normal extends User{
    private Pet pet;
    //Normal customer
    public Customer_Normal(){}
    
    public Customer_Normal(String firstName, String lastName, String address, String contact, 
            String email, String petName,Enum_Species species,Enum_Domestic_Exotic doe){
        super(firstName, lastName, address, contact, email);
        
        switch(species){
            case Dog:pet=new Dog(petName,species,doe);break;
            case Cat:pet=new Cat(petName,species,doe);break;
            case Rabbit:pet=new Rabbit(petName,species,doe);break;
            case Lizard:pet=new Lizard(petName,species,doe);break;
            case Bird:pet=new Bird(petName,species,doe);break;
            default:pet= new Pet(petName,species,doe);break;
        }
    }
    //Super for member
    public Customer_Normal(String firstName, String lastName, String address, String contact, 
            String email,String username, String password){
        super(firstName, lastName, address, contact, email, username, password);
    }
    
    public Pet getPet(){
        return this.pet;
    }
    
    public String getPetSpecies(){
        return pet.getSpecies().toString();
    }
}
