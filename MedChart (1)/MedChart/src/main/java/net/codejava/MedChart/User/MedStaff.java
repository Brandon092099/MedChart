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
@Table(name = "med_staff")
public class MedStaff {

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getEmergencyContactNum() {
        return emergencyContactNum;
    }

    public void setEmergencyContactNum(String emergencyContactNum) {
        this.emergencyContactNum = emergencyContactNum;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
