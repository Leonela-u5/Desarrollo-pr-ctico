package com.leonela.turnos_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TurnoController {

    @GetMapping("/turnos")
    public String obtenerTurnos() {

        RestTemplate restTemplate = new RestTemplate();

        String especialistas = restTemplate.getForObject(
                "http://localhost:8080/especialistas",
                String.class
        );

        return "Especialistas disponibles para turnos: " + especialistas;
    }
}