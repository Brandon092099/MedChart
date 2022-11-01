/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.MedChart.User;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Brandon George
 */

@Entity
@Table(name = "med_staff")
public class Receptionist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, name = "first_Name", unique = false, length = 26)
    private String firstName;

    @Column(nullable = false, name = "last_Name", unique = false, length = 26)
    private String lastName;

    @Column(nullable = false, name = "email", unique = false, length = 26)
    private String email;

    @Column(nullable = false, name = "username", unique = false, length = 26)
    private String username;

    @Column(nullable = false, name = "phone", unique = false, length = 26)
    private String phone;

    @Column(nullable = false, name = "password", unique = false, length = 26)
    private String password;

    @Column(nullable = false, name = "address", unique = false, length = 26)
    private String address;

    @Column(nullable = false, name = "emergency_Contact", unique = false, length = 26)
    private String emergencyContact;

    @Column(nullable = false, name = "emergency_Contact_Num", unique = false, length = 26)
    private String emergencyContactNum;

    @Column(nullable = false, name = "gender", unique = false, length = 26)
    private String gender;

    @Column(nullable = false, name = "user_Type", unique = false, length = 26)
    private String userType;


    
    
    //Setters
    
    public void setFirstName(String name) {
        this.firstName = name;
    }

    public void setLastName(String name) {
        this.lastName = name;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }
    
    public void setEmergencyContactNum(String emergencyContactNum) {
        this.emergencyContactNum = emergencyContactNum;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public void setUserType(String userType) {
        this.userType = userType;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    //Getters
    
    public long getId() {
        return id;
    }


    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public String getUsername() {
        return this.username;
    }
    
    public String getPhone() {
        return this.phone;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public String getAddress() {
        return this.address;
    }
    
    public String getEmergencyContact() {
        return this.emergencyContact;
    }
    
    public String getEmergencyContactNum() {
        return this.emergencyContactNum;
    }
    
    public String getGender() {
        return this.gender;
    }
    
    public String getUserType() {
        return this.userType;
    }
}
