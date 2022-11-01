/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.MedChart.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import net.codejava.MedChart.DTO.User_Register_DTO;
import net.codejava.MedChart.Repository.User_Repository;
import net.codejava.MedChart.User.Role;
import net.codejava.MedChart.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author amaya
 */
@Service
public class User_ServiceImpl implements User_Service {

    


    @Autowired
    private User_Repository userRepo;

    public User_ServiceImpl( User_Repository userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public User save(User_Register_DTO registrationDTO) {
        
         
        User user = new User(registrationDTO.getFirstName(), registrationDTO.getLastName(),
                registrationDTO.getEmail(), registrationDTO.getPassword(), Arrays.asList(new Role("ROLE_USER")));

       

        return userRepo.save(user);
    }

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepo.findByEmail(username);

        if (user == null) {
            throw new UsernameNotFoundException("Invaild username or password.");
        }
        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), mapRolesToAuthorities(user.getRoles()));
    }

    private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles) {
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
    }

}
