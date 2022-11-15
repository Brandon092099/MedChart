
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
    
    void deleteReceptionist(long id);
    
    Receptionist getReceptionistById(long id);
    
    
}
