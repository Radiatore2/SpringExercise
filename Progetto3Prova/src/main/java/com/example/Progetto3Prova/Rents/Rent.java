package com.example.Progetto3Prova.Rents;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rent {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRent;
	@Column(nullable = false, name = "inizio_noleggio")
	private Date startRent;
	@Column(nullable = false, name = "fine_noleggio")
	private Date endRent;
	@Column(nullable = false, name = "noleggio_giornaliero")
	private double dailyRent;
	@Column(nullable = false, name = "giorni_totale_noleggio")
	private double totalRent;
	@Column(nullable = false, name = "pagato")
	private boolean payed;
	@Column(nullable = false, name = "veicolo_noleggiato")
	private String rentedVehicle;
}
