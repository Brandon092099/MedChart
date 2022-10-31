/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.MedChart.Service;

import net.codejava.MedChart.Repository.Patients_Repository;
import java.util.List;
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
    public List<Patients> getAllMedStaffs() {
        return PatientsRepo.findAll();
    }

    @Override
    public void saveMedStaff(Patients Patients) {
        this.PatientsRepo.save(Patients);
    }
    
}
