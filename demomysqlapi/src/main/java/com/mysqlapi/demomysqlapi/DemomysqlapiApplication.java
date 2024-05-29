package com.mysqlapi.demomysqlapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

public class DemomysqlapiApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(DemomysqlapiApplication.class, args);
		System.out.println("main run");

	}

}
