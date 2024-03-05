package com.example.Ex1UnitTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	private UserRepository userRepository;

	@PostMapping("/create")
	public Users createUser (@RequestBody Users users){
		return userRepository.save(users);
	}

	@GetMapping("/get/{id}")
	public Users getUserById(@PathVariable Long id){
		return userRepository.findById(id).orElse(null);
	}
	@PutMapping("/put/{id}")
	public Users putUser(@PathVariable Long id, @RequestBody Users users){
		Users users1 = userRepository.getReferenceById(id);
		users1.setName(users.getName());
		users1.setSurname(users.getSurname());
		users1.setMail(users.getMail());
		return userRepository.save(users1);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable Long id){
		userRepository.deleteById(id);
	}

}
