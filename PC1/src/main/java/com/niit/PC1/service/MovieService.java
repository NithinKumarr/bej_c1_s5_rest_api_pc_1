package com.niit.PC1.service;

import com.niit.PC1.domain.Movie;

import java.util.List;

public interface MovieService {
    public Movie addMovie(Movie m);
    public List<Movie> getAllMovie();
}
