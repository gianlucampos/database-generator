package com.example.databasegenerator;

import java.io.File;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatabaseGeneratorApplication {

    public static void main(String[] args) {
        cleanData();
        SpringApplication.run(DatabaseGeneratorApplication.class, args);
    }

    private static void cleanData() {
        File file = new File("create.sql");
        if (file.exists()) {
            file.delete();
        }
    }

}
