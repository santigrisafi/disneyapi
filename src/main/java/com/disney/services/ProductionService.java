package com.disney.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.disney.pojo.Productions;
import com.disney.repositories.IProductionDB;
import com.disney.services.interfaces.IProductionService;

@Service
public class ProductionService implements IProductionService {
	
	@Autowired
	IProductionDB iMovieDB;

	@Override
	public void postProduction(Productions movie) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProduction(Integer idMovie) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void putProduction(Productions movie) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Productions> showAllProductions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Productions> findByIdProduction(Integer idMovie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Productions> findByScore(Double scoreUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Productions> findByTitle(String titleMovie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Productions> findByReleaseDate(String releaseDate) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
