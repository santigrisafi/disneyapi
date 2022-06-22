package com.disney.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.disney.pojo.Users;

@Repository
public interface IUserDB extends JpaRepository<Users, Integer> {
	public Users findByUsername(String username);
	public Users findByEmail(String email);
	public abstract List<Users> findByStatus(boolean status);
}
