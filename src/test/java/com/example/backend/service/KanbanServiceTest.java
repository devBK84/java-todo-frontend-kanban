package com.example.backend.service;

import com.example.backend.model.Todo;
import com.example.backend.repository.TodoRepository;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

// Für "Unit" Tests immer Given, When und Then Schreiben.
class KanbanServiceTest {
// Fake Repsoitory
    private TodoRepository mocktodoRepository = mock(TodoRepository.class);

    // Um realen Service zu Testen
private KanbanService kanbanService = new KanbanService(mocktodoRepository);

    @Test
    void getAllToDo() {

        // Given
        List<Todo>todoList = new ArrayList<>();
        Todo todo1 = new Todo("8","Chilipaste","open");
        todoList.add(todo1);
        when(mocktodoRepository.getTodoList()).thenReturn(todoList);

        // When
        List<Todo>result = kanbanService.getAllToDo();

        // Then
        List<Todo>expected = new ArrayList<>();
        expected.add(todo1);
        assertEquals(expected, result);
        verify(mocktodoRepository).getTodoList();
    }
}