/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.MedChart.Service;

import MedicalStatus_Repository;
import java.util.List;
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void savePatients(MedicalStatus patientsStatus) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
