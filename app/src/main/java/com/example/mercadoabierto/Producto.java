package com.example.mercadoabierto;

import android.widget.ImageView;

public class Producto {
    private String nombre;
    private String descripción;
    private Integer imagen;

public Producto (){}

    public Producto(String nombre, String descripción) {
        this.nombre = nombre;
        this.descripción = descripción;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public Integer getImagen() {
        return imagen;
    }

    public void setImagen(Integer imagen) {
        this.imagen = imagen;
    }
}
