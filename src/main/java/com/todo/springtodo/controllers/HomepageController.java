package com.todo.springtodo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomepageController {

    @RequestMapping("/homepage")
    public String homepage() {
        return "homepage";
    }
}
