package com.maurodegaspari.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maurodegaspari.webservices.model.OrderModel;



public interface OrderRepositorio extends JpaRepository<OrderModel, Long> {

}
