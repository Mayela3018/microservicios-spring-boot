package com.microservices.controller;

import com.microservices.dto.ProductoResponse;
import com.microservices.model.Producto;
import com.microservices.service.ProductoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    private final ProductoService service;

    public ProductoController(ProductoService service) {
        this.service = service;
    }

    // GET: Listar todos los productos
    @GetMapping
    public List<Producto> listar() {
        return service.listar();
    }

    // GET: Obtener producto por ID con su categoría
    @GetMapping("/{id}")
    public ResponseEntity<ProductoResponse> obtener(@PathVariable Long id) {
        ProductoResponse response = service.obtener(id);

        if (response == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(response);
    }

    // POST: Crear un nuevo producto
    @PostMapping
    public ResponseEntity<Producto> crear(@RequestBody Producto producto) {
        Producto nuevoProducto = service.crear(producto);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoProducto);
    }

    // PUT: Actualizar un producto existente
    @PutMapping("/{id}")
    public ResponseEntity<Producto> actualizar(@PathVariable Long id, @RequestBody Producto producto) {
        Producto productoActualizado = service.actualizar(id, producto);

        if (productoActualizado == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(productoActualizado);
    }

    // DELETE: Eliminar un producto
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        boolean eliminado = service.eliminar(id);

        if (!eliminado) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.noContent().build();
    }
}