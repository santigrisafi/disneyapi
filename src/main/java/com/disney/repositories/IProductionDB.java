package com.disney.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.disney.pojo.Productions;

@Repository
public interface IProductionDB extends JpaRepository<Productions, Integer>{
	public abstract List<Productions> findByTitle(String title);
	public abstract List<Productions> findByScore(Double score);
	public abstract List<Productions> findByReleaseDate(String releaseDate);
}
