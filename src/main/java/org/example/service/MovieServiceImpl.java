package org.example.service;

import jakarta.transaction.Transactional;
import org.example.dao.MovieDao;
import org.example.model.Movie;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class MovieServiceImpl implements MovieService{


    private final MovieDao movieDao;

    public MovieServiceImpl(MovieDao movieDao) {
        this.movieDao = movieDao;
    }



    @Override
    public void saveMovie(Movie movie) {
        movieDao.saveMovie(movie);
    }

    @Override
    public void removeMovieById(Long id) {
        if(movieDao.getMovie(id) == null) {
            throw new MovieNotFoundException(id);
        }
        movieDao.removeMovieById(id);
    }

    @Override
    public void updateMovie(Movie movie) {
        movieDao.updateMovie(movie);
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieDao.getAllMovies();
    }

    @Override
    public Movie getMovie(Long id) {
        return movieDao.getMovie(id);
    }

    public List<Movie> searchMovies(String name) {
        return movieDao.searchMovies(name);
    }

}

