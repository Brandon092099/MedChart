/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.MedChart.AppContoller;

import net.codejava.MedChart.Service.CheckInPatients_Service;
import net.codejava.MedChart.Service.Patients_Service;
import net.codejava.MedChart.Service.Receptionist_Service;
import net.codejava.MedChart.User.CheckInPatients;
import net.codejava.MedChart.User.Patients;
import net.codejava.MedChart.User.Receptionist;
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
public class Receptionist_Controller {

    @Autowired
    private Receptionist_Service RecepService;

    @Autowired
    private Patients_Service PatientService;

    @Autowired
    private CheckInPatients_Service CheckInPatientService;

    //display list of Receptionist
    @GetMapping("/admin/Receptionist")
    public String view_HomePage(Model model) {
        model.addAttribute("listReceptionist", RecepService.getAllReceptionist());
        return "Receptionist";
    }

    @GetMapping("/receptionist/Home")
    public String view_ReceptionistHomePage(Model model) {
        return "Receptionist_Home";
    }

    @GetMapping("/receptionist/Receptionist_Account_Settings")
    public String HomePage(Model model) {
        model.addAttribute("listPatients", PatientService.getAllPatients());
        return "Receptionist_Account_Settings";
    }

    //list of check in patients
    @GetMapping("/receptionist/Receptionist_Check_In")
    public String view_ReceptionistCheckIn(Model model) {
        model.addAttribute("patientCheckIn", CheckInPatientService.getAllCheckInPatients());
        return "Receptionist_Check_In";
    }

    @GetMapping("/receptionist/formUpdateRoom/{id}")
    public String ReceptionistFormUpdateRoom(@PathVariable(value = "id") long id, Model model) {

        Patients Patients = PatientService.getPatientsById(id);

        model.addAttribute("patients", Patients);

        CheckInPatients CheckInPatients = CheckInPatientService.getCheckInPatientsById(id);

        model.addAttribute("CheckInPatients", CheckInPatients);

        return "Receptionist_update_Patients_Room";
    }

    @GetMapping("/receptionist/CheckInForm")
    public String checkInForm(Model model) {
        CheckInPatients ReceptionistPatients = new CheckInPatients();
        //model.addAttribute("patientCheckIn", CheckInPatientService.getAllCheckInPatients());
        model.addAttribute("CheckInPatients", ReceptionistPatients);
        return "new_checkin";
    }

    @GetMapping("/receptionist/formUpdatePatients/{id}")
    public String ReceptionistFormUpdate(@PathVariable(value = "id") long id, Model model) {

        Patients Patients = PatientService.getPatientsById(id);

        model.addAttribute("patients", Patients);

        return "Receptionist_update_Patients";
    }

    @PostMapping("/receptionist/updatePatients")
    public String ReceptionistupdatePatients(@ModelAttribute("patients") Patients patients) {

        PatientService.savePatients(patients);

        return "redirect:/receptionist/Receptionist_Account_Settings?update";
    }

    //done working
    @PostMapping("/receptionist/updatePatientsRoom")
    public String ReceptionistupdatePatientsRoom(@ModelAttribute("CheckInPatients") CheckInPatients CheckInpatients) {

        CheckInPatientService.saveCheckInPatients(CheckInpatients);

        return "redirect:/receptionist/Receptionist_Check_In?update";
    }

    @PostMapping("/receptionist/savePatientsRoom")
    public String ReceptionistsavePatientsRoom(@ModelAttribute("CheckInPatients") CheckInPatients CheckInpatients) {

        CheckInPatientService.saveCheckInPatients(CheckInpatients);

        return "redirect:/receptionist/Receptionist_Check_In?success";
    }

    @GetMapping("/admin/newReceptionistForm")
    public String ReceptionistForm(Model model) {
        Receptionist receptionist = new Receptionist();

        model.addAttribute("receptionist", receptionist);

        return "new_Receptionist";
    }

    @PostMapping("/admin/saveReceptionist")
    public String saveReceptionist(@ModelAttribute("receptionist") Receptionist receptionist) {

        RecepService.saveReceptionist(receptionist);

        return "redirect:/admin/Receptionist?success";
    }

    @PostMapping("/admin/updateReceptionist")
    public String updateReceptionist(@ModelAttribute("receptionist") Receptionist receptionist) {

        RecepService.saveReceptionist(receptionist);

        return "redirect:/admin/Receptionist?update";
    }

    @GetMapping("/deleteReceptionist/{id}")
    public String deleteReceptionist(@PathVariable(value = "id") long id) {
        //call delete mthd
        this.RecepService.deleteReceptionist(id);
        return ("redirect:/admin/Receptionist?delete");
    }

    @GetMapping("/formUpdateReceptionist/{id}")
    public String FormUpdate(@PathVariable(value = "id") long id, Model model) {

        Receptionist receptionist = RecepService.getReceptionistById(id);

        model.addAttribute("receptionist", receptionist);

        return "update_Receptionist";
    }
}
