package com.studentapp.student_service.config;


import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class SdtudentConfig {




    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

//    @Bean
//    public WebClient webClient(){
//      return   WebClient
//                .builder()
//
//              .baseUrl("http://localhost:9091/address/getAddress/")
//                .build();
    }














