package com.caso3.api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class Catalogo {

    @Id
    private Long id;

    private String nombre;
    private Double precio;

    public Catalogo() {}

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }
}