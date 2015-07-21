/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet.shop.system.nb;

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
}
