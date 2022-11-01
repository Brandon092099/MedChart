/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package net.codejava.MedChart.Repository;

import net.codejava.MedChart.User.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author amaya
 */
@Repository
public interface User_Repository extends JpaRepository<User, Long>{
    User findByEmail(String email);
    
}
