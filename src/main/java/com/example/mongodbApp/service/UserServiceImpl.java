package com.example.mongodbApp.service;


import com.example.mongodbApp.model.TodoDTO;
import com.example.mongodbApp.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public TodoDTO saveUser(TodoDTO user) {
        return todoRepository.save(user);
    }

    @Override
    public List<TodoDTO> getUsers() {
        return todoRepository.findAll();
    }

    @Override
    public TodoDTO updateUser(String id, TodoDTO user) {
        Optional<TodoDTO> findById = todoRepository.findById(String.valueOf(id));
        if (findById.isPresent()) {
            TodoDTO userEntity = findById.get();
            if (user.getTitle() != null && !user.getTitle().isEmpty())
                userEntity.setTitle(user.getTitle());
            if (user.getDescription() != null)
                userEntity.setDescription(user.getDescription());
            return todoRepository.save(userEntity);
        }
        return null;
    }

    @Override
    public void deleteUser(String id) {
        todoRepository.deleteById(id);
    }

}
