package com.maurodegaspari.webservices.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maurodegaspari.webservices.model.CategoriaModel;
import com.maurodegaspari.webservices.service.CategoriaService;

@RestController
@RequestMapping(value = "/categoria")
public class CategoriaControle{

	@Autowired
	private CategoriaService orderService;
	
	@GetMapping
	private ResponseEntity<List<CategoriaModel>> todos() {
		List<CategoriaModel> list = orderService.acharTodos();
		return ResponseEntity.ok().body(list);
		}
	
	@GetMapping(value= "/{id}")
	public ResponseEntity<CategoriaModel> achId(@PathVariable Long id) {
		CategoriaModel pessoaId = orderService.acharId(id);
		return ResponseEntity.ok().body(pessoaId);
	}
	
	
		
}
