/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet.shop.system.nb.Enum;

/**
 *
 * @author User
 */
public enum Enum_Species {
     Dog("Dog"),Cat("Cat"),Rabbit("Rabbit"),Lizard("Lizard"),Bird("Bird");
    
     private String species;
     
     private Enum_Species(String species){this.species=species;}
     
     public String toString(){return species;}
}
