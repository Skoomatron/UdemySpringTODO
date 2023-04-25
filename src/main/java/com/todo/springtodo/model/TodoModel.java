package com.todo.springtodo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

@Entity
public class TodoModel {

    @Id
    @GeneratedValue
    private int id;

    @Size(min=5, message = "Minimum 5 Characters")
    private String description;

    private String username;
    private LocalDate dueDate;
    private boolean isComplete;

    public TodoModel(int id, String username, String description, LocalDate dueDate, boolean isComplete) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.dueDate = dueDate;
        this.isComplete = isComplete;
    }

    public TodoModel() {

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
