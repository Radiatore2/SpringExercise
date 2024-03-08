package com.example.E1.Interceptor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/time")
public class BasiController {

	@GetMapping
	public LocalDateTime time(){
		return LocalDateTime.now();
	}
}
