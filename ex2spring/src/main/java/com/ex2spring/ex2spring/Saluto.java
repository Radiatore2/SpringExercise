package com.ex2spring.ex2spring;

public class Saluto {

	private String nome;
	private String provincia;
	private String saluto;

	public Saluto(String nome, String provincia, String saluto) {
		this.nome = nome;
		this.provincia = provincia;
		this.saluto = saluto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getSaluto() {
		return saluto;
	}

	public void setSaluto(String saluto) {
		this.saluto = saluto;
	}
}
