package com.example.demopresupuestos.ws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/products")
    public String findAll() {
        return "PRODUCTOS";
    }
}
