package com.goutham.MovieApplication.repository;

import com.goutham.MovieApplication.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Long> {

    List<Movie> getMovieByDirector(String director);
}