/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.MedChart.Service;

import net.codejava.MedChart.Repository.MedStaff_Repository;
import java.util.List;
import java.util.Optional;
import net.codejava.MedChart.User.MedStaff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author amaya
 */
@Service
public class MedStaff_ServiceImpl implements MedStaff_Service{

    @Autowired
    private MedStaff_Repository medRepo;
    
    @Override
    public List<MedStaff> getAllMedStaffs() {
        return medRepo.findAll();
    }

    @Override
    public void saveMedStaff(MedStaff medStaff) {
        this.medRepo.save(medStaff);
    }
    
    @Override
    public MedStaff getMedStaffById(long id) {
        Optional<MedStaff> optional = medRepo.findById(id);
        MedStaff medStaff = null;
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
