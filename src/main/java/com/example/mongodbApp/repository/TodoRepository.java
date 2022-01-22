package com.example.mongodbApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongodbApp.model.TodoDTO;


public interface TodoRepository extends MongoRepository<TodoDTO, String> {
}
