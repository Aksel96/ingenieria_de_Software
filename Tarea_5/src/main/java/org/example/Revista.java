package org.example;

import org.example.factory.Producto;

public class Revista implements Producto {
    private int ISSN;
    private String nombre;
    private int numeroEdicion;
    private float precio;
    private String periodicidad;

    public Revista() {
    }

    public Revista(int ISSN, String nombre, int numeroEdicion, float precio, String periodicidad) {
        this.ISSN = ISSN;
        this.nombre = nombre;
        this.numeroEdicion = numeroEdicion;
        this.precio = precio;
        this.periodicidad = periodicidad;
    }

    public int getISSN() {
        return ISSN;
    }

    public void setISSN(int ISSN) {
        this.ISSN = ISSN;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "ISSN=" + ISSN +
                ", nombre='" + nombre + '\'' +
                ", numeroEdicion=" + numeroEdicion +
                ", precio=" + precio +
                ", periodicidad='" + periodicidad + '\'' +
                '}';
    }
}
