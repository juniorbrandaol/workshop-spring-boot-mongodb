package com.eblj.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.eblj.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {

}