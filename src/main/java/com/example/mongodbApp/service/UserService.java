package com.example.mongodbApp.service;

import com.example.mongodbApp.model.TodoDTO;

import java.util.List;

public interface UserService {

    public TodoDTO saveUser(TodoDTO user);
    public List<TodoDTO> getUsers();
    public TodoDTO updateUser(String id, TodoDTO user);
    public void deleteUser(String id);
}
