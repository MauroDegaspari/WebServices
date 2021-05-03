package com.maurodegaspari.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maurodegaspari.webservices.model.CategoriaModel;

public interface CategoriaRepositorio extends JpaRepository<CategoriaModel, Long> {

}
