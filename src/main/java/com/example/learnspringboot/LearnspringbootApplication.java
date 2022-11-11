package com.example.learnspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnspringbootApplication {

	public static void main(String[] args) {
		//initialize the spring container
		ConfigurableApplicationContext context = SpringApplication.run(LearnspringbootApplication.class, args);
		
		Student stu = context.getBean(Student.class);
		stu.show();
		
		
		
	
	}

}
