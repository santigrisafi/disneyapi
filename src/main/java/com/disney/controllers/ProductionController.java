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

import com.disney.pojo.Productions;
import com.disney.services.interfaces.IProductionService;

@RestController
@RequestMapping(value="productions")
public class ProductionController {
	
	@Autowired
	IProductionService iProductionService;
	
	@GetMapping
	public List<Productions> showAllMovie(){
		return iProductionService.showAllProductions();
	}
	
	@PostMapping
	public void createProduction(@RequestBody Productions production) {
		iProductionService.createProduction(production);
	}

	@PutMapping("/idProduction/{idProduction}")
	public void updateProduction(@RequestBody Productions production, @PathVariable Integer idMovie) {
		iProductionService.updateProduction(production);
	}
	
	@DeleteMapping("/{idProduction}")
	public void deleteProduction(@PathVariable Integer idProduction) {
		iProductionService.deleteProduction(idProduction);
	}
	
	@GetMapping("/title/{title}")
	public List<Productions> findByTitle(@PathVariable String title){
		return iProductionService.findByTitle(title);
	}
	
	@GetMapping("/{idProduction}")
	public Optional<Productions> findByIdProduction(@PathVariable Integer idProduction){
		return iProductionService.findByIdProduction(idProduction);
	}
}
