package com.ex5Spring.ex5Spring;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/API")
public class NameController {
	@GetMapping("/name")
	public String getName(@RequestParam String name) {
		return name;
	}
	@PostMapping("/reverse-name")
	public String reverseName(@RequestParam String name) {
		StringBuilder reversedName = new StringBuilder();
		for (int i = name.length() - 1; i >= 0; i--) {
			reversedName.append(name.charAt(i));
		}
		return reversedName.toString();
	}

}
