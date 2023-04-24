package com.todo.springtodo.services;

import com.todo.springtodo.model.TodoModel;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<TodoModel> todos = new ArrayList<>();
    static {
        todos.add(new TodoModel("Trevor", "Learn to dunk.", LocalDate.now().plusMonths(1), false));
        todos.add(new TodoModel("Trevor", "Karate chop a mountains.", LocalDate.now().plusMonths(2), false));
        todos.add(new TodoModel("Trevor", "Plant garden.", LocalDate.now().plusMonths(4), false));
    }

    public List<TodoModel> findByUsername(String username) {
        return todos;
    }
}
