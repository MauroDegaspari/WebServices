package com.maurodegaspari.webservices.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maurodegaspari.webservices.model.UserModel;
import com.maurodegaspari.webservices.service.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserControle{

	@Autowired
	private UserService userService;
	
	@GetMapping
	private ResponseEntity<List<UserModel>> todos() {
		List<UserModel> list = userService.acharTodos();
		return ResponseEntity.ok().body(list);
		}
	
	@GetMapping(value= "/{id}")
	public ResponseEntity<UserModel> achId(@PathVariable Long id) {
		UserModel pessoaId = userService.acharId(id);
		return ResponseEntity.ok().body(pessoaId);
	}
	
	
		
}
