package com.disney.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.disney.pojo.Genre;
import com.disney.repositories.IGenreDB;
import com.disney.services.interfaces.IGenreService;

@Service
public class GenreService implements IGenreService {
	
	@Autowired
	IGenreDB iGenreDB;

	@Override
	public void createGenre(Genre genre) {
		iGenreDB.save(genre);
	}

	@Override
	public void updateGenre(Genre genre) {
		iGenreDB.save(genre);
	}

	@Override
	public void deleteGenre(Integer idGenre) {
		iGenreDB.deleteById(idGenre);
	}

	@Override
	public Optional<Genre> findByIdGenre(Integer idGenre) {
		return iGenreDB.findById(idGenre);
	}

	@Override
	public List<Genre> findByNameGenre(String nameGenre) {
		return iGenreDB.findByNameGenre(nameGenre);
	}

	@Override
	public List<Genre> getGenreInfo() {
		return iGenreDB.findAll();
	}
}
