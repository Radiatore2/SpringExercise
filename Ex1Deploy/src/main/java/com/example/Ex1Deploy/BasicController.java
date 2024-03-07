package com.example.Ex1Deploy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

@RestController
public class BasicController {

	@Autowired
	private Environment environment;

	@Value("Andrea")
	String devName;

	@GetMapping("")
	public String getDevName(){
		return devName;
}
}
