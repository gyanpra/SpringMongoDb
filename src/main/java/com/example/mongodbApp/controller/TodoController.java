package com.example.mongodbApp.controller;

import com.example.mongodbApp.model.TodoDTO;
import com.example.mongodbApp.repository.TodoRepository;
import com.example.mongodbApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<TodoDTO> getUsers() {
        return userService.getUsers();
    }

    @PostMapping("/")
    public TodoDTO saveUser(@RequestBody TodoDTO user) {
        return userService.saveUser(user);
    }

    @PutMapping("/{id}")
    public TodoDTO updateUser(@RequestBody TodoDTO user, @PathVariable("id") String id) {
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") String id) {
        userService.deleteUser(id);
        return "deleted succesfully.";
    }


}

