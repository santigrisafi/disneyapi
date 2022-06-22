package com.disney.services.interfaces;

import java.util.List;

import com.disney.pojo.Users;

public interface IUserService {
	
	public List<Users> getUserInfo();
	
	public void createUser(Users user);
	
	public void updateUser(Users user);
	
	public void deleteUser(Users user);

}
