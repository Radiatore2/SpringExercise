package CRUDTEST.Ex1CRUDTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ActiveProfiles(value ="test")
class Ex1CrudTestApplicationTests {
	@Autowired
	private StudentService studentService;
	@Autowired
	private StudentController studentController;

	@Test
	void StudentServiceLoads() {
		assertThat(studentService).isNotNull();
	}
	@Test
	void StudentControllerLoads(){
		assertThat(studentController).isNotNull();
	}

}
