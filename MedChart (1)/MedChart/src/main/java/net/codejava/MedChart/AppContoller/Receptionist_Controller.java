/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.MedChart.AppContoller;

import net.codejava.MedChart.Service.Receptionist_Service;
import net.codejava.MedChart.Service.Receptionist_ServiceImpl;
import net.codejava.MedChart.User.Receptionist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author amaya
 */
@Controller
public class Receptionist_Controller {
    
    
    @Autowired
    private Receptionist_Service MedService;
    /*
    //display list of Receptionist
    @GetMapping("/index")
    public String viewHomePage(Model model){
        model.addAttribute("listReceptionist", MedService.getAllReceptionist());
                return "index";
    }
    */
    
    @GetMapping("/newReceptionistForm")
    public String ReceptionistForm(Model model){
        Receptionist receptionist = new Receptionist();
        
        model.addAttribute("receptionist", receptionist);
        
        return "new_Receptionist";
    }
    
    @PostMapping("/saveReceptionist")
    public String saveReceptionist(@ModelAttribute("receptionist") Receptionist receptionist){
        
        MedService.saveReceptionist(receptionist);
        
        return "redirect:/index";
    }
}
