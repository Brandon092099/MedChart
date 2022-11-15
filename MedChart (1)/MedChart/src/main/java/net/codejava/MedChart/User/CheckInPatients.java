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
@Table(name = "CheckInPatients")
public class CheckInPatients {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_Name", unique = false, length = 26)
    private String firstName;

    @Column(name = "last_Name", unique = false, length = 26)
    private String lastName;

    @Column(name = "room_Num", unique = false, length = 26)
    private String roomNum;
    
    public CheckInPatients(){
        
    }

    public CheckInPatients(long id, String firstName, String lastName, String roomNum) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.roomNum = roomNum;
    }

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

    public String getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }

 
   
}