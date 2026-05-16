package com.leonela.students_service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.leonela.students_service.config.RabbitService;

@RestController
@RequestMapping("/api/rabbit")
public class StudentController {

    private final RabbitService studentsService;

    // Constructor
    public StudentController(RabbitService studentsService) {
        this.studentsService = studentsService;
    }

    @PostMapping
    public ResponseEntity<String> enviar(
            @RequestBody String mensaje
    ) {

        studentsService.enviar(mensaje);

        return ResponseEntity
                .accepted()
                .body(mensaje);
    }
}