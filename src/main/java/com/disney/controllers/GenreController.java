package com.disney.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.disney.pojo.Genre;
import com.disney.services.interfaces.IGenreService;

@RestController
@RequestMapping("genres")
public class GenreController {
	
	@Autowired
	IGenreService iGenreService;
	
	@GetMapping
	public List<Genre> showAllGenres(){
		return iGenreService.showAllGenres();
	}
	
	@PostMapping
	public void postGenre(@RequestBody Genre genre) {
		iGenreService.postGenre(genre);
	}
	
	@PutMapping("/{idGenre}")
	public void putGenre(@RequestBody Genre genre, @PathVariable Integer idGenre) {
		genre.idGenre = idGenre;
		iGenreService.putGenre(genre);
	}
	
	@DeleteMapping("/{idGenre}")
	public void deleteGenre(@PathVariable Integer idGenre) {
		iGenreService.deleteGenre(idGenre);
	}
	
	@GetMapping("/idGenre/{idGenre}")
	public Optional<Genre> showByIdGenre(@PathVariable Integer idGenre){
		return iGenreService.findByIdGenre(idGenre);
	}
	
	@GetMapping("/Genre/{genreName}")
	public List<Genre> showGenreByGenreName(@PathVariable String genreName){
		return iGenreService.findByGenreName(genreName);
	}
	
	
	

}
