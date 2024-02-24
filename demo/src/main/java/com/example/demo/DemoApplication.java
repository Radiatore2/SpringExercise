package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//Si scriva un'applicazione in Spring Boot che gestisce una lista di libri e permette di ottenere tutti
//i libri presenti con una richiesta GET e di aggiornare le informazioni di un particolare libro con
//una richiesta PUT

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
