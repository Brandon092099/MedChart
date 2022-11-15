/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.MedChart.Service;

import net.codejava.MedChart.Repository.Patients_Repository;
import java.util.List;
import java.util.Optional;
import net.codejava.MedChart.DTO.User_Register_DTO;
import net.codejava.MedChart.User.Patients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author amaya
 */
@Service
public class Patients_ServiceImpl implements Patients_Service{

    @Autowired
    private Patients_Repository PatientsRepo;
    
    @Override
    public List<Patients> getAllPatients() {
        return PatientsRepo.findAll();
    }
    

    @Override
    public void savePatients(Patients patients) {
        this.PatientsRepo.save(patients);
    }
    
    @Override
    public Patients getPatientsById(long id) {
        Optional<Patients> optional = PatientsRepo.findById(id);
        Patients patient = null;
        if (optional.isPresent()) {
            patient = optional.get();
        } else {
            throw new RuntimeException("Patient not found for id:: " + id);
        }
        return patient;
    }

    @Override
    public void deletePatients(long id) {
        this.PatientsRepo.deleteById(id);
    }
    
    public void singlePt(User_Register_DTO id) {
        this.PatientsRepo.findByEmail(id.getEmail());
    }
    
}
