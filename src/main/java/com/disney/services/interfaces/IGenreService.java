package com.disney.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.disney.pojo.Genre;

public interface IGenreService {
	
	public void createGenre(Genre genre);
	
	public void updateGenre(Genre genre);
	
	public void deleteGenre(Integer idGenre);
	
	public Optional<Genre> findByIdGenre(Integer idGenre);
	
	public List<Genre> findByNameGenre(String genreName);
	
	public List<Genre> getGenreInfo();

}
