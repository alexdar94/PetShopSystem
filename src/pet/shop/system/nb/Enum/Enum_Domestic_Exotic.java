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
public enum Enum_Domestic_Exotic {
     Domestic("Domestic"),Exotic("Exotic");
     private String type;
     
     private Enum_Domestic_Exotic(String type){this.type=type;}
     
     public String toString(){return type;}
}
