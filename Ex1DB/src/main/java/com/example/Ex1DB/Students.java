package com.example.Ex1DB;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Students {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false, name = "Cognome")
	private String lastName;
	@Column(nullable = false, name = "Nome")
	private String firstName;
	@Column(nullable = false, unique = true, name = "Email")
	private String email;

	public Students(Long id, String lastName, String firstName, String email) {
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
	}

	public Students() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
