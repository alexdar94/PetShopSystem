/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet.shop.system.nb;

import pet.shop.system.nb.Enum.Enum_Species;
import pet.shop.system.nb.Enum.Enum_Domestic_Exotic;
import java.util.Date;

/**
 *
 * @author User
 */
public class Appointment {
    private int id;
    private Customer_Normal cn;
    private Date date;
    private String vet, time;
    
    public Appointment(int id,String firstName, String lastName, String address, String contact, 
            String email, String petName,Enum_Species species,Enum_Domestic_Exotic de, String vet, Date date,String time){
        cn= new Customer_Normal(firstName,lastName,address,contact,email,petName,species,de);
        this.id=id;
        this.vet=vet;
        this.date=date;
        this.time=time;
    }
    
}
