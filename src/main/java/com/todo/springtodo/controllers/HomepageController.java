package com.todo.springtodo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomepageController {

    @RequestMapping("/homepage")
    public ModelAndView homepage() {
        ModelAndView m = new ModelAndView();
        m.setViewName("homepage.html");
        return m;
    }
}
