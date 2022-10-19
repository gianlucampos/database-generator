package com.example.databasegenerator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class GenericController {

    @GetMapping
    public ResponseEntity<?> helloWorld() {
        return ResponseEntity.ok("FEITO");
    }

}
