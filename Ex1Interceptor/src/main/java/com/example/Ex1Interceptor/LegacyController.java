package com.example.Ex1Interceptor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/legacy")
public class LegacyController {
	@GetMapping("")
	public String getLegacyResponse() {
		return "This is just old code";
	}
}
