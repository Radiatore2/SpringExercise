package com.example.Ex2Interceptor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basic")
public class BasicController {
	@GetMapping("")
	public String welcome(@RequestParam String user){
		String message = "Welcome " + user;
		return message;
	}
}