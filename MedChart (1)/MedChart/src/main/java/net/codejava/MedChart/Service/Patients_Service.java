
package net.codejava.MedChart.Service;

import java.util.List;
import net.codejava.MedChart.User.Patients;

/**
 *
 * @author amaya
 */
public interface Patients_Service {
    
    List<Patients> getAllPatients();
    
    void savePatients(Patients patients);
    
    Patients getPatientsById(long id);
    
    void deletePatients(long id);
}
