package com.niit.PC1.control;

import com.niit.PC1.domain.Movie;
import com.niit.PC1.service.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class MovieControl {
    MovieService movieService;

    public MovieControl(MovieService movieService) {
        this.movieService = movieService;
    }
    @PostMapping("/movie")
    public ResponseEntity<?> saveMovie(@RequestBody Movie movie){
        Movie movie1=movieService.addMovie(movie);
        return new ResponseEntity(movie1, HttpStatus.CREATED);
    }
    @GetMapping("/movies")
    public ResponseEntity<?>getAllMovie(){
        List<Movie> list=movieService.getAllMovie();
        return new ResponseEntity<>(list,HttpStatus.OK);
    }
}
