package com.moviesms.ratingdataservice.controller;


import com.moviesms.ratingdataservice.entity.Rating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {

    @GetMapping("/{movieId}")
    public Rating getRating(@PathVariable String movieId){
        return new Rating(movieId,4);
    }


    @GetMapping("users/{userId}")
    public List<Rating> getUserRating(@PathVariable String userId){

        List<Rating> ratings= Arrays.asList(
                new Rating("1234",4),
                new Rating("5678",3),
                new Rating("5678",1),
                new Rating("5678",4)
        );
        return ratings;
    }




}
