package com.leonela.especialista_service.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EspecialistaController {

    @GetMapping("/especialistas")
    public List<String> obtenerEspecialistas() {

        return List.of(
                "Cardiología",
                "Pediatría",
                "Neurología",
                "Dermatología"
        );
    }
}