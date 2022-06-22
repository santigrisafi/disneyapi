package com.disney.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.disney.pojo.Char;

@Repository
public interface ICharacterDB extends JpaRepository<Char, Integer> {
	public abstract List<Char> findByNameChar(String nameChar);
}
