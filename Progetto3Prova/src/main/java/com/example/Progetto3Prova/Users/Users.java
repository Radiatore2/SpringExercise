package com.example.Progetto3Prova.Users;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUser;
	@Column(nullable = false, name = "tipo")
	@Enumerated(EnumType.STRING)
	private UsersEnum type;
	@Column(nullable = false, name = "nome")
	private String name;
	@Column(nullable = false, name = "cognome")
	private String surname;
	@Column(nullable = false, name = "cellulare")
	private Integer phoneNumber;
	@Column(nullable = false, name = "email")
	private String email;
	@Column(nullable = false, name = "password")
	private String password;
}
