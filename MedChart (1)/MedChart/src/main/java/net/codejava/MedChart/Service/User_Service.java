/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package net.codejava.MedChart.Service;

import net.codejava.MedChart.DTO.User_Register_DTO;
import net.codejava.MedChart.User.User;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 *
 * @author amaya
 */
public interface User_Service extends UserDetailsService {
    User save(User_Register_DTO registrationDTO);
}
