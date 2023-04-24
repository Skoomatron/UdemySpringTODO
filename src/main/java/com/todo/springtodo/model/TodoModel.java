package com.todo.springtodo.model;

import java.time.LocalDate;

public class TodoModel {
    private int id;
    private String username;
    private String description;
    private LocalDate dueDate;
    private boolean isComplete;

    public TodoModel(int id, String username, String description, LocalDate dueDate, boolean isComplete) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.dueDate = dueDate;
        this.isComplete = isComplete;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean getIsComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    @Override
    public String toString() {
        return "TodoModel{" +
                "username='" + username + '\'' +
                ", description='" + description + '\'' +
                ", dueDate=" + dueDate +
                ", isComplete=" + isComplete +
                '}';
    }
}
