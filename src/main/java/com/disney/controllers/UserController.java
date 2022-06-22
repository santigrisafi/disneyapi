package com.disney.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.disney.pojo.User;
import com.disney.services.interfaces.IUserService;

@RestController
@RequestMapping("users")
public class UserController {

	@Autowired
	IUserService iUserService;
	
	@GetMapping()
	public List<User> showAllUser(){
		return iUserService.showAllUsers();
	}
	
	@PostMapping
	public void createUser(@RequestBody User user) {
		user.status = true;
		iUserService.createUser(user);
	}
	
	@PutMapping("/{idUser}")
	public void putUser(@RequestBody User user, @PathVariable Integer idUser) {
		user.idUser = idUser;
		iUserService.updateUser(user);
	}
	
	@PutMapping("/del/{idUser}")
	public void deleteUser(@RequestBody User user, @PathVariable Integer idUser) {
		user.idUser = idUser;
		user.status = false;
		iUserService.deleteUser(user);
	}
	
	@GetMapping("/email/{email}")
	public User findByEmail(@RequestBody User user) {
		return iUserService.findByEmail(user.email);
	}
	
	@GetMapping("/username/{username}")
	public User findByUsername(@RequestBody User user) {
		return iUserService.findByUsername(user.username);
	}
	
	@GetMapping("/idUser/{idUser}")
	public Optional<User> findByIdUser(@PathVariable Integer idUser){
		return iUserService.findByIdUser(idUser);
	}
}
