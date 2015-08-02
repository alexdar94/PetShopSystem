/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet.shop.system.nb.Pet;

import pet.shop.system.nb.Enum.Enum_Domestic_Exotic;
import pet.shop.system.nb.Enum.Enum_Species;

/**
 *
 * @author User
 */
public class Lizard extends Pet{
private static double charge_boarding=40;

    public Lizard(){} 
    
    public Lizard(String name,Enum_Species species,Enum_Domestic_Exotic doe) {
        super(name, species, doe);
    }
    
    public static double getCharge(){
            return charge_boarding;
    }
}
