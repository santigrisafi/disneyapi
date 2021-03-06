package com.disney.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.disney.pojo.User;

public interface IUserService {
	
	public List<User> showAllUsers();
	
	public void createUser(User user);
	
	public void updateUser(User user);
	
	public void deleteUser(User user);
	
	public User findByUsername(String username);
	
	public User findByEmail(String email);
	
	public Optional<User> findByIdUser(Integer idUser);

}
