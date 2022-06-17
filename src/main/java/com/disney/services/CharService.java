package com.disney.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.disney.pojo.Char;
import com.disney.repositories.ICharacterDB;
import com.disney.services.interfaces.ICharService;

@Service
public class CharService implements ICharService{
	
	@Autowired(required=true)
	ICharacterDB iCharacterDB;

	@Override
	public Char createChar(Char character) {
		return iCharacterDB.save(character);
	}

	@Override
	public void updateChar(Char character) {
		iCharacterDB.save(character);
	}

	@Override
	public List<Char> getCharInfo() {
		return iCharacterDB.findAll();
	}

	@Override
	public void deleteChar(Integer idChar) {
		iCharacterDB.deleteById(idChar);
	}

	@Override
	public Optional<Char> findByIdChar(Integer idChar) {
		return iCharacterDB.findById(idChar);
	}

	@Override
	public List<Char> findByNameChar(String nameChar) {
		return iCharacterDB.findByNameChar(nameChar);
	}

}
