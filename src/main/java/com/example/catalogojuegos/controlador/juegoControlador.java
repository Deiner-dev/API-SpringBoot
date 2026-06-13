package com.example.catalogojuegos.controlador;

import com.example.catalogojuegos.modelo.juegoModelo;import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.catalogojuegos.modelo.juegoModelo;
import com.example.catalogojuegos.servicio.juegoServicio;

@RestController
@RequestMapping("/juegos")
@CrossOrigin("*")
public class juegoControlador {

    @Autowired
    juegoServicio juegoServicio;

    // CREAR
    @PostMapping("/crear")
    public juegoModelo guardarJuego(
            @RequestBody juegoModelo juego) {

        return juegoServicio.guardarJuego(juego);
    }

    // LISTAR
    @GetMapping("/listar")
    public List<juegoModelo> obtenerJuegos() {

        return juegoServicio.obtenerJuegos();
    }

    // BUSCAR
    @GetMapping("/buscar/{id}")
    public juegoModelo obtenerPorId(
            @PathVariable String id) {

        return juegoServicio.obtenerPorId(id);
    }

    // ACTUALIZAR
    @PutMapping("/actualizar/{id}")
    public juegoModelo actualizarJuego(
            @PathVariable String id,
            @RequestBody juegoModelo juego) {

        return juegoServicio.actualizarJuego(id, juego);
    }

    // ALQUILAR
    @PutMapping("/alquilar/{id}")
    public String alquilarJuego(
            @PathVariable String id,
            @RequestBody juegoModelo juego) {

        return juegoServicio.alquilarJuego(id, juego);
    }

    // DEVOLVER
    @PutMapping("/devolver/{id}")
    public String devolverJuego(
            @PathVariable String id) {

        return juegoServicio.devolverJuego(id);
    }

    // ELIMINAR
    @DeleteMapping("/eliminar/{id}")
    public String eliminarJuego(
            @PathVariable String id) {

        boolean eliminar =
                juegoServicio.eliminarJuego(id);

        if (eliminar) {
            return "¡Juego eliminado correctamente!";
        }

        return "¡Juego no encontrado!";
    }

    // LISTAR ALQUILADOS
    @GetMapping("/alquilados")
    public List<juegoModelo> obtenerJuegosAlquilados() {
        return juegoServicio.obtenerJuegosAlquilados();
    }
}