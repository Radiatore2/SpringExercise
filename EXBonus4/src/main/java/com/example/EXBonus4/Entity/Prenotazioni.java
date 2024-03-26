package com.example.EXBonus4.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//Prenotazioni --> Spettacolo && Clienti
@Entity
@Data
@Table
@NoArgsConstructor
@AllArgsConstructor
public class Prenotazioni {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPren;
	@Column(nullable = false)
	private int numeroPosti;

	@ManyToOne
	private Clienti clienti;

	@ManyToOne
	private Spettacolo spettacolo;
}
