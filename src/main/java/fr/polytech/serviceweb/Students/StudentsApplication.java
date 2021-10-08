package fr.polytech.serviceweb.Students;

import fr.polytech.serviceweb.Students.Controller.StudentController;
import fr.polytech.serviceweb.Students.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentsApplication implements CommandLineRunner {

	@Autowired
	private StudentController studentController;

	public static void main(String[] args) {
		SpringApplication.run(StudentsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Iterable<Student> students = studentController.getStudents();
		students.forEach(e -> System.out.println(e.getName()));
	}
}
