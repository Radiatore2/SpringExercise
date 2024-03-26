package com.example.EXBonus4.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//Clienti --> Prenotazioni
@Entity
@Data
@Table
@NoArgsConstructor
@AllArgsConstructor
public class Clienti {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private String nome;
	private String cognome;
	private String email;

	@OneToMany
	private List<Prenotazioni> listaPrenotazioni;
}
