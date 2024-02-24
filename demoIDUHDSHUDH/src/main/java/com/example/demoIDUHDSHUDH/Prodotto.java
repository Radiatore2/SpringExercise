package com.example.demoIDUHDSHUDH;
//Si scriva un'applicazione in Spring Boot che gestisce una lista di Prodotti e permette di
//ottenere tutti i prodotti presenti con una richiesta GET e uno solo con una Get specifica per
//id
public class Prodotto {
	private Integer id;
	private String nome;
	private double prezzo;

	public Prodotto(Integer id, String nome, double prezzo) {
		this.id = id;
		this.nome = nome;
		this.prezzo = prezzo;
	}

	public Prodotto(){

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return "Prodotto{" +
				"id=" + id +
				", nome='" + nome + '\'' +
				", prezzo=" + prezzo +
				'}';
	}
}
