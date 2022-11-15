<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.MedChart.AppContoller;

import net.codejava.MedChart.Service.Patients_Service;
import net.codejava.MedChart.User.Patients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author amaya
 */
@Controller
public class Patients_Controller {
   
     @Autowired
    private Patients_Service PatientService;
     
     
    //display list of Patients
    @GetMapping("/admin/Patients")
    public String HomePage(Model model){
        model.addAttribute("listPatients", PatientService.getAllPatients());
                return "Patients";
    }
    
       @GetMapping("/patient/Patient_Account_Settings")
    public String PatientAccountSettings(Model model){
        model.addAttribute("listPatientsInfo", PatientService.getAllPatients());
        
                return "Patient_Account_Settings";
    }
    
    
    @GetMapping("/admin/newPatientsForm")
    public String ReceptionistForm(Model model){
        Patients patients = new Patients();
        
        model.addAttribute("patients", patients);
        
        return "new_Patients";
    }
    
    @PostMapping("/admin/savePatients")
    public String savePatients(@ModelAttribute("patients") Patients patients){
        
        PatientService.savePatients(patients);
        
        return "redirect:/admin/Patients?success";
    }
    @PostMapping("/patient/savePatients")
    public String PatientsavePatients(@ModelAttribute("patients") Patients patients){
        
        PatientService.savePatients(patients);
        
        return "redirect:/patient/Patients_Account_Settings?success";
    }
    
    @PostMapping("/admin/updatePatients")
    public String updatePatients(@ModelAttribute("patients") Patients patients){
        
        PatientService.savePatients(patients);
        
        return "redirect:/admin/Patients?update";
    }
    
    
     @PostMapping("/patient/updatePatients")
    public String patientUpdatePatients(@ModelAttribute("patients") Patients patients){
        
        PatientService.savePatients(patients);
        
        return "redirect:/patient/Patients_Account_Settings?update";
    }
    
    @GetMapping("/formUpdatePatients/{id}")
    public String FormUpdate(@PathVariable(value = "id") long id, Model model) {

        Patients Patients = PatientService.getPatientsById(id);

        model.addAttribute("patients", Patients);

        return "update_Patients";
    }
    
    
    @GetMapping("/patient/formUpdatePatients/{id}")
    public String PatientFormUpdate(@PathVariable(value = "id") long id, Model model) {

        Patients Patients = PatientService.getPatientsById(id);

        model.addAttribute("patients", Patients);

        return "Patient_update_Patients";
    }

    @GetMapping("/deletePatients/{id}")
    public String deletePatient(@PathVariable(value = "id") long id) {
        //call delete mthd
        this.PatientService.deletePatients(id);
        return ("redirect:/admin/Patients?delete");
    }
    
    
    
    @GetMapping("/patient/Home")
    public String PatientHomePage(Model model){
                return "Patient_Home";
    }
    
 
    @GetMapping("/patient/Patient_Medical_Status")
    public String PatientMedicalStatus(Model model){
                return "Patient_Medical_Status";
    }

}
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.MedChart.AppContoller;

import net.codejava.MedChart.Service.Patients_Service;
import net.codejava.MedChart.User.Patients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author amaya
 */
@Controller
public class Patients_Controller {
   
     @Autowired
    private Patients_Service PatientService;
     
     
    //display list of Patients
    @GetMapping("/admin/Patients")
    public String HomePage(Model model){
        model.addAttribute("listPatients", PatientService.getAllPatients());
                return "Patients";
    }
    
    
    @GetMapping("/admin/newPatientsForm")
    public String ReceptionistForm(Model model){
        Patients patients = new Patients();
        
        model.addAttribute("patients", patients);
        
        return "new_Patients";
    }
    
    @PostMapping("/admin/savePatients")
    public String savePatients(@ModelAttribute("patients") Patients patients){
        
        PatientService.savePatients(patients);
        
        return "redirect:/admin/Patients?success";
    }
    
    @PostMapping("/admin/updatePatients")
    public String updatePatients(@ModelAttribute("patients") Patients patients){
        
        PatientService.savePatients(patients);
        
        return "redirect:/admin/Patients?update";
    }
    
    @GetMapping("/formUpdatePatients/{id}")
    public String FormUpdate(@PathVariable(value = "id") long id, Model model) {

        Patients Patients = PatientService.getPatientsById(id);

        model.addAttribute("patients", Patients);

        return "update_Patients";
    }

    @GetMapping("/deletePatients/{id}")
    public String deleteMedStaff(@PathVariable(value = "id") long id) {
        //call delete mthd
        this.PatientService.deletePatients(id);
        return ("redirect:/admin/Patients?delete");
    }
    
    @GetMapping("/patient/Home")
    public String PatientHomePage(Model model){
                return "Patient_Home";
    }
    
    @GetMapping("/patient/Patient_Account_Settings")
    public String PatientAccountSettings(Model model){
                return "Patient_Account_Settings_1";
    }
    
    @GetMapping("/patient/Patient_Medical_Status")
    public String PatientMedicalStatus(Model model){
                return "Patient_Medical_Status";
    }
}
>>>>>>> 0791adb155f182536dc412997e8efe8d13522e0b
