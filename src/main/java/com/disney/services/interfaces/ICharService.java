package com.disney.services.interfaces;

import java.util.List;

import com.disney.pojo.Char;

public interface ICharService {
	
	Char createChar(Char character);
	
	void updateChar(Char character);
	
	void deleteChar(Integer idChar);
	
	Char findByIdChar(Integer idChar);
}
