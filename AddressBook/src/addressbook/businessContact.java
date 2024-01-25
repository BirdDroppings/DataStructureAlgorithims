/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package addressbook;

/**
 *
 * @author dmoc2
 */
public class businessContact extends personDetails {
    
    private String companyName;

    public businessContact(String companyName, String firstName, String lastname, String email, String address, String phoneNum) {
        super(firstName, lastname, email, address, phoneNum);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String getDetails() {
        return super.getDetails()+"\n Company Name: "+companyName; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
    
}
