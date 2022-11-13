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
        int id = getAllToDo().size()+1;
        Todo addId = new Todo(String.valueOf(id),toDo.description(),toDo.status());
        return todoRepository.addTodo(addId);
    }

    public Todo getByID(String id){
        return todoRepository.getById(id);
    }

    public Todo edit(String id, Todo todo){
        return todoRepository.editToDo(id,todo);
    }

    public String deleteToDo (String id){
        return todoRepository.deleteToDo(id);
    }
}
