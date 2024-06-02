package com.moviesms.ratingdataservice.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor


public class Rating {
    private String movieId;
    private int rating;


}
