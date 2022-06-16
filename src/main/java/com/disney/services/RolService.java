package com.disney.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.disney.pojo.Rol;
import com.disney.repositories.IRolDB;
import com.disney.services.interfaces.IRolService;

@Service
public class RolService implements IRolService {
	
	@Autowired
	IRolDB iRolDB;

	@Override
	public List<Rol> showAllRoles() {
		return iRolDB.findAll();
	}

	@Override
	public void postRol(Rol rol) {
		iRolDB.save(rol);
	}

	@Override
	public void putRol(Rol rol) {
		iRolDB.save(rol);
	}

	@Override
	public void deleteRol(Integer idRol) {
		iRolDB.deleteById(idRol);
	}

	@Override
	public Optional<Rol> findByIdRol(Integer idRol) {
		return iRolDB.findById(idRol);
	}

	@Override
	public Rol findByRol(String rol) {
		return iRolDB.findByRol(rol);
	}

}
