package com.example.demo.controllers;

import java.util.concurrent.atomic.AtomicLong;

import com.example.demo.models.Evento;
import com.example.demo.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin
@RequestMapping("api/")
public class GreetingController {
    private final AtomicLong counter = new AtomicLong();
    private final String template = "Hello, %s!";

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {

        return new Greeting(counter.incrementAndGet(), String.format(this.template, name));
    }
    @GetMapping("/get-evento")
    public Evento getInfoEvento() {
        Evento infoEvento = new Evento();
        return infoEvento.getEvento();
    }
}