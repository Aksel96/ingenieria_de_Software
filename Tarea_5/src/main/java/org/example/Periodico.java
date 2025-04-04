package org.example;

import org.example.factory.Producto;

public class Periodico implements Producto {
    private int ID;
    private String nombre;
    private String fechaDePublicacion;
    private float precio;

    public Periodico() {}

    public Periodico(int ID, String nombre, String fechaDePublicacion, float precio) {
        this.ID = ID;
        this.nombre = nombre;
        this.fechaDePublicacion = fechaDePublicacion;
        this.precio = precio;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaDePublicacion() {
        return fechaDePublicacion;
    }

    public void setFechaDePublicacion(String fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Periodico{" +
                "ID=" + ID +
                ", nombre='" + nombre + '\'' +
                ", fechaDePublicacion='" + fechaDePublicacion + '\'' +
                ", precio=" + precio +
                '}';
    }
}
