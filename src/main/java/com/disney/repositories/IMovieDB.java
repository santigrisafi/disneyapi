package com.disney.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.disney.pojo.Movie;

@Repository
public interface IMovieDB extends JpaRepository<Movie, Integer>{
	public abstract List<Movie> findByTitleMovie(String titleMovie);
	public abstract List<Movie> findByScoreUser(Double scoreUser);
	public abstract List<Movie> findByDateReleaseMovie(String dateReleaseMovie);
}
