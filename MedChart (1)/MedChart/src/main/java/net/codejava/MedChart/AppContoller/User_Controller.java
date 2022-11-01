
package net.codejava.MedChart.AppContoller;

import net.codejava.MedChart.DTO.User_Register_DTO;
import net.codejava.MedChart.Service.User_Service;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author amaya
 */

@Controller
@RequestMapping("/SignUp")
public class User_Controller {
  
    private User_Service userService;
    

    
    public User_Controller(User_Service userService) {
        this.userService = userService;
    }
    
    
    @ModelAttribute("User")
    public User_Register_DTO userDTO(){
        
        return new User_Register_DTO();
    }
    
    
    @GetMapping("/SignUp")
    public String SignupPage(){
        return "SignUp";
    }
    
    @PostMapping
    public String registerAccount(@ModelAttribute("User") User_Register_DTO registerDTO){
        
        userService.save(registerDTO);
        
        
        
        return "redirect:/SignUp?successs";
    }
    
    
}
