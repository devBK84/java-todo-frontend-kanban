package com.example.backend.controller;

import com.example.backend.model.Todo;
import com.example.backend.repository.TodoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class KanbanBoardControllerIntergrationTest {
    // Nicht initialisiert, da wir Integrationstest schreiben und Spring per Autowired alles Bereitstellt (Dependency Injection)

    @Autowired
    TodoRepository todoRepository;
    @Autowired
    MockMvc mockMvc;


    @Test
    void getAllTodos_thanReturnList() throws Exception {
        Todo todo = new Todo("8", "Chilipaste", "open");
        todoRepository.addTodo(todo);

        mockMvc.perform(get("http://localhost:8080/api/todo"))
                .andExpect(status().isOk())
                .andExpect(content().json(
                        """
                                [
                                {
                                "id": "8",
                                "description": "Chilipaste",
                                "status": "open"
                                }
                                ]
                                """
                ));

    }

}
