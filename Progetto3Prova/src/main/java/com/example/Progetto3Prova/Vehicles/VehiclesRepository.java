package com.example.Progetto3Prova.Vehicles;

import com.example.Progetto3Prova.Vehicles.EntitiesOfVehicles.Vehicles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VehiclesRepository extends JpaRepository<Vehicles, Long> {
}
