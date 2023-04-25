package com.todo.springtodo.controllers;

import com.todo.springtodo.model.TodoModel;
import com.todo.springtodo.services.TodoService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

@Controller
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping("listTodos")
    public String listAllTodos(ModelMap model) {
        List<TodoModel> todos = todoService.findByUsername("test");
        model.addAttribute("todos", todos);
        return "list";
    }

    @RequestMapping(value="addTodo", method = RequestMethod.GET)
    public String addTodo(ModelMap modelMap) {
        String username = (String)modelMap.get("username");
        TodoModel todoModel = new TodoModel(0, username, "", LocalDate.now().plusMonths(2), false);
        modelMap.put("todoModel", todoModel);
        return "addTodo";
    }

    @RequestMapping(value="addTodo", method = RequestMethod.POST)
    public String submitTodo(ModelMap modelMap, @Valid TodoModel todoModel, BindingResult result) {
        if (result.hasErrors()) {
            return "addTodo";
        }
        todoService.addTodo((String)modelMap.get("username"), todoModel.getDescription(), todoModel.getDueDate(), false);
        return "redirect:listTodos";
    }

    @RequestMapping("deleteTodo")
    public String deleteTodo(@RequestParam int id) {
        todoService.deleteTodo(id);
        return "redirect:listTodos";
    }

    @RequestMapping(value="updateTodo", method = RequestMethod.GET)
    public String updateTodo(@RequestParam int id, ModelMap modelMap) {
        TodoModel todoModel = todoService.findTodo(id);
        modelMap.addAttribute("todoModel", todoModel);
        return "addTodo";
    }

    @RequestMapping(value="updateTodo", method = RequestMethod.POST)
    public String postUpdate(ModelMap modelMap, @Valid TodoModel todoModel, BindingResult result) {
        if (result.hasErrors()) {
            return "addTodo";
        }
        String username = (String)modelMap.get("username");
        todoModel.setUsername(username);
        todoService.updateTodo(todoModel);
        return "redirect:listTodos";
    }
}
