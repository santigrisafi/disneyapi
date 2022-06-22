package com.disney.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.disney.pojo.Productions;

public interface IProductionService {
	
	public void createProduction(Productions movie);
	
	public void deleteProduction(Integer idMovie);
	
	public void updateProduction(Productions movie);
	
	public List<Productions> showAllProductions();
	
	public Optional<Productions> findByIdProduction(Integer idMovie);
	
	public List<Productions> findByScore(Double scoreUser);
	
	public List<Productions> findByTitle(String titleMovie);
	
}
