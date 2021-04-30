package com.maurodegaspari.webservices.testh2;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.maurodegaspari.webservices.modal.UserModel;
import com.maurodegaspari.webservices.repositories.UserRepositorio;

@Configuration
@Profile("test")
public class test implements CommandLineRunner {
	
	@Autowired
	private UserRepositorio repositorio;

	@Override
	public void run(String... args) throws Exception {
		UserModel usuario = new UserModel(null, "mauri", "mauro@hotmai.com", " 123526", "234");
		UserModel usuario2 = new UserModel(null, "horuam", "horaum@hotmai.com", " 123526", "234");
		repositorio.saveAll(Arrays.asList(usuario, usuario2));
		
	}

}
