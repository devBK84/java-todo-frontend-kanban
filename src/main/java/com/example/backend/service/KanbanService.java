package com.example.backend.service;

import com.example.backend.model.Todo;
import com.example.backend.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KanbanService {

    private TodoRepository todoRepository;

    public KanbanService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> getAllToDo() {
        return todoRepository.getTodoList();
    }

    public Todo addNewTodo (Todo toDo){
        return todoRepository.addTodo(toDo);
    }
}
