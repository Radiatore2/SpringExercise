package com.example.Progetto3Prova.Orders;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idOrders;
	@Column(nullable = false, name = "deposito")
	private int deposit;
	@Column(nullable = false, name = "pagato")
	private boolean payed;
	@Column(nullable = false, name = "stato_ordine")
	private String status;
	@Column(nullable = false, name = "ordinato/venduto")
	private boolean isOrdered;
}
