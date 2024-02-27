package CRUDTEST.Ex1CRUDTest;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;


import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles(value ="test")
class Ex1CrudTestApplicationTests {
	@Autowired
	private StudentService studentService;
	@Autowired
	private StudentController studentController;
	@Autowired
	private ObjectMapper objectMapper;
	@Autowired
	private MockMvc mockMvc;

	@Test
	void StudentServiceLoads() {
		assertThat(studentService).isNotNull();
	}
	@Test
	void StudentControllerLoads(){
		assertThat(studentController).isNotNull();
	}
	private Student createStudent() throws Exception {
		Student student = new Student();
		student.setId(1L);
		student.setName("Andrea");
		student.setSurname("Rossi");
		student.setWorking(true);
		String studentJSon = objectMapper.writeValueAsString(student);
		MvcResult result = this.mockMvc.perform(post("/add")
				.contentType(MediaType.APPLICATION_JSON)
				.content(studentJSon))
				.andExpect(status().isOk())
				.andReturn();
				return objectMapper.readValue(result.getResponse().getContentAsString(), Student.class);
	}
	private Student getStudent(Long id) throws Exception{
		MvcResult result = this.mockMvc.perform(get("/getStudent/{id}" + id))
				.andDo(print())
				.andExpect(status().isOk())
				.andReturn();
		String studentJSon = result.getResponse().getContentAsString();
		return objectMapper.readValue(studentJSon, Student.class);
	}
	@Test
	void createStudentTest() throws Exception{
		Student student = createStudent();
		assertThat(student.getId()).isNotNull();
	}
}
