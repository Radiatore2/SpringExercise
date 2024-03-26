package com.example.EXBonus4.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//Sala --> Spettacolo
@Entity
@Data
@Table
@NoArgsConstructor
@AllArgsConstructor
public class Sala {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSala;
	@Column(nullable = false)
	private String nomeSala;
	private int postoLibero;

	@ManyToMany
	private List<Spettacolo> listaSpettacolo;
}
