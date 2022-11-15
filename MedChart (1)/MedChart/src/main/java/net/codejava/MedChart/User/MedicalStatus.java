/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.MedChart.User;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 *
 * @author Bee_Y
 */
@Entity
@Table(name = "MedStatus")
public class MedicalStatus {

    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    @Column(name = "first_Name", unique = false, length = 26)
    private String firstName;
    @Column(name = "last_Name", unique = false, length = 26)
    private String lastName;
    @Column(name = "DOB", unique = false, length = 26)
    private String DOB;
    
    @Column(name = "type", unique = false, length = 26)
    private String type;
    
    @Column(name = "status", unique = false, length = 26)
    private String status;

    @Column(name = "notes", unique = false, length = 500)
    private String notes;
    
    public MedicalStatus(){
        
    }

    public MedicalStatus(Long id, String firstName, String lastName, String DOB, String type, String status, String notes) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
        this.type = type;
        this.status = status;
        this.notes = notes;
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

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
    
    


}