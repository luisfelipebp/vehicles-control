package com.luisfelipebp.vehiclecontrol.repositories;

import com.luisfelipebp.vehiclecontrol.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
