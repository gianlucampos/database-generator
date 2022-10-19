package com.example.databasegenerator.controller;

import java.io.FileInputStream;
import lombok.SneakyThrows;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class GenericController {

    @SneakyThrows
    @GetMapping(value = "/ddl")
    public ResponseEntity<InputStreamResource> getDDL() {
        return ResponseEntity.ok()
            .contentType(MediaType.APPLICATION_OCTET_STREAM)
            .body(new InputStreamResource(new FileInputStream("create.sql")));
    }

}
