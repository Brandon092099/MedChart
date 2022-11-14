/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.MedChart.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import net.codejava.MedChart.DTO.User_Register_DTO;
import net.codejava.MedChart.Repository.MedStaff_Repository;
import net.codejava.MedChart.Repository.Patients_Repository;
import net.codejava.MedChart.Repository.Receptionist_Repository;
import net.codejava.MedChart.Repository.Role_Repository;
import net.codejava.MedChart.Repository.User_Repository;
import net.codejava.MedChart.User.Role;
import net.codejava.MedChart.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author amaya
 */
@Service
public class User_ServiceImpl implements User_Service {

    @Autowired
    private User_Repository userRepo;

    @Autowired
    private Role_Repository roleRepo;

    @Autowired
    private MedStaff_Repository medStaffRepo;

    @Autowired
    private Patients_Repository patientRepo;

    @Autowired
    private Receptionist_Repository recepRepo;

    @Autowired
    private BCryptPasswordEncoder passencoder;
    

    public User_ServiceImpl(User_Repository userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public User save(User_Register_DTO registrationDTO) {

        User user = new User();

        user.setFirstName(registrationDTO.getFirstName());
        user.setLastName(registrationDTO.getLastName());
        user.setEmail(registrationDTO.getEmail());

        user.setPassword(passencoder.encode(registrationDTO.getPassword()));

        Role role = roleRepo.findByName("Admin");
        Role role2 = roleRepo.findByName("Medical Staff");
        Role role3 = roleRepo.findByName("Receptionist");
        Role role4 = roleRepo.findByName("Patient");

        //checking if role exist if not it adds roles
        if (role == null) {
            checkRole("Admin");
        }
        if (role2 == null) {
            checkRole("Medical Staff");
        }
        if (role3 == null) {
            checkRole("Receptionist");
        }
        if (role4 == null) {
            checkRole("Patient");
        }
        
        //add roles to user based on their user role

        if (medStaffRepo.findByEmail(registrationDTO.getEmail()) != null) {
            user.setRoles(Arrays.asList(role2));
        }
        else if (patientRepo.findByEmail(registrationDTO.getEmail()) != null) {
        user.setRoles(Arrays.asList(role4));
        }
        else if (recepRepo.findByEmail(registrationDTO.getEmail()) != null){
            user.setRoles(Arrays.asList(role3));
        }
        else if(medStaffRepo.findByEmail(registrationDTO.getEmail()) == null &&
                patientRepo.findByEmail(registrationDTO.getEmail()) == null &&
                recepRepo.findByEmail(registrationDTO.getEmail()) == null){
            user.setRoles(Arrays.asList(role));
        }
            return userRepo.save(user);
        
    }

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepo.findByEmail(username);

        if (user == null) {
            throw new UsernameNotFoundException("Invaild username or password.");
        }
        return new org.springframework.security.core.userdetails.User(user.getFirstName().concat(" " + user.getLastName()), user.getPassword(), mapRolesToAuthorities(user.getRoles()));
    }

    private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles) {
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
    }

    private Role checkRole(String name) {
        Role role = new Role();
        role.setName(name);
        return roleRepo.save(role);
    }
    

}
