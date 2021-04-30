package com.maurodegaspari.webservices.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maurodegaspari.webservices.repositories.UserRepositorio;
@RestController
@RequestMapping(value = "/users")

public class UserControle{

	@Autowired
	private UserRepositorio repositorio;
	
	
		
}
