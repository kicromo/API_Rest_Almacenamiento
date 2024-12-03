package com.example.fantasymovies.controller;

import com.example.fantasymovies.model.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FantasyMoviesController {

    @GetMapping("/api/fantasy-movies")
    public List<Movie> getFantasyMovies() {
        return Arrays.asList(
                new Movie(1, "The Lord of the Rings: The Return of the King", 2003, "Peter Jackson"),
                new Movie(2, "Harry Potter and the Sorcerer's Stone", 2001, "Chris Columbus"),
                new Movie(3, "Pan's Labyrinth", 2006, "Guillermo del Toro"),
                new Movie(4, "The Chronicles of Narnia: The Lion, the Witch and the Wardrobe", 2005, "Andrew Adamson"),
                new Movie(5, "Spirited Away", 2001, "Hayao Miyazaki")
        );
    }
    
}
