package com.disney.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.disney.pojo.Productions;

public interface IProductionService {
	
	public void postProduction(Productions movie);
	
	public void deleteProduction(Integer idMovie);
	
	public void putProduction(Productions movie);
	
	public List<Productions> showAllProductions();
	
	public Optional<Productions> findByIdProduction(Integer idMovie);
	
	public List<Productions> findByScore(Double scoreUser);
	
	public List<Productions> findByTitle(String titleMovie);
	
	public List<Productions> findByReleaseDate(String releaseDate);
	
}
