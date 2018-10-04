package br.com.micro.services.felipe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("br.com.micro.services.felipe.repository")
public class SpringBootApp2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApp2Application.class, args);
	}
	
	
	
	
}
