package com.moviesms.moviecatlogservice.controller;

import com.moviesms.moviecatlogservice.entity.CatlogMovies;
import com.moviesms.moviecatlogservice.entity.InfoMovies;
import com.moviesms.moviecatlogservice.entity.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.awt.event.WindowFocusListener;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catlog")
public class MovieCatlogController {



//get all movies IDs



//    foe each moview services call mvie info services and get details



    //////with autowiring
    @Autowired
    private RestTemplate restTemplate;


    ////webclient autowring
    @Autowired
    private WebClient.Builder  webClientBuilder;



    //put all of them together
    @GetMapping("/{userId}")
    public List<CatlogMovies> getCatlog(@PathVariable  String userId) {



        //////webClient calls
        ////every time we need to create web client builder
//        WebClient.Builder builder=WebClient.builder();

        ////without bean
//        RestTemplate restTemplate=new RestTemplate();


            //////single movie
//        restTemplate.getForObject("http://localhost:8081/catlog/firsts", InfoMovies.class);

        List<Rating> ratings= Arrays.asList(
                new Rating("1234",4),
                new Rating("5678",3),
                new Rating("5678",1),
                new Rating("5678",4)


                );



        //////when uding RESTTEMPLATE
      return  ratings.stream().map(rating -> {
                  InfoMovies infoMovies= restTemplate.getForObject("http://localhost:8082/info/" + rating.getMovieId(), InfoMovies.class);
                  return  new CatlogMovies(infoMovies.getName(),"desc",rating.getRating());



                  //////when using WEBCLIENT

//        return  ratings.stream().map(rating -> {
//             InfoMovies infoMovies=    webClientBuilder.build()
//                        .get()//used .post()
//                        .uri("http://localhost:8082/info/" + rating.getMovieId())
//                        .retrieve()
//                        .bodyToMono(InfoMovies.class)
//                        .block();
//                  return  new CatlogMovies(infoMovies.getName(),"desc",rating.getRating());




              })
        .collect(Collectors.toList());

    }
}
