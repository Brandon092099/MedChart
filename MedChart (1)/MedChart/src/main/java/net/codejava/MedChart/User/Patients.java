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
 * @author amaya
 */
@Entity
@Table(name = "patients")
public class Patients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, name = "first_Name", unique = false, length = 26)
    private String firstName;

    @Column(nullable = false, name = "last_Name", unique = false, length = 26)
    private String lastName;

    @Column(nullable = false, name = "email", unique = true, length = 50)
    private String emial;

    @Column(nullable = false, name = "username", unique = false, length = 26)
    private String username;

    @Column(nullable = false, name = "phone_number", unique = false, length = 26)
    private String phone;

    @Column(nullable = false, name = "password", unique = false, length = 26)
    private String password;

    @Column(nullable = false, name = "address", unique = false, length = 26)
    private String address;

    @Column(nullable = false, name = "emergency_contact", unique = false, length = 26)
    private String emergencyContact;

    @Column(nullable = false, name = "emergency_number", unique = false, length = 26)
    private String emergencyContactNum;

    @Column(nullable = false, name = "gender", unique = false, length = 26)
    private String gender;

    @Column(nullable = false, name = "user_type", unique = false, length = 26)
    private String userType;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmial() {
        return emial;
    }

    public void setEmial(String emial) {
        this.emial = emial;
    }

    public String getUsername() {
        return this.username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }    
    
    public String getPassword() {
        return this.password;
    }

     public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmergencyContact() {
        return this.emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }
    public String getEmergencyContactNum() {
        return this.emergencyContactNum;
    }

    public void setEmergencyContactNum(String emergencyContactNum) {
        this.emergencyContactNum = emergencyContactNum;
    }
    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getUserType() {
        return this.userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

}
