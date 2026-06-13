package com.example.catalogojuegos.repositorio;

import com.example.catalogojuegos.modelo.juegoModelo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface juegoRepositorio extends MongoRepository<juegoModelo, String> {

    List<juegoModelo> findByActivoFalse();

}