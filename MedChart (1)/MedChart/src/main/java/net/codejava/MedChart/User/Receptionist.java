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
@Table(name = "Receptionist")
public class Receptionist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_Name", unique = false, length = 26)
    private String firstName;

    @Column(name = "last_Name", unique = false, length = 26)
    private String lastName;

    @Column(name = "email", unique = false, length = 26)
    private String email;

    @Column(name = "phone", unique = false, length = 26)
    private String phone;

    @Column(name = "address", unique = false, length = 26)
    private String address;

    @Column(name = "emergency_Contact", unique = false, length = 26)
    private String emergencyContact;

    @Column(name = "emergency_Contact_Num", unique = false, length = 26)
    private String emergencyContactNum;

    @Column(name = "gender", unique = false, length = 26)
    private String gender;

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

    public void setPhone(String phone) {
        this.phone = phone;
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

    public String getPhone() {
        return this.phone;
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

}
