package net.codejava.MedChart.Service;
import java.util.List;
import net.codejava.MedChart.User.CheckInPatients;
public interface CheckInPatients_Service {
    List<CheckInPatients> getAllCheckInPatients();
    
    void savePatients(CheckInPatients CheckInPatients);
    
    CheckInPatients getCheckInPatientsById(long id);
    
}
