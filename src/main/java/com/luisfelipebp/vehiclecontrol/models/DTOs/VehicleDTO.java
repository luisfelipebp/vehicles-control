package com.luisfelipebp.vehiclecontrol.models.DTOs;

import com.luisfelipebp.vehiclecontrol.models.enums.TypeVehicle;

public record VehicleDTO(String marca, String modelo, String cor, String placa, TypeVehicle tipoVeiculo) {
}
