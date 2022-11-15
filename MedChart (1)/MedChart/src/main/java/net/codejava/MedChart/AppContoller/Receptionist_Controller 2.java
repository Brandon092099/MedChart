/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.MedChart.AppContoller;

import net.codejava.MedChart.Service.Receptionist_Service;
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

    //display list of Receptionist
    @GetMapping("/admin/Receptionist")
    public String view_HomePage(Model model) {
        model.addAttribute("listReceptionist", RecepService.getAllReceptionist());
        return "Receptionist";
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
