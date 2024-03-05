package com.example.Ex1Interceptor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/time")
public class BasicController {
	private APILoggingInterceptor apiInterceptor;


	@GetMapping()
	public String getCurrentDateTime() {
		return "Current Date/Time: " + java.time.LocalDateTime.now();
	}
}
