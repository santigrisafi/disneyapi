package com.disney.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.disney.pojo.Char;

public interface ICharService {
	
	public void postChar(Char charcter);
	
	public void putChar(Char character);
	
	public List<Char> showAllChars();
	
	public void deleteChar(Integer idChar);
	
	public Optional<Char> findByIdChar(Integer idChar);
	
	public List<Char> findByNameChar(String nameChar);
	
}
