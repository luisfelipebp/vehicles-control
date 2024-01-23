package com.luisfelipebp.vehiclecontrol.services;

import com.luisfelipebp.vehiclecontrol.models.DTOs.ControlVehicle;
import com.luisfelipebp.vehiclecontrol.models.DTOs.EstablishmentDTO;
import com.luisfelipebp.vehiclecontrol.models.Establishment;
import com.luisfelipebp.vehiclecontrol.models.enums.TypeVehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ControlVehicles {

    @Autowired
    private EstablishmentService establishmentService;

    @Autowired
    private VehicleService vehicleService;

    public Optional<Establishment> controlVehicle(ControlVehicle controlVehicle) throws Exception {
        var establishment = establishmentService.findById(controlVehicle.id_establishment());
        var vehicle = vehicleService.findById(controlVehicle.id_vehicle());

        if(vehicle.get().getTipo().equals(TypeVehicle.CARRO)){
            establishment.get().setQtdVagaCarro(establishment.get().getQtdVagaCarro() - 1);
        }else if (vehicle.get().getTipo().equals(TypeVehicle.MOTO)){
            establishment.get().setQtdVagaMoto(establishment.get().getQtdVagaMoto() - 1);
        }

        if(establishment.get().getQtdVagaCarro() < 0){
            throw new Exception("Todas as vagas de carro estão ocupadas!");
        }

        if(establishment.get().getQtdVagaMoto() < 0){
            throw new Exception("Todas as vagas de moto estão ocupadas!");
        }
        EstablishmentDTO establishmentDTO = new EstablishmentDTO(establishment.get().getNome(), establishment.get().getCnpj(),establishment.get().getEndereco(),establishment.get().getTelefone(),establishment.get().getQtdVagaMoto(),establishment.get().getQtdVagaCarro());

        establishmentService.saveEstablishment(establishmentDTO);
        return establishment;
    }
}
