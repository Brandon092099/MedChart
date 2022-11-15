/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.MedChart.Service;

import java.util.List;
import java.util.Optional;
import net.codejava.MedChart.User.MedicalStatus;
import org.springframework.beans.factory.annotation.Autowired;
import net.codejava.MedChart.Repository.MedicalStatus_Repository;

/**
 *
 * @author davidamaya
 */
public class MedicalStatus_ServiceImpl implements MedicalStatus_Service{
    
    @Autowired
    private MedicalStatus_Repository MSRepo;

    @Override
    public List<MedicalStatus> getAllPatients() {
        return MSRepo.findAll();
    }

    @Override
    public void savePatients(MedicalStatus patientsStatus) {
        this.MSRepo.save(patientsStatus);
    }

    @Override
    public MedicalStatus getMSById(long id) {
        Optional<MedicalStatus> optional = MSRepo.findById(id);
        MedicalStatus patient = null;
        if (optional.isPresent()) {
            patient = optional.get();
        } else {
            throw new RuntimeException("Patient not found for id:: " + id);
        }
        return patient;
    }
    
}
