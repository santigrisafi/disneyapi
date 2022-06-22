package com.disney.services;

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

}
