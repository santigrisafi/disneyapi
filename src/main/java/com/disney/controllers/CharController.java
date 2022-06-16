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
	
	@GetMapping("")
	public List<Char> showAllChars(){
		return iCharService.showAllChars();
	}
	
	@PostMapping
	public void postChar(@RequestBody Char character) {
		iCharService.postChar(character);
	}
	
	@DeleteMapping("/{idChar}")
	public void deleteChar(@PathVariable Integer idChar) {
		iCharService.deleteChar(idChar);
	}
	
	@PutMapping("/{idChar}")
	public void putChar(@PathVariable Integer idChar, @RequestBody Char character) {
		character.idChar = idChar;
		iCharService.putChar(character);
	}
	
	@GetMapping("/weight")
	public List<Char> findByWeight(@RequestBody Char character){
		return iCharService.findByWeight(character.weightChar);
	}
	
	@GetMapping("/height")
	public List<Char> findByHeight(@RequestBody Char character){
		return iCharService.findByHeight(character.heightChar);
	}
	
	@GetMapping("/charName")
	public List<Char> findByNameChar(@RequestBody Char character){
		return iCharService.findByCharName(character.charName);
	}
	
	@GetMapping("/lastName")
	public List<Char> findByLastName(@RequestBody Char character){
		return iCharService.findByLastName(character.lastNameChar);
	}
	
	@GetMapping("/ageChar")
	public List<Char> findByAgeChar(@RequestBody Char character){
		return iCharService.findByAgeChar(character.ageChar);
	}
	
	@GetMapping("/imageUrl/{imageUrl}")
	public Char findByImageUrl(@PathVariable String imageUrl) {
		return iCharService.findByImageUrl(imageUrl);
	}

}
