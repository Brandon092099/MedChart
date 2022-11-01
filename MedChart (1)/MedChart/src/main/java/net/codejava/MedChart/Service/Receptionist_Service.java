
package net.codejava.MedChart.Service;

import java.util.List;
import net.codejava.MedChart.User.Receptionist;

/**
 *
 * @author Brandon George
 */
public interface Receptionist_Service {
    
    List<Receptionist> getAllReceptionist();
    
    void saveReceptionist(Receptionist receptionist);
    
    void deleteMedStaff(long id);
    
    Receptionist getMedStaffById(long id);
    
    
}
