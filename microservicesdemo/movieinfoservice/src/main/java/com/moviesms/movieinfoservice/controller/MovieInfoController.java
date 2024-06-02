package com.moviesms.movieinfoservice.controller;

import com.moviesms.movieinfoservice.entity.InfoMovies;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class MovieInfoController {

    @GetMapping("/{movieId}")
    public InfoMovies getMovieInfo(@PathVariable String movieId){
        return new InfoMovies(movieId,"GO");
    }


}
