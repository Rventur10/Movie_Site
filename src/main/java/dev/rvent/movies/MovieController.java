package dev.rvent.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Autowired
    private MovieSerivice movieService;

    @GetMapping
    public ResponseEntity<List<Movies>> getAllMovies() {
        List<Movies> movies = movieService.allMovies(); // Fetch the movies



        if (movies.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT); // Return 204 if no movies found
        }

        return new ResponseEntity<>(movies, HttpStatus.OK); // Return 200 with movies
    }
}