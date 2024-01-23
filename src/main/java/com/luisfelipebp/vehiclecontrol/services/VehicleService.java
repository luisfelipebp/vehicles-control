package com.luisfelipebp.vehiclecontrol.services;

import com.luisfelipebp.vehiclecontrol.models.DTOs.VehicleDTO;
import com.luisfelipebp.vehiclecontrol.models.Vehicle;
import com.luisfelipebp.vehiclecontrol.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    public Optional<Vehicle> findById(Long id){
        return vehicleRepository.findById(id);
    }

    public List<Vehicle> findAllVehicles(){
        return vehicleRepository.findAll();
    }

    public Vehicle saveVehicle(VehicleDTO vehicleDTO){
        Vehicle vehicle = new Vehicle(vehicleDTO);
        return vehicleRepository.save(vehicle);
    }
}
