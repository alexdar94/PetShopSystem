/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet.shop.system.nb.Pet;

import java.util.Date;
import pet.shop.system.nb.Enum.Enum_Domestic_Exotic;
import pet.shop.system.nb.Enum.Enum_Gender;
import pet.shop.system.nb.Enum.Enum_Species;

/**
 *
 * @author User
 */
public class Pet {
    private String name,age,weight;
    private Enum_Domestic_Exotic doe;
    private Enum_Species species;
    private Enum_Gender gender;
    
    public Pet(){}
    //Normal customer pet
    public Pet(String name,Enum_Species species,Enum_Domestic_Exotic doe){
        this.name=name;
        this.doe=doe;
        this.species=species;
    }
    
    //Member customer pet
    public Pet(String name, String age, String weight,Enum_Species species, Enum_Gender gender, Enum_Domestic_Exotic doe){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.species=species;
        this.gender=gender;
        this.doe=doe;
    }
    
    public static double getCharge(){return 0;}
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Enum_Species getSpecies() {
        return species;
    }

    public void setSpecies(Enum_Species species) {
        this.species = species;
    }

    public Enum_Gender getGender() {
        return gender;
    }

    public void setGender(Enum_Gender gender) {
        this.gender = gender;
    }

     public Enum_Domestic_Exotic getDoe() {
        return doe;
    }

    public void setDoe(Enum_Domestic_Exotic doe) {
        this.doe = doe;
    }
    
}
