/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medchart;

/**
 *
 * @author Brandon George, David Amaya, Bee Yang
 * 
 * This class is the parent class for all users of the software. It contains
 * common variables and methods that are needed for every user.
 */
public class User {
    private String name;
    private String email;
    private String username;
    private String phone;
    private String password;
    private String address;
    private String emergencyContact;
    private String emergencyContactNum;
    private String gender;
    private String userType;
    
    
    public User(String name, String email, String username, String phone, 
            String password, String address, String emergencyContact, 
            String emergencyContactNum, String gender, String userType) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.phone = phone;
        this.password = password;
        this.address = address;
        this.emergencyContact = emergencyContact;
        this.emergencyContactNum = emergencyContactNum;
        this.gender = gender;
        this.userType = userType;
    }
    
    //Setters
    
    public void setName(String name) {
        this.name = name;
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
    
    //Getters
    
    public String getName() {
        return this.name;
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
