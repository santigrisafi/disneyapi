package com.disney.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.disney.pojo.Genre;

public interface IGenreService {
	
	public void postGenre(Genre genre);
	
	public void putGenre(Genre genre);
	
	public void deleteGenre(Integer idGenre);
	
	public Optional<Genre> findByIdGenre(Integer idGenre);
	
	public List<Genre> findByGenreName(String genreName);
	
	public List<Genre> showAllGenres();

}
