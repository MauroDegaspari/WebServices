package com.maurodegaspari.webservices.services;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maurodegaspari.webservices.entidade.UserEntidade;
@RestController
@RequestMapping(value = "/users")
public class UserService {
	
		@GetMapping
		public ResponseEntity<UserEntidade> findAll() {
			UserEntidade usuario = new UserEntidade(1L, "mauri", "mauro@hotmai.com", " 123526", "234");
			return ResponseEntity.ok().body(usuario);
		}
	
}
