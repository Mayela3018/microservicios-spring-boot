package com.microservices.dto;

import com.microservices.model.Producto;

public class ProductoResponse {

    private Producto producto;
    private Categoria categoria;

    // Constructores
    public ProductoResponse() {}

    public ProductoResponse(Producto producto, Categoria categoria) {
        this.producto = producto;
        this.categoria = categoria;
    }

    // Getters y Setters
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}