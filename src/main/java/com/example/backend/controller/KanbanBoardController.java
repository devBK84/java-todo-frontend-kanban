package com.example.backend.controller;

import com.example.backend.model.Todo;
import com.example.backend.service.KanbanService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.ToDoubleBiFunction;

@RestController
@RequestMapping("/api")
public class KanbanBoardController {

private KanbanService kanbanService;


    public KanbanBoardController(KanbanService kanbanService) {
        this.kanbanService = kanbanService;
    }

    @GetMapping("/todo")

    public List<Todo> getAllToDos(){
        return kanbanService.getAllToDo();
    }

    @PostMapping("todo")
    public Todo addNewToDo(@RequestBody Todo todo){
        return kanbanService.addNewTodo(todo);
    }

    @GetMapping("/todo/{id}")
    public Todo getByID(@PathVariable String id){
        return kanbanService.getByID(id);
    }

@PutMapping("/todo/{id}")
public Todo editToDo(@PathVariable String id, @RequestBody Todo todo){
        return kanbanService.edit(id,todo);
}

@DeleteMapping("/todo/{id}")
    public String deleteToDo(@PathVariable String id){
        return kanbanService.deleteToDo(id);
}
}
