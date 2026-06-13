package com.example.catalogojuegos.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.catalogojuegos.modelo.juegoModelo;
import com.example.catalogojuegos.repositorio.juegoRepositorio;

@Service
public class juegoServicio {

    @Autowired
    juegoRepositorio juegoRepositorio;

    // CREAR
    public juegoModelo guardarJuego(juegoModelo juego) {

        juego.setActivo(true);

        juego.setNombreCliente(null);
        juego.setDocumentoCliente(null);
        juego.setFechaAlquiler(null);
        juego.setDiasAlquiler(0);

        return juegoRepositorio.save(juego);
    }

    // LISTAR
    public List<juegoModelo> obtenerJuegos() {
        return juegoRepositorio.findAll();
    }

    // BUSCAR
    public juegoModelo obtenerPorId(String id) {
        return juegoRepositorio.findById(id).orElse(null);
    }

    // ACTUALIZAR
    public juegoModelo actualizarJuego(String id,
                                       juegoModelo juegoActualizado) {

        juegoModelo juego =
                juegoRepositorio.findById(id).orElse(null);

        if (juego != null) {

            juego.setNombreJuego(
                    juegoActualizado.getNombreJuego());

            juego.setGenero(
                    juegoActualizado.getGenero());

            juego.setAnioLanzamiento(
                    juegoActualizado.getAnioLanzamiento());

            juego.setDescripcion(
                    juegoActualizado.getDescripcion());

            juego.setPlataforma(
                    juegoActualizado.getPlataforma());

            juego.setDesarrolladora(
                    juegoActualizado.getDesarrolladora());

            juego.setCalificaciones(
                    juegoActualizado.getCalificaciones());

            // IMAGEN
            juego.setImagen(
                    juegoActualizado.getImagen());

            return juegoRepositorio.save(juego);
        }

        return null;
    }

    // ALQUILAR
    public String alquilarJuego(String id,
                                juegoModelo datos) {

        juegoModelo juego =
                juegoRepositorio.findById(id).orElse(null);

        if (juego == null) {
            return "El juego no existe";
        }

        if (!juego.isActivo()) {
            return "El juego no está disponible";
        }

        juego.setActivo(false);

        juego.setNombreCliente(
                datos.getNombreCliente());

        juego.setDocumentoCliente(
                datos.getDocumentoCliente());

        juego.setFechaAlquiler(
                datos.getFechaAlquiler());

        juego.setDiasAlquiler(
                datos.getDiasAlquiler());

        juegoRepositorio.save(juego);

        return "Juego alquilado correctamente";
    }

    // DEVOLVER
    public String devolverJuego(String id) {

        juegoModelo juego =
                juegoRepositorio.findById(id).orElse(null);

        if (juego == null) {
            return "El juego no existe";
        }

        juego.setActivo(true);

        juego.setNombreCliente(null);
        juego.setDocumentoCliente(null);
        juego.setFechaAlquiler(null);
        juego.setDiasAlquiler(0);

        juegoRepositorio.save(juego);

        return "Juego devuelto correctamente";
    }

    // ELIMINAR
    public boolean eliminarJuego(String id) {

        if (juegoRepositorio.existsById(id)) {
            juegoRepositorio.deleteById(id);
            return true;
        }

        return false;
    }

    // LISTAR ALQUILADOS
    public List<juegoModelo> obtenerJuegosAlquilados() {
        return juegoRepositorio.findByActivoFalse();
    }

}