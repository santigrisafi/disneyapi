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
	
	@Autowired
	ICharacterDB iCharacterDB;

	@Override
	public void postChar(Char character) {
		iCharacterDB.save(character);
	}

	@Override
	public void putChar(Char character) {
		iCharacterDB.save(character);
	}

	@Override
	public List<Char> showAllChars() {
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
	public List<Char> findByCharName(String charName) {
		return iCharacterDB.findByCharName(charName);
	}

	@Override
	public List<Char> findByHeight(Double height) {
		return iCharacterDB.findByHeightChar(height);
	}

	@Override
	public List<Char> findByWeight(Double weight) {
		return iCharacterDB.findByWeightChar(weight);
	}

	@Override
	public List<Char> findByAgeChar(Integer ageChar) {
		return iCharacterDB.findByAgeChar(ageChar);
	}

	@Override
	public List<Char> findByLastName(String lastName) {
		return iCharacterDB.findByLastNameChar(lastName);
	}

	@Override
	public Char findByImageUrl(String imageUrl) {
		return iCharacterDB.findByImageUrl(imageUrl);
	}

}
