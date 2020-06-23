package com.example.demo;

import com.example.demo.backend.Person;
import com.example.demo.backend.RepositoryPerson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadDate(RepositoryPerson personRepository){
		return args -> {
			personRepository.save(new Person("x1","y1"));
			personRepository.save(new Person("x2","y2"));
			personRepository.save(new Person("x3","y3"));
			personRepository.save(new Person("x4","y4"));
			personRepository.save(new Person("x5","y5"));
		};


	}

}
