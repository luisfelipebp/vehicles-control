package com.luisfelipebp.vehiclecontrol.models;

import com.luisfelipebp.vehiclecontrol.models.DTOs.VehicleDTO;
import com.luisfelipebp.vehiclecontrol.models.enums.TypeVehicle;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "vechicles")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {

    public Vehicle(VehicleDTO vehicleDTO){
        this.marca = vehicleDTO.marca();
        this.modelo = vehicleDTO.modelo();
        this.cor = vehicleDTO.cor();
        this.placa = vehicleDTO.placa();
        this.tipo = vehicleDTO.tipoVeiculo();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String marca;

    private String modelo;

    private String cor;

    private String placa;

    @Enumerated(EnumType.STRING)
    private TypeVehicle tipo;
}
