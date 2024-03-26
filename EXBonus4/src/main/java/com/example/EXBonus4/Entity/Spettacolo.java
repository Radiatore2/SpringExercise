package com.example.EXBonus4.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

//Spettacolo --> Sala && Prenotazioni
@Entity
@Data
@Table
@NoArgsConstructor
@AllArgsConstructor
public class Spettacolo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSpettacolo;
	@Column(nullable = false)
	private String titolo;
	private Date dataOra;

	@OneToMany
	private List<Prenotazioni> listaPrenotazioni;

	@ManyToMany
	private List<Sala> listaSala;
}
