package com.example.demo;

import javax.print.DocFlavor;

public class Libri {
	private int id;
	private String titolo;
	private String autore;

	public Libri(int id, String titolo, String autore) {
		this.id = id;
		this.titolo = titolo;
		this.autore = autore;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}
}
