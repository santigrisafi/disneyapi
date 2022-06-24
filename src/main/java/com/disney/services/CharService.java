package com.disney.services;

import com.disney.exception.CharacterAlreadyExistsException;
import com.disney.exception.NoSuchCharacterExistsException;
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
		Char existingChar = iCharacterDB.findById(character.idChar).orElse(null);
		if (existingChar == null){
			return iCharacterDB.save(character);
		}
		throw new CharacterAlreadyExistsException(character.idChar);
	}

	@Override
	public void updateChar(Char character) {
		checkCharacterExistence(character.idChar);
		iCharacterDB.save(character);
	}

	@Override
	public void deleteChar(Integer idChar) {
		checkCharacterExistence(idChar);
		iCharacterDB.deleteById(idChar);
	}

	@Override
	public Char findByIdChar(Integer idChar) {
		return iCharacterDB.findById(idChar).orElse(null);
	}

	private void checkCharacterExistence (Integer id) {
		Char existingChar = this.findByIdChar(id);
		if (existingChar == null) {
			throw new NoSuchCharacterExistsException(id);
		}
	}

}
