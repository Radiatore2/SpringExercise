package com.example.Progetto3Prova.Vehicles.EntitiesOfVehicles;

import java.time.LocalDate;

public class Motorcycles extends Vehicles {
	public Motorcycles(Long id, String brand, String model, Integer displacement, String color, String power, String transmissionType, LocalDate yearOfRegistration, String fuelType, double price, double discountPrice, String accessories, String condition, Status status) {
		super(id, brand, model, displacement, color, power, transmissionType, yearOfRegistration, fuelType, price, discountPrice, accessories, condition, status);
	}
}
