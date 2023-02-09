package com.eblj.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eblj.workshopmongo.domain.User;
import com.eblj.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	/*
	 * instancia automaticamento um objeto nesta classe de serviço
	 */
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
	

}
