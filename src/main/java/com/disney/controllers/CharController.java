package com.disney.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.disney.pojo.Char;
import com.disney.services.interfaces.ICharService;

@RestController
@RequestMapping(value="/chars")
public class CharController {
	
	@Autowired
	ICharService iCharService;

	@GetMapping("/ping")
	public String ping(){
		return "pong";
	}

	@GetMapping
	public List<Char> getCharInfo(){
		return iCharService.getCharInfo();
	}
	
	@PostMapping
	public void crateChar(@RequestBody Char character) {
		iCharService.createChar(character);
	}
	
	@DeleteMapping("/{idChar}")
	public void deleteChar(@PathVariable Integer idChar) {
		iCharService.deleteChar(idChar);
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
