package com.example.authjwt.ws.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"http://www.serverclient.com:3000"}) // It's necessary for being used from the other server
public class TestController {

    @PreAuthorize("hasRole('ROLE_admin')")
    @GetMapping("/products")
    public String findAll() {
        return "PRODUCTOS";
    }
}
