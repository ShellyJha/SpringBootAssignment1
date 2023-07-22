package com.springboot.assignmentone;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AssignmentoneApplication implements CommandLineRunner {
	@Autowired
	private ApplicationContext appContext;

	public static void main(String[] args) {
		SpringApplication.run(AssignmentoneApplication.class, args);
	}

	// Display springboot default created beans on console
	@Override

	public void run(String... args) throws Exception {
		String[] springCreatedBeans = appContext.getBeanDefinitionNames();
		Arrays.sort(springCreatedBeans);
		for (String bean : springCreatedBeans) {
			System.out.println(bean);

		}
	}
}
