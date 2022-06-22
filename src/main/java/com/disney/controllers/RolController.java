package com.disney.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.disney.pojo.Rol;
import com.disney.services.interfaces.IRolService;

@RestController
@RequestMapping("roles")
public class RolController {
	
	@Autowired
	IRolService iRolService;
	
	@GetMapping
	public List<Rol> showAllRoles(){
		return iRolService.showAllRoles();
	}
	
	@PostMapping
	public void postRol(@RequestBody Rol rol) {
		iRolService.postRol(rol);
	}
	
	@PutMapping("/{idRol}")
	public void putRol(@RequestBody Rol rol, @PathVariable Integer idRol) {
		iRolService.putRol(rol);
	}
	
	@DeleteMapping("/{idRol}")
	public void deleteRol(@PathVariable Integer idRol) {
		iRolService.deleteRol(idRol);
	}
	
	@GetMapping("rol/{rol}")
	public Rol findByRol(@PathVariable String rol){
		return iRolService.findByRol(rol);
	}
	
	@GetMapping("/{idRol}")
	public Optional<Rol> findByIdRol(@PathVariable Integer idRol){
		return iRolService.findByIdRol(idRol);
	}
}
