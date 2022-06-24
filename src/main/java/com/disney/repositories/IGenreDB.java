package com.disney.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.disney.pojo.Genre;

@Repository
public interface IGenreDB extends JpaRepository<Genre, Integer> {
	public abstract List<Genre> findByNameGenre(String nameGenre);
}
