package com.microservices.service;

import com.microservices.client.CategoriaClient;
import com.microservices.dto.ProductoResponse;
import com.microservices.dto.Categoria;
import com.microservices.model.Producto;
import com.microservices.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    private final ProductoRepository repository;
    private final CategoriaClient categoriaClient;

    public ProductoService(ProductoRepository repository, CategoriaClient categoriaClient) {
        this.repository = repository;
        this.categoriaClient = categoriaClient;
    }

    // LISTAR TODOS LOS PRODUCTOS
    public List<Producto> listar() {
        return repository.findAll();
    }

    // OBTENER PRODUCTO + SU CATEGORÍA
    public ProductoResponse obtener(Long id) {
        // Buscar en BD
        Producto producto = repository.findById(id).orElse(null);

        if (producto == null) {
            return null;
        }

        // Llamar al microservicio categoría por ID
        Categoria categoria = null;
        try {
            categoria = categoriaClient.obtenerCategoria(producto.getCategoriaId());
        } catch (Exception e) {
            System.err.println("⚠️ Error al obtener categoría: " + e.getMessage());
            // Continúa sin categoría si el servicio no responde
        }

        // Armar la respuesta final
        ProductoResponse response = new ProductoResponse();
        response.setProducto(producto);
        response.setCategoria(categoria);

        return response;
    }

    // CREAR PRODUCTO
    public Producto crear(Producto producto) {
        return repository.save(producto);
    }

    // ACTUALIZAR PRODUCTO
    public Producto actualizar(Long id, Producto producto) {
        // Verificar si existe
        Producto productoExistente = repository.findById(id).orElse(null);

        if (productoExistente == null) {
            return null;
        }

        // Actualizar los campos
        productoExistente.setNombre(producto.getNombre());
        productoExistente.setPrecio(producto.getPrecio());
        productoExistente.setStock(producto.getStock());
        productoExistente.setCategoriaId(producto.getCategoriaId());

        // Guardar cambios
        return repository.save(productoExistente);
    }

    // ELIMINAR PRODUCTO
    public boolean eliminar(Long id) {
        // Verificar si existe
        if (!repository.existsById(id)) {
            return false;
        }

        // Eliminar
        repository.deleteById(id);
        return true;
    }
}