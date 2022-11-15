/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package net.codejava.MedChart.Service;

import java.util.List;
import net.codejava.MedChart.User.MedicalStatus;

/**
 *
 * @author davidamaya
 */
public interface MedicalStatus_Service {
     List<MedicalStatus> getAllPatients();
    
    void savePatients(MedicalStatus patientsStatus);
}
