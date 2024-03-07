package com.example.Ex1CustomQuerry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/flights")
public class FlightController {

	@Autowired
	private FlightRepository flightRepository;

	private int numFlights = 50;

	@GetMapping("/provision")
	public void provisionFlight(){
		Random random = new Random();

		for(int i = 0; i < numFlights; i++){
			Flight flight = new Flight();
			flight.setDescription("Flight" + i);
			flight.setFromAirport("Airport" + random.nextInt(10));
			flight.setToAirport("Airport" + random.nextInt(10));
			flightRepository.save(flight);
		}
	}
	@GetMapping("/all")
	public List<Flight> getAllFlights(){
		return flightRepository.findAll();
	}
}
