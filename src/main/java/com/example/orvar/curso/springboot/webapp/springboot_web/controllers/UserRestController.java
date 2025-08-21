package com.example.orvar.curso.springboot.webapp.springboot_web.controllers;



import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

    @GetMapping("/details2")
    public Map<String, Object> details(){
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola Mundo Spring Boot");
        body.put("name", "Orvar");
        body.put("lastName", "Oddr");
        return body;
    }
}