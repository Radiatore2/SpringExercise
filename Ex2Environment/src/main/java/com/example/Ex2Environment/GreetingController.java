package com.example.Ex2Environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	@Autowired
	private Environment environment;

	@GetMapping("/greeting")
	public String getGreeting() {
		String var = environment.getProperty("myCustomVarTree.customVar");
		return var;
	}
}