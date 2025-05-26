package com.authentication.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.authentication.entities.Users;
import com.authentication.repositories.UsersRepository;

@Service
public class UserServiceImplementation implements UserService{
	
	@Autowired
	UsersRepository repo;
	
	public void signUp(Users user) {
		repo.save(user);
	}
}
