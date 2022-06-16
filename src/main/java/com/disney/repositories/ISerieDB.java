package com.disney.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.disney.pojo.Serie;

@Repository
public interface ISerieDB extends JpaRepository<Serie, Integer>{
	public abstract List<Serie> findByTitleSerie(String titleSerie);
	public abstract List<Serie> findByScoreUser(Double scoreUser);
	public abstract List<Serie> findByDateReleaseSerie(String dateReleaseSerie);
}
