/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.MedChart.Service;

import java.util.List;
import java.util.Optional;
import net.codejava.MedChart.Repository.Receptionist_Repository;
import net.codejava.MedChart.User.Receptionist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author amaya
 */
@Service
public class Receptionist_ServiceImpl implements Receptionist_Service{

    @Autowired
    private Receptionist_Repository medRepo;
    
    @Override
    public List<Receptionist> getAllReceptionist() {
        return medRepo.findAll();
    }

    @Override
    public void saveReceptionist(Receptionist medStaff) {
        this.medRepo.save(medStaff);
    }

    @Override
    public Receptionist getMedStaffById(long id) {
       Optional<Receptionist> optional = medRepo.findById(id);
        Receptionist medStaff = null;
        if (optional.isPresent()) {
            medStaff = optional.get();
        } else {
            throw new RuntimeException("Medical Staff not found for id:: " + id);
        }
        return medStaff;
    }

    @Override
    public void deleteMedStaff(long id) {
        this.medRepo.deleteById(id);
    }
}
