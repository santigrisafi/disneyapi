package com.disney.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.disney.pojo.Char;

@Repository
public interface ICharacterDB extends JpaRepository<Char, Integer> {
	public abstract List<Char> findByCharName(String charName);
	public abstract List<Char> findByLastNameChar(String lastNameChar);
	public abstract List<Char> findByAgeChar(Integer ageChar);
	public abstract List<Char> findByWeightChar(Double weightChar);
	public abstract List<Char> findByHeightChar(Double hightChar);
	public Char findByImageUrl(String imageUrl);
}
