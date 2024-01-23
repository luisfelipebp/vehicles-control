package com.luisfelipebp.vehiclecontrol.services;

import com.luisfelipebp.vehiclecontrol.models.DTOs.ControlVehicle;
import com.luisfelipebp.vehiclecontrol.models.DTOs.EstablishmentDTO;
import com.luisfelipebp.vehiclecontrol.models.Establishment;
import com.luisfelipebp.vehiclecontrol.repositories.EstablishmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.naming.ldap.Control;
import java.util.List;
import java.util.Optional;

@Service
public class EstablishmentService {

    @Autowired
    private EstablishmentRepository establishmentRepository;


    public Optional<Establishment> findById(Long id){
        return establishmentRepository.findById(id);
    }

    public List<Establishment> findAllEstablishments(){
        return establishmentRepository.findAll();
    }

    public Establishment saveEstablishment(EstablishmentDTO establishmentDTO){
        Establishment establishment = new Establishment(establishmentDTO);
        return establishmentRepository.save(establishment);
    }


}
