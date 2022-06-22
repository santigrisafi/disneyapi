package com.disney.services.interfaces;

import java.util.List;

import com.disney.pojo.User;

public interface IUserService {
	
	public List<User> showAllUsers();
	
	public void createUser(User user);
	
	public void updateUser(User user);
	
	public void deleteUser(User user);

}
