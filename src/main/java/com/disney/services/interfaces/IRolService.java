package com.disney.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.disney.pojo.Rol;

public interface IRolService {
	
	public List<Rol> showAllRoles();
	
	public void postRol(Rol rol);
	
	public void putRol(Rol rol);
	
	public void deleteRol(Integer idRol);
	
	public Optional<Rol> findByIdRol(Integer idRol);
	
	public Rol findByRol(String rol);

}
