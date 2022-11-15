/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.MedChart.AppContoller;

import net.codejava.MedChart.Service.MedStaff_Service;
import net.codejava.MedChart.Service.MedStaff_ServiceImpl;
import net.codejava.MedChart.Service.MedicalStatus_Service;
import net.codejava.MedChart.User.MedStaff;
import net.codejava.MedChart.User.MedicalStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author amaya
 */
@Controller
public class MedStaff_Controller {

    @Autowired
    private MedStaff_Service MedService;
    
    @Autowired
    private MedicalStatus_Service MSservice;

    //display list of MedStaff
    @GetMapping("/admin/MedStaff")
    public String viewHomePage(Model model) {
        model.addAttribute("listMedStaff", MedService.getAllMedStaffs());
        return "MedStaff";
    }

    @GetMapping("/admin/newMedStaffForm")
    public String MedStaffForm(Model model) {
        MedStaff medStaff = new MedStaff();

        model.addAttribute("medStaff", medStaff);

        return "new_MedStaff";
    }

    @PostMapping("/admin/saveMedStaff")
    public String saveMedStaff(@ModelAttribute("medStaff") MedStaff medstaff) {

        //save to database
        MedService.saveMedStaff(medstaff);

        return "redirect:/admin/MedStaff?success";
    }
    
    @PostMapping("/admin/updateMedStaff")
    public String updateMedStaff(@ModelAttribute("medStaff") MedStaff medstaff) {

        //save to database
        MedService.saveMedStaff(medstaff);

        return "redirect:/admin/MedStaff?update";
    }

    @GetMapping("/formUpdate/{id}")
    public String FormUpdate(@PathVariable(value = "id") long id, Model model) {

        MedStaff medStaff = MedService.getMedStaffById(id);

        model.addAttribute("medStaff", medStaff);

        return "update_MedStaff";
    }

    @GetMapping("/deleteMedStaff/{id}")
    public String deleteMedStaff(@PathVariable(value = "id") long id) {
        //call delete mthd
        this.MedService.deleteMedStaff(id);
        return ("redirect:/admin/MedStaff?delete");
    }
    
    @GetMapping("/medStaff/MedStatus")
    public String listStatus(Model model){
        model.addAttribute("listMS", MSservice.getAllPatients());
        
        return "MedicalStatus";
    }
    
    @GetMapping("/formMSUpdate/{id}")
    public String FormMSUpdate(@PathVariable(value = "id") long id, Model model) {

        MedicalStatus medicalStatus = MSservice.getMSById(id);

        model.addAttribute("medicalStatus", medicalStatus);

        return "update_Medical_Status";
    }
    
    @GetMapping("/medStaff/newMedStatusForm")
    public String MSForm(Model model) {
        MedicalStatus  medicalStatus = new MedicalStatus();

        model.addAttribute("medicalStatus", medicalStatus);

        return "Add_Medical_Status";
    }

    @PostMapping("/medStaff/saveMedStatus")
    public String saveMS(@ModelAttribute("medicalStatus") MedicalStatus medicalStatus) {

        //save to database
        MSservice.savePatients(medicalStatus);

        return "redirect:/medStaff/MedStatus?success";
    }
    
    @PostMapping("/medStaff/updateMS")
    public String updateMS(@ModelAttribute("medicalStatus") MedicalStatus medicalStatus) {

        //save to database
        MSservice.savePatients(medicalStatus);;

        return "redirect:/medStaff/MedStatus?update";
    }

  
}

