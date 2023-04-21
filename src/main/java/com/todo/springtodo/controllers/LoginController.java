package com.todo.springtodo.controllers;

import com.todo.springtodo.services.LoginAuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @Autowired
    private LoginAuthenticationService loginAuthenticationService;

    @RequestMapping(value="login", method = RequestMethod.GET)
    public String loginRoute() {
        return "login";
    }

    @RequestMapping(value="login", method = RequestMethod.POST)
    public String homepageRoute(@RequestParam String username, @RequestParam String password, ModelMap model) {
        if (loginAuthenticationService.authenticateLogin(username, password)) {
            model.put("username", username);
            model.put("password", password);
            return "homepage";
        } else {
            model.put("errorMessage", "Invalid Credentials");
            return "login";
        }
    }
}
