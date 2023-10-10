package com.facu.restfake.controllers;

import com.facu.restfake.entities.Product;
import com.facu.restfake.services.ProductServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "fakestoreapi.com/products")
public class ProductController extends BaseControllerImpl<Product, ProductServiceImpl>{

    @GetMapping("/busquedaPorPrecioMayorA")
    public ResponseEntity<?> busquedaPorPrecioMayorA (@RequestParam Double precioMinimo) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.busquedaPrecioMayorA(precioMinimo));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"" + e.getMessage() + "\"}");
        }
    }
    @GetMapping("/busquedaPorPrecioMayorA1")
    public ResponseEntity<?> busquedaPorPrecioMayorA1 (@RequestParam Double precioMinimo) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.busquedaPrecioMayorA1(precioMinimo));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"" + e.getMessage() + "\"}");
        }
    }

    @GetMapping("/buscarPorPrecioEntre")
    public ResponseEntity<?> buscarPorPrecioEntre (@RequestParam Double precioMinimo, @RequestParam Double precioMaximo) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.buscarPorPrecioEntre(precioMinimo, precioMaximo));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"" + e.getMessage() + "\"}");
        }
    }

    @GetMapping("/buscarPorPrecioEntre1")
    public ResponseEntity<?> buscarPorPrecioEntre1 (@RequestParam Double precioMinimo, @RequestParam Double precioMaximo) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.buscarPorPrecioEntre1(precioMinimo, precioMaximo));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"" + e.getMessage() + "\"}");
        }
    }

}
