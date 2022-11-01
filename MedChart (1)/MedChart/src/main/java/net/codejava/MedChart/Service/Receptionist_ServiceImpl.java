/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.MedChart.Service;

import net.codejava.MedChart.Repository.MedStaff_Repository;
import java.util.List;
import net.codejava.MedChart.User.MedStaff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author amaya
 */
@Service
public class Receptionist_ServiceImpl implements MedStaff_Service{

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
    
}
