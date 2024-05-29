package com.test.demotest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemotestApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(DemotestApplication.class, args);
		User.UserRepository userRepository=context.getBean(User.UserRepository.class);
		User user=new User();
		user.setName("Aniket");
		user.setCity("Pune");
		user.setStatus("I am Java Programmer");

		User user1=userRepository.save(user);
		System.out.println(user1);


	}

}
