package com.example.catalogojuegos.repositorio;

import com.example.catalogojuegos.modelo.juegoModelo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface juegoRepositorio extends MongoRepository<juegoModelo, String> {

}