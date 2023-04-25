package com.todo.springtodo.services;

import com.todo.springtodo.model.TodoModel;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {
    private static List<TodoModel> todos = new ArrayList<>();
    private static int todosCount = 1;
    static {
        todos.add(new TodoModel(todosCount++,"Trevor", "Learn to dunk.", LocalDate.now().plusMonths(1), false));
        todos.add(new TodoModel(todosCount++,"Trevor", "Karate chop a mountains.", LocalDate.now().plusMonths(2), false));
        todos.add(new TodoModel(todosCount++,"Trevor", "Plant garden.", LocalDate.now().plusMonths(4), false));
    }

    public List<TodoModel> findByUsername(String username) {
        return todos;
    }

    public void addTodo(String username, String description, LocalDate targetDate, boolean completed) {
        TodoModel todoModel = new TodoModel(todosCount++, username, description, targetDate, completed);
        todos.add(todoModel);
    }

    public void deleteTodo(int id) {
        Predicate<? super TodoModel> predicate = todoModel -> todoModel.getId() == id;
        todos.removeIf(predicate);
    }
}
