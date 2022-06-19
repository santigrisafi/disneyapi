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

	@GetMapping
	public List<Char> getCharInfo(){
		return iCharService.getAllCharsInfo();
	}
	
	@PostMapping
	public Char crateChar(@RequestBody Char character) {
		return iCharService.createChar(character);
	}

	//TODO: fix error handling
	@DeleteMapping("/{idChar}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteChar(@PathVariable Integer idChar) {
		try {
			iCharService.deleteChar(idChar);
		} catch (Exception e) {

		}
	}
	
	@PutMapping("/{idChar}")
	public void updateChar(@PathVariable Integer idChar, @RequestBody Char character) {
		character.idChar = idChar;
		iCharService.updateChar(character);
	}
	
	@GetMapping("/namechar")
	public List<Char> findByNameChar(@RequestBody Char character){
		return iCharService.findByNameChar(character.nameChar);
	}
}
