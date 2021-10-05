package fr.polytech.serviceweb.baseH2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({ "fr.polytech.serviceweb.baseH2" })
@EnableJpaRepositories("fr.polytech.serviceweb.baseH2.model.Student")
public class BaseH2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BaseH2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}