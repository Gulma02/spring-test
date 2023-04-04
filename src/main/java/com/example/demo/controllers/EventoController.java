package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;;

import aj.org.objectweb.asm.TypeReference;
import com.example.demo.models.Evento;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/evento/")
public class EventoController {
    @Autowired
    private final AtomicLong counter = new AtomicLong();

    @PostMapping("/crear")
    public List crearEvento(@RequestBody String requestBody) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(requestBody, new TypeReference<List<Evento>>(){});
    }

    @GetMapping("/{id}")
    public Evento getEventoById(@PathVariable Long id) {
        Evento evento = new Evento();
        return evento.getEvento();
    }
}