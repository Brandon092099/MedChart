package net.codejava.MedChart.Service;
import java.util.List;
import java.util.Optional;
import net.codejava.MedChart.Repository.CheckInPatients_Repository;
import net.codejava.MedChart.User.CheckInPatients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckInPatients_ServiceImpl implements CheckInPatients_Service{
    @Autowired
    private CheckInPatients_Repository CheckInPatientsRepo;
    
    @Override
    public List<CheckInPatients> getAllCheckInPatients() {
        return CheckInPatientsRepo.findAll();
    }

    @Override
    public void saveCheckInPatients(CheckInPatients CheckInPatients) {
        this.CheckInPatientsRepo.save(CheckInPatients);
    }
    
    @Override
    public CheckInPatients getCheckInPatientsById(long id) {
        Optional<CheckInPatients> optional = CheckInPatientsRepo.findById(id);
        CheckInPatients patient = null;
        if (optional.isPresent()) {
            patient = optional.get();
        } else {
            throw new RuntimeException("Patient not found for id:: " + id);
        }
        return patient;
    }
}