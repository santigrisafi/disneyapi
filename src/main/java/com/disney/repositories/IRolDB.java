package com.disney.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.disney.pojo.Rol;

@Repository
public interface IRolDB extends JpaRepository<Rol, Integer>{
	public Rol findByRol(String rol);
}
