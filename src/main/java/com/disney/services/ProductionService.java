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
	IProductionDB iProductionDB;

	@Override
	public void createProduction(Productions production) {
		iProductionDB.save(production);
	}

	@Override
	public void deleteProduction(Integer idProduction) {
		iProductionDB.deleteById(idProduction);
	}

	@Override
	public void updateProduction(Productions production) {
		iProductionDB.save(production);
	}

	@Override
	public List<Productions> getProductionInfo() {
		return iProductionDB.findAll();
	}

	@Override
	public Optional<Productions> findByIdProduction(Integer idProduction) {
		return iProductionDB.findById(idProduction);
	}

	@Override
	public List<Productions> findByTitle(String titleProduction) {
		return iProductionDB.findByTitle(titleProduction);
	}
}
