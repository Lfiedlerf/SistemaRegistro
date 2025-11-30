package com.bootcamp.registro;

public class Usuario {
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }
    // Getter necesario para validaciones futuras (opcional por ahora)
    public String getNombre() { return nombre; }
}