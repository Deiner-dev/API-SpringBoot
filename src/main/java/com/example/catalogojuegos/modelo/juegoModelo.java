package com.example.catalogojuegos.modelo;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "juegos")
public class juegoModelo {

    @Id
    private String id;

    @JsonProperty("rating")
    @JsonAlias({"calificaciones", "rating"})
    private float calificaciones;

    @JsonProperty("nombre")
    @JsonAlias({"nombreJuego", "nombre"})
    private String nombreJuego;

    private String genero;

    @JsonProperty("anio")
    @JsonAlias({"anioLanzamiento", "anio"})
    private int anioLanzamiento;

    @JsonProperty("disponible")
    @JsonAlias({"activo", "disponible"})
    private boolean activo;

    private String descripcion;
    private String plataforma;
    private String desarrolladora;

    @JsonProperty("imagenUrl")
    @JsonAlias({"imagen", "imagenUrl"})
    private String imagen;

    private String nombreCliente;
    private String documentoCliente;
    private String fechaAlquiler;
    private int diasAlquiler;


    // Constructor vacío
    public juegoModelo() {
    }

    // GETTERS Y SETTERS

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(float calificaciones) {
        this.calificaciones = calificaciones;
    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getDesarrolladora() {
        return desarrolladora;
    }

    public void setDesarrolladora(String desarrolladora) {
        this.desarrolladora = desarrolladora;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDocumentoCliente() {
        return documentoCliente;
    }

    public void setDocumentoCliente(String documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    public String getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(String fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public int getDiasAlquiler() {
        return diasAlquiler;
    }

    public void setDiasAlquiler(int diasAlquiler) {
        this.diasAlquiler = diasAlquiler;
    }
}