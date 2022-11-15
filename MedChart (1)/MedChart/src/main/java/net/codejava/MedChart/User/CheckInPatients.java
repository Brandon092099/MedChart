<<<<<<< Updated upstream
=======
<<<<<<< HEAD
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
=======
>>>>>>> Stashed changes
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
    private String room_Num;
    
    public CheckInPatients(){
        
    }

    public CheckInPatients(long id, String firstName, String lastName, String room_Num) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.room_Num = room_Num;
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

    public void setroomNum(String roomNum) {
        this.room_Num = roomNum;
    }

    public String getroomNum() {
        return room_Num;
    }

   
}
<<<<<<< Updated upstream
=======
>>>>>>> 0791adb155f182536dc412997e8efe8d13522e0b
>>>>>>> Stashed changes
