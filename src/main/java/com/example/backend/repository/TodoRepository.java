package com.example.backend.repository;

import com.example.backend.model.Todo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TodoRepository {
    private List<Todo> todoList;

    public TodoRepository(List<Todo> todoList) {
        this.todoList = todoList;
    }

    // Get all To Do´s
    public List<Todo> getTodoList() {
        return todoList;
    }

    // Add new To Do
    public Todo addTodo(Todo newTodo) {
        this.todoList.add(newTodo);
        return newTodo;
    }

    // Get by ID
    public Todo getById(String id) {
        for (Todo toDo : todoList) {
            if (toDo.id().equals(id)) {
                return toDo;
            }
        }
        return null;
    }
// Put to Do
    public Todo editToDo(String id, Todo todo) {
        int indexOf = this.todoList.indexOf(getById(id));
        this.todoList.set(indexOf, todo);
        return todo;
    }

    // Delete to Do
    public String deleteToDo(String id){
        this.todoList.remove(getById(id));
        return id;
    }


}
