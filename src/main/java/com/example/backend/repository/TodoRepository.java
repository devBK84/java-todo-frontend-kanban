package com.example.backend.repository;

import com.example.backend.model.Todo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TodoRepository {
    private List<Todo> todoList;

    public TodoRepository(List<Todo> todoList) {
        this.todoList = todoList;
    }

public List<Todo> getTodoList() {
        return todoList;
    }

    // Add new To Do
    public Todo addTodo (Todo newTodo){
        this.todoList.add(newTodo);
        return newTodo;
    }
}
