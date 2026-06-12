package com.example.catalogojuegos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CatalogojuegosApplication {

    public static void main(String[] args) {

        System.setProperty("spring.data.mongodb.uri",
                "mongodb+srv://andresinho91320_db_user:1PLUGs45sBMXxR3q@juegoscatalogo.sathudd.mongodb.net/juegosCatalogo?retryWrites=true&w=majority&appName=JuegosCatalogo");
        System.setProperty("spring.data.mongodb.database", "juegosCatalogo");

        SpringApplication.run(CatalogojuegosApplication.class, args);
    }
}