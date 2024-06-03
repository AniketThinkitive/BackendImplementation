package com.discovery_services.demodiscoveryservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DemodiscoveryservicesApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(DemodiscoveryservicesApplication.class, args);
		System.out.println("Discovry-service-main Running");

	}

}
