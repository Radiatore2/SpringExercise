package com.example.Deploy2.Ex2Deploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
	int var1 = 2;
	int var2 = 3;

	@GetMapping("")
	public int sumVar(){
		int somma = var1 + var2;
		return somma;
	}
}
