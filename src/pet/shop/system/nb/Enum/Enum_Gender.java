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
public enum Enum_Gender {
    Male("Male"),Female("Female");
    private String gender;
     
    private Enum_Gender(String gender){this.gender=gender;}
     
    public String toString(){return gender;}
}
