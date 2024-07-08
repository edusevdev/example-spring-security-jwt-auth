package com.example.demopresupuestos.ws.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @PreAuthorize("hasRole('ROLE_admin')")
    @GetMapping("/products")
    public String findAll() {
        return "PRODUCTOS";
    }
}
