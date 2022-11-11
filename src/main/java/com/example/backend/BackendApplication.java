package com.example.backend;
/*
Aufgabe: ToDo - Backend
Mache ein fork vom ToDo repo
ToDo Setze ein Spring Projekt im Unterordner backend auf "Done"
ToDo Installiere dir node um das Frontend bauen zu können "Done"
ToDo Baue das Frontend mittels des shell scripts "Done"
ToDo Starte den Server und rufe ihn im Browser auf "Done"

ToDo Versuche herauszufinden, welche Endpunkte das Frontend anspricht.
ToDo Implementiere die entsprechende Backend-Logik in deinem Spring-Server
 */

// Wir müssen eine Klasse erstellen mit unseren ToDos


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }
}
