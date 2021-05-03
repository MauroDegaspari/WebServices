package com.maurodegaspari.webservices.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maurodegaspari.webservices.model.CategoriaModel;
import com.maurodegaspari.webservices.repositories.CategoriaRepositorio;


@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepositorio jpa;
	
	public List<CategoriaModel> acharTodos() {
	return jpa.findAll();
	}
	
	public CategoriaModel acharId(Long id) {
		Optional<CategoriaModel> obj = jpa.findById(id);
		return obj.get();
	}
}
