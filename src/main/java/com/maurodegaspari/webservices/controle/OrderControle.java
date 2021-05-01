package com.maurodegaspari.webservices.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maurodegaspari.webservices.model.OrderModel;
import com.maurodegaspari.webservices.model.OrderModel;
import com.maurodegaspari.webservices.service.OrderService;

@RestController
@RequestMapping(value = "/order")
public class OrderControle{

	@Autowired
	private OrderService orderService;
	
	@GetMapping
	private ResponseEntity<List<OrderModel>> todos() {
		List<OrderModel> list = orderService.acharTodos();
		return ResponseEntity.ok().body(list);
		}
	
	@GetMapping(value= "/{id}")
	public ResponseEntity<OrderModel> achId(@PathVariable Long id) {
		OrderModel pessoaId = orderService.acharId(id);
		return ResponseEntity.ok().body(pessoaId);
	}
	
	
		
}
