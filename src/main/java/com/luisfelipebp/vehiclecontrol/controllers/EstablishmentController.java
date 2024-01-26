package com.luisfelipebp.vehiclecontrol.controllers;

import com.luisfelipebp.vehiclecontrol.models.DTOs.ControlVehicle;
import com.luisfelipebp.vehiclecontrol.models.DTOs.EstablishmentDTO;
import com.luisfelipebp.vehiclecontrol.models.Establishment;
import com.luisfelipebp.vehiclecontrol.services.ControlVehicles;
import com.luisfelipebp.vehiclecontrol.services.EstablishmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EstablishmentController {

    @Autowired
    private EstablishmentService establishmentService;

    @Autowired
    private ControlVehicles controlVehicles;

    @GetMapping("/establishments")
    public ResponseEntity<List<Establishment>> findAllEstablishments(){
        return ResponseEntity.ok().body(establishmentService.findAllEstablishments());
    }

    @PostMapping("/establishment")
    public ResponseEntity<Establishment> saveEstablishment(@RequestBody EstablishmentDTO establishmentDTO){
        return ResponseEntity.ok().body(establishmentService.saveEstablishment(establishmentDTO));
    }

    @PostMapping("/establishment/add-vehicle")
    public ResponseEntity<Optional<Establishment>> controlAddVehicles(@RequestBody ControlVehicle controlVehicle) throws Exception {
        return ResponseEntity.ok().body(controlVehicles.controlVehicle(controlVehicle, "Add"));
    }

    @PostMapping("/establishment/remove-vehicle")
    public ResponseEntity<Optional<Establishment>> controlRemoveVehicles(@RequestBody ControlVehicle controlVehicle) throws Exception {
        return ResponseEntity.ok().body(controlVehicles.controlVehicle(controlVehicle, "Remove"));
    }
}
