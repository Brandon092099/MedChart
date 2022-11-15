package net.codejava.MedChart.Repository;
import net.codejava.MedChart.User.CheckInPatients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckInPatients_Repository extends JpaRepository<CheckInPatients, Long> {
    
}
