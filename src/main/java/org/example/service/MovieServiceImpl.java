package org.example.service;

import org.example.dao.MovieDaoImpl;
import org.example.model.Movie;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieServiceImpl implements MovieService{

    private final MovieDaoImpl movieDao;

    public MovieServiceImpl(MovieDaoImpl movieDao) {
        this.movieDao = movieDao;
    }

    @Override
    public void saveMovie(Movie movie) {
        movieDao.saveMovie(movie);
    }

    @Override
    public void removeMovieById(Long id) {
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
