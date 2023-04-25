package com.todo.springtodo.repository;


import com.todo.springtodo.model.TodoModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoModelRepository extends JpaRepository<TodoModel, Integer> {
    public List<TodoModel> findByUsername(String username);
}
