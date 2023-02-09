package com.eblj.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.eblj.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String> {

}