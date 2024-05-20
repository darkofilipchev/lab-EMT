package org.example.movies.service;

import org.example.movies.domain.models.Movie;
import org.example.movies.domain.models.MovieId;
import org.example.movies.service.form.MovieForm;

import java.util.List;

public interface MovieService {

    Movie findById(MovieId id);

    List<Movie> findAll();

    Movie createMovie(MovieForm movieForm);

    Movie orderItemCreate(MovieId movieId, int quantity);

    Movie orderItemRemove(MovieId movieId, int quantity);
}
