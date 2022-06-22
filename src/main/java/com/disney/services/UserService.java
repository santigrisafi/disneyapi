package com.disney.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.disney.pojo.Users;
import com.disney.repositories.IUserDB;
import com.disney.services.interfaces.IUserService;

@Service
public class UserService implements IUserService{
	
	@Autowired
	IUserDB iUserDB;
	
	@Override
	public void createUser(Users user) {
		iUserDB.save(user);
	}
	
	@Override
	public void updateUser(Users user) {
		iUserDB.save(user);
	}
	
	@Override
	public void deleteUser(Users user) {
		iUserDB.save(user);
	}

	@Override
	public List<Users> getUserInfo() {
		return iUserDB.findByStatus(true);
	}

}
