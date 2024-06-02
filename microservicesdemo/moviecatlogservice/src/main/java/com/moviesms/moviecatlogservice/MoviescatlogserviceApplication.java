package com.moviesms.moviecatlogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class MoviescatlogserviceApplication {


	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();

	}

	@Bean
	public WebClient.Builder getWebClientBuilder(){
		return  WebClient.builder();

	}



	public static void main(String[] args)
	{




		SpringApplication.run(MoviescatlogserviceApplication.class, args);
		System.out.println("Movie-Catlog=service-main-running");
	}

}
