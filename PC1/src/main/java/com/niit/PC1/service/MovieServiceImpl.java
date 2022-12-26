package com.niit.PC1.service;

import com.niit.PC1.domain.Movie;
import com.niit.PC1.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }
    MovieRepository movieRepository;
    @Override
    public Movie addMovie(Movie m) {
        return movieRepository.save(m);
    }
    @Override
    public List<Movie> getAllMovie() {
        return (List<Movie>) movieRepository.findAll();
    }
}