package fr.polytech.serviceweb.baseH2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import fr.polytech.serviceweb.baseH2.repository.StudentService;

@SpringBootTest
class BaseH2ApplicationTests {

	@Autowired
	private StudentService bs;

	@Test
	void contextLoads() {
	}
}
