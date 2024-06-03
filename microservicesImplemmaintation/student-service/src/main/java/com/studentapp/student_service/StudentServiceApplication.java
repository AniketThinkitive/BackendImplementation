package com.studentapp.student_service;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class StudentServiceApplication {





	public static void main(String[] args)
	{


		SpringApplication.run(StudentServiceApplication.class, args);
		System.out.println("student main running");
	}

}
