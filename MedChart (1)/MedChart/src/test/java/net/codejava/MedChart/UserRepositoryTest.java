/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.MedChart;

import net.codejava.MedChart.User.User;
import net.codejava.MedChart.User.User_Repository;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

/**
 *
 * @author amaya
 */

@DataJpaTest

@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTest {
   /* 
    @Autowired
    private User_Repository repo;
    
    @Autowired
    private TestEntityManager entityManager;
    
    
    @Test
    public void testCreateUser() {
        User user = new User();
       
        user.setFirstName("Ravi");
        user.setLastName("Kumar");
        user.setEmail("ravikumar@gmail.com");
        user.setPassword("ravi2020");
        user.setType("2");
        
        User savedUser = repo.save(user);
        
        User existUser = entityManager.find(User.class, savedUser.getId());
        
        assertThat(existUser.getEmail().compareTo(user.getEmail()));
    }
*/
    
}
