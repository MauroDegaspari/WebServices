package com.maurodegaspari.webservices.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maurodegaspari.webservices.model.UserModel;
import com.maurodegaspari.webservices.repositories.UserRepositorio;

@Service
public class UserService {

	@Autowired
	private UserRepositorio jpa;
	
	public List<UserModel> acharTodos() {
	return jpa.findAll();
	}
	
	public UserModel acharId(Long id) {
		Optional<UserModel> obj = jpa.findById(id);
		return obj.get();
	}
}
