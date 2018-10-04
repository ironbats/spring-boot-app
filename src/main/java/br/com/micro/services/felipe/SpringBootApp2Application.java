package br.com.micro.services.felipe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableMongoRepositories("br.com.micro.services.felipe.repository")
@EnableJpaRepositories("br.com.micro.services.felipe.repository")
public class SpringBootApp2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApp2Application.class, args);
	}
	
	
	
	
}
