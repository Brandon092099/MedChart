
package net.codejava.MedChart.Service;

import java.util.List;
import net.codejava.MedChart.User.MedStaff;

/**
 *
 * @author amaya
 */
public interface MedStaff_Service {
    
    List<MedStaff> getAllMedStaffs();
    
    void saveMedStaff(MedStaff medStaff);
    
    MedStaff getMedStaffById(long id);
    
    void deleteMedStaff(long id);
}
