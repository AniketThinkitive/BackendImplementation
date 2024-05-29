package com.restapi.demorestapi;

import controllers.BookController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"controllers"})//we give package name  when we have controller in other package
@ComponentScan(basePackages={"service"})
//@ComponentScan(basePackageClasses= BookController.class)//we give direct class name when the controller class package is different.
public class DemorestapiApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemorestapiApplication.class, args);

		System.out.println("Hello world");
	}

}
