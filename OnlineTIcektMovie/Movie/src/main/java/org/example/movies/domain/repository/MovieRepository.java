package org.example.movies.domain.repository;

import org.example.movies.domain.models.Movie;
import org.example.movies.domain.models.MovieId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, MovieId> {
}
