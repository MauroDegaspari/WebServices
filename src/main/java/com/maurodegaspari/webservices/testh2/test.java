package com.maurodegaspari.webservices.testh2;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.maurodegaspari.webservices.model.CategoriaModel;
import com.maurodegaspari.webservices.model.OrderModel;
import com.maurodegaspari.webservices.model.UserModel;
import com.maurodegaspari.webservices.repositories.CategoriaRepositorio;
import com.maurodegaspari.webservices.repositories.OrderRepositorio;
import com.maurodegaspari.webservices.repositories.UserRepositorio;

@Configuration
@Profile("test")
public class test implements CommandLineRunner {
	
	@Autowired
	private UserRepositorio URepositorio;
	
	@Autowired
	private OrderRepositorio ORepositorio;
	
	@Autowired
	private CategoriaRepositorio CRepositorio;
	
	

	@Override
	public void run(String... args) throws Exception {
		UserModel usuario = new UserModel(null, "mauri", "mauro@hotmai.com", " 123526", "234");
		UserModel usuario2 = new UserModel(null, "horuam", "horaum@hotmai.com", " 123526", "234");
		
		OrderModel order = new OrderModel(null, Instant.parse("2020-05-01T16:53:07Z"), usuario);
		OrderModel order1 = new OrderModel(null, Instant.parse("2020-05-01T16:53:07Z"), usuario2);
		OrderModel order3 = new OrderModel(null, Instant.parse("2020-05-01T16:53:07Z"), usuario);
		
		CategoriaModel c1 = new CategoriaModel(null, "playstation");
		CategoriaModel c2 = new CategoriaModel(null, "xbox");
		CategoriaModel c3 = new CategoriaModel(null, "nitendo");
		
		URepositorio.saveAll(Arrays.asList(usuario, usuario2));
		ORepositorio.saveAll(Arrays.asList(order,order1,order3));
		CRepositorio.saveAll(Arrays.asList(c1,c2,c3));
		
	}

}
