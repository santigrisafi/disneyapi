package com.disney.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.disney.pojo.Char;
import com.disney.services.interfaces.ICharService;

@RestController
@RequestMapping(value="chars")
public class CharController {
	
	@Autowired
	ICharService iCharService;
	
	@PostMapping
	public Char crateChar(@RequestBody Char character) {
		return iCharService.createChar(character);
	}

	@DeleteMapping("/{idChar}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteChar(@PathVariable Integer idChar) {
		iCharService.deleteChar(idChar);
	}
	
	@PutMapping("/{idChar}")
	public void updateChar(@PathVariable Integer idChar, @RequestBody Char character) {
		character.idChar = idChar;
		iCharService.updateChar(character);
	}
}
