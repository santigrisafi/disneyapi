package com.disney.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.disney.pojo.Productions;

public interface IProductionService {
	
	public void createProduction(Productions production);
	
	public void deleteProduction(Integer idProduction);
	
	public void updateProduction(Productions production);
	
	public List<Productions> getProductionInfo();
	
	public Optional<Productions> findByIdProduction(Integer idProduction);
	
	public List<Productions> findByTitle(String titleProduction);
	
}
