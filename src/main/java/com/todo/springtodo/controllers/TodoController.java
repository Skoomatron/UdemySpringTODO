package com.todo.springtodo.controllers;

import com.todo.springtodo.model.TodoModel;
import com.todo.springtodo.services.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDate;
import java.util.List;

@Controller
public class TodoController {

    @RequestMapping("/listTodos")
    public String listAllTodos(ModelMap model) {
        List<TodoModel> todos = todoService.findByUsername("test");
        model.addAttribute("todos", todos);
        return "list";
    }

    @RequestMapping(value="/addTodo", method = RequestMethod.GET)
    public String addTodo(ModelMap modelMap) {
        String username = (String)modelMap.get("username");
        TodoModel todoModel = new TodoModel(0, username, "", LocalDate.now().plusMonths(2), false);
        modelMap.put("todoModel", todoModel);
        return "addTodo";
    }

    @RequestMapping(value="/addTodo", method = RequestMethod.POST)
    public String submitTodo(ModelMap modelMap, TodoModel todoModel) {
        todoService.addTodo((String)modelMap.get("username"), todoModel.getDescription(), LocalDate.now().plusMonths(1), false);
        return "redirect:listTodos";
    }

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }
}