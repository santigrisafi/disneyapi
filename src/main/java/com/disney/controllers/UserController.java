package com.disney.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.disney.pojo.Users;
import com.disney.services.interfaces.IUserService;

@RestController
@RequestMapping(value="auth")
public class UserController {
	
	@Autowired
	BCryptPasswordEncoder bcrypt;

	@Autowired
	IUserService iUserService;
	
	
	@PostMapping("/register")
	public void registerUser(@RequestBody Users user) {
		user.password = bcrypt.encode(user.password);
		user.status = true;
		iUserService.createUser(user);
	}
	
	@PostMapping("/login")
	public void login (@RequestBody Users user) {
		
	}
	
	@PutMapping("/{idUser}")
	public void updateUser(@RequestBody Users user, @PathVariable Integer idUser) {
		user.idUser = idUser;
		user.password = bcrypt.encode(user.password);
		user.status = true;
		iUserService.updateUser(user);
	}
	
	@DeleteMapping("/{idUser}")
	public void deleteUser(Users user, @PathVariable Integer idUser) {
		user.idUser = idUser;
		user.status = false;
		iUserService.deleteUser(user);
	}
	
}
