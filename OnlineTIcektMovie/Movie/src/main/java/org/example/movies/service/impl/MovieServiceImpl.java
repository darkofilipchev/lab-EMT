package org.example.movies.service.impl;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.example.movies.domain.models.Movie;
import org.example.movies.domain.models.MovieId;
import org.example.movies.domain.repository.MovieRepository;
import org.example.movies.service.MovieService;
import org.example.movies.service.form.MovieForm;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    @Override
    public Movie findById(MovieId id) {
        return movieRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    @Override
    public Movie createMovie(MovieForm movieForm) {
        Movie movie = Movie.build(movieForm.getCast(), movieForm.getMovieName(), movieForm.getYearOfProduction());
        movieRepository.save(movie);
        return movie;
    }

    @Override
    public Movie orderItemCreate(MovieId movieId, int quantity) {
        return null;
    }

    @Override
    public Movie orderItemRemove(MovieId movieId, int quantity) {
        return null;
    }
}
