package com.disney.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.disney.pojo.Genre;
import com.disney.services.interfaces.IGenreService;

@RestController
@RequestMapping(value="genres")
public class GenreController {
	
	@Autowired
	IGenreService iGenreService;
	
	@PostMapping
	public void createGenre(@RequestBody Genre genre) {
		iGenreService.createGenre(genre);
	}
}
