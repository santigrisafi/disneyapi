package com.disney.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.disney.pojo.User;

@Repository
public interface IUserDB extends JpaRepository<User, Integer> {
	public User findByUsername(String username);
	public User findByEmail(String email);
	public abstract List<User> findByStatus(boolean status);
}
