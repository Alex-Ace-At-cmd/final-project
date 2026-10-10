package org.example.dao;

import org.example.model.Movie;

import java.util.List;

public interface MovieDao {

    void saveMovie(Movie movie);

    void removeMovieById(Long id);

    void updateMovie(Movie movie);

    List<Movie> getAllMovies();

    Movie getMovie(Long id);

    List<Movie> searchMovies(String title);


}
