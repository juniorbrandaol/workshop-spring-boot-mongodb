package com.eblj.workshopmongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eblj.workshopmongo.domain.User;
import com.eblj.workshopmongo.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	
	/*
	 O ResponseEntity é um objeto que encapsula uma estrutura necessarias para retornar
	 respostas http(formatado)
	 */
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		
		List<User> list = service.findAll();
	    return ResponseEntity.ok().body(list);
	}
	

}
