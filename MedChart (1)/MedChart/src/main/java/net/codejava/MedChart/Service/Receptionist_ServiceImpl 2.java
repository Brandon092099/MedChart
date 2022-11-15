/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.MedChart.Service;

import java.util.List;
import java.util.Optional;
import net.codejava.MedChart.Repository.Receptionist_Repository;
import net.codejava.MedChart.User.Receptionist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author amaya
 */
@Service
public class Receptionist_ServiceImpl implements Receptionist_Service{

    @Autowired
    private Receptionist_Repository RecepRepo;
    
    @Override
    public List<Receptionist> getAllReceptionist() {
        return RecepRepo.findAll();
    }

    @Override
    public void saveReceptionist(Receptionist receptionist) {
        this.RecepRepo.save(receptionist);
    }

    @Override
    public Receptionist getReceptionistById(long id) {
       Optional<Receptionist> optional = RecepRepo.findById(id);
        Receptionist recep = null;
        if (optional.isPresent()) {
            recep = optional.get();
        } else {
            throw new RuntimeException("Receptionist not found for id:: " + id);
        }
        return recep;
    }

    @Override
    public void deleteReceptionist(long id) {
        this.RecepRepo.deleteById(id);
    }
}
