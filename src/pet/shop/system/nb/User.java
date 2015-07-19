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
public class User {
    private String username,password;
    private String firstName,lastName,address,contact,email;

    public User(){}
    
    //Super normal customer
    public User(String firstName, String lastName, String address, String contact, String email){
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.contact=contact;
        this.email=email;
    }
    //Super member
    public User(String username, String password, String firstName, String lastName, String address, String contact, String email){
        this.username=username;
        this.password=password;
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.contact=contact;
        this.email=email;
    }
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getContact() {
        return contact;
    }

    public String getEmail() {
        return email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }
    
    public void setLastName(String name) {
        this.lastName = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
