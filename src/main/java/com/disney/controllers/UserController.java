package com.disney.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.disney.pojo.User;
import com.disney.services.interfaces.IUserService;

@RestController
@RequestMapping(value="users")
public class UserController {

	@Autowired
	IUserService iUserService;
	
	@PostMapping("/signup")
	public void registerUser(@RequestBody User user) {
		user.status = true;
		iUserService.createUser(user);
	}
	
	@PostMapping("/login")
	public void login (@RequestBody User user) {
		
	}
	
	@PutMapping("/{idUser}")
	public void updateUser(@RequestBody User user, @PathVariable Integer idUser) {
		user.idUser = idUser;
		user.status = true;
		iUserService.updateUser(user);
	}
	
	@DeleteMapping("/{idUser}")
	public void deleteUser(User user, @PathVariable Integer idUser) {
		user.idUser = idUser;
		user.status = false;
		iUserService.deleteUser(user);
	}
	
}
