package com.example.Ex1UnitTest;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class Ex1UnitTestApplicationTests {

	@Autowired
	private UserController userController;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private ObjectMapper objectMapper;
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testCreateUser() throws Exception {
		Users users = new Users(1L, "Alberto", "Rossi", "rossi@gmail.com");
		mockMvc.perform(post("/api/create")
				.contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(users)))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.id").exists())
				.andExpect(jsonPath("$.name").value("Alberto"))
				.andExpect(jsonPath("$.surname").value("Rossi"))
				.andExpect(jsonPath("$.mail").value("rossi@gmail.com"));

	}
	@Test
	public void testGetUser() throws  Exception{
		Users users = new Users(1L, "Alberto", "Rossi", "rossi@gmail.com");
		userRepository.save(users);
		mockMvc.perform(get("/api/get/{id}", users.getId()))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.id").value(users.getId()))
				.andExpect(jsonPath("$.name").value("Alberto"))
				.andExpect(jsonPath("$.surname").value("Rossi"))
				.andExpect(jsonPath("$.mail").value("rossi@gmail.com"));
	}
	@Test
	public void testPutUser() throws Exception{
		Users users = new Users(1L, "Alberto", "Rossi", "rossi@gmail.com");
		userRepository.save(users);
		Users updateUsers = new Users(1L, "Mario", "Neri", "neri@gmail.com");
		mockMvc.perform(put("/api/put/{id}", users.getId())
						.contentType(MediaType.APPLICATION_JSON)
						.content(objectMapper.writeValueAsString(updateUsers)))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.id").exists())
				.andExpect(jsonPath("$.name").value("Mario"))
				.andExpect(jsonPath("$.surname").value("Neri"))
				.andExpect(jsonPath("$.mail").value("neri@gmail.com"));
	}
	@Test
	public void deleteUserById() throws Exception{
		Users users = new Users(1L, "Alberto", "Rossi", "rossi@gmail.com");
		userRepository.save(users);
		mockMvc.perform(delete("/api/delete/{id}", users.getId()))
				.andExpect(status().isOk());
	}
}
