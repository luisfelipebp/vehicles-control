package com.luisfelipebp.vehiclecontrol.controllers;

import com.luisfelipebp.vehiclecontrol.models.DTOs.VehicleDTO;
import com.luisfelipebp.vehiclecontrol.models.Vehicle;
import com.luisfelipebp.vehiclecontrol.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping("/vehicles")
    public ResponseEntity<List<Vehicle>> findAll(){
        return ResponseEntity.ok().body(vehicleService.findAllVehicles());
    }

    @PostMapping("/vehicle")
    public ResponseEntity<Vehicle> saveVehicule(@RequestBody VehicleDTO vehicleDTO){
        return ResponseEntity.ok().body(vehicleService.saveVehicle(vehicleDTO));
    }
}
