/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.MedChart.AppContoller;

import net.codejava.MedChart.Service.Patients_Service;
import net.codejava.MedChart.User.MedStaff;
import net.codejava.MedChart.User.Patients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author amaya
 */
public class Patients_Controller {
    
     @Autowired
    private Patients_Service MedService;
     
     
    //display list of Patients
    @GetMapping("/Patients")
    public String HomePage(Model model){
        model.addAttribute("listPatients", MedService.getAllPatients());
                return "Patients";
    }
    
    
    @GetMapping("/newPatientsForm")
    public String ReceptionistForm(Model model){
        Patients Patients = new Patients();
        
        model.addAttribute("Patients", Patients);
        
        return "new_Patients";
    }
    
    @PostMapping("/savePatients")
    public String savePatients(@ModelAttribute("Patients") Patients Patients){
        
        MedService.savePatients(Patients);
        
        return "redirect:/Patients";
    }
    
    @GetMapping("/formUpdatePatients/{id}")
    public String FormUpdate(@PathVariable(value = "id") long id, Model model) {

        Patients Patients = MedService.getPatientsById(id);

        model.addAttribute("medStaff", Patients);

        return "update_Patients";
    }

    @GetMapping("/deletePatients/{id}")
    public String deleteMedStaff(@PathVariable(value = "id") long id) {
        //call delete mthd
        this.MedService.deletePatients(id);
        return ("redirect:/Patients");
    }
}
