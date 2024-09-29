package dev.rvent.movies;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MovieSerivice {

    @Autowired
    private MovieRepository movieRepository;


    public List<Movies> allMovies(){
        return movieRepository.findAll();
    }
}
