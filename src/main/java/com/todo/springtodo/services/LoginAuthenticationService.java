package com.todo.springtodo.services;

import org.springframework.stereotype.Service;

@Service
public class LoginAuthenticationService {

    public boolean authenticateLogin(String username, String password) {
        boolean correctUser = username.equalsIgnoreCase("test");
        boolean correctPassword = password.equalsIgnoreCase("test");
        return correctPassword && correctUser;
    }

}
