package fr.polytech.serviceweb.Students;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BaseH2ApplicationTests {

	@Autowired
	private StudentRepositoryImplement bs;

	@Test
	void contextLoads() {
	}
}
