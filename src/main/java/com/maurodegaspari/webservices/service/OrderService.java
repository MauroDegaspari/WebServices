package com.maurodegaspari.webservices.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maurodegaspari.webservices.model.OrderModel;
import com.maurodegaspari.webservices.repositories.OrderRepositorio;


@Service
public class OrderService {

	@Autowired
	private OrderRepositorio jpa;
	
	public List<OrderModel> acharTodos() {
	return jpa.findAll();
	}
	
	public OrderModel acharId(Long id) {
		Optional<OrderModel> obj = jpa.findById(id);
		return obj.get();
	}
}
