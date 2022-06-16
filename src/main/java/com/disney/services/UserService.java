package com.disney.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.disney.pojo.User;
import com.disney.repositories.IUserDB;
import com.disney.services.interfaces.IUserService;

@Service
public class UserService implements IUserService{
	
	@Autowired
	IUserDB iUserDB;
	
	@Override
	public void postUser(User user) {
		iUserDB.save(user);
	}
	
	@Override
	public void putUser(User user) {
		iUserDB.save(user);
	}
	
	@Override
	public void deleteUser(User user) {
		iUserDB.save(user);
	}

	@Override
	public List<User> showAllUsers() {
		return iUserDB.findByStatus(true);
	}

	@Override
	public User findByUsername(String username) {
		return iUserDB.findByUsername(username);
	}

	@Override
	public User findByEmail(String email) {
		return iUserDB.findByEmail(email);
	}

	@Override
	public Optional<User> findByIdUser(Integer idUser) {
		return iUserDB.findById(idUser);
	}

}
