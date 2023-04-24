package com.todo.springtodo.controllers;

import com.todo.springtodo.model.TodoModel;
import com.todo.springtodo.services.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TodoController {

    @RequestMapping("/listTodos")
    public String listAllTodos(ModelMap model) {

        List<TodoModel> todos = todoService.findByUsername("test");
        model.addAttribute("todos", todos);
        return "list";
    }

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }
}
