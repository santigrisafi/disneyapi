package com.disney.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.disney.pojo.Char;

public interface ICharService {
	
	public void createChar(Char character);
	
	public void updateChar(Char character);
	
	public List<Char> getCharInfo();
	
	public void deleteChar(Integer idChar);
	
	public Optional<Char> findByIdChar(Integer idChar);
	
	public List<Char> findByNameChar(String nameChar);
	
}
