/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package addressbook;

import java.io.Serializable;

/**
 *
 * @author dmoc2
 */
public class personDetails implements Serializable {
    
    private String firstName;
    private String lastname;
    private String email;
    private String address;
    private String phoneNum;

    public personDetails(String firstName, String lastname, String email, String address, String phoneNum) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.email = email;
        this.address = address;
        this.phoneNum = phoneNum;
    }

    public personDetails() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    
   
    
    
    public String getDetails()
    {
        return "First Name: "+firstName+"\n Surname: "+lastname+"\n Email: "+email+"\n Phone Number: "+phoneNum+"\n Address: "+address;
    }
    
    
}
