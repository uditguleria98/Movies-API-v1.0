package com.movie.repository;

import com.movie.domain.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

  Optional<Movie> findByTitle(String title);
}
