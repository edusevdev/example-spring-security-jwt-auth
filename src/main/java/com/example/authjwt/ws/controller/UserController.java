package com.example.authjwt.ws.controller;

import com.example.authjwt.model.entity.User;
import com.example.authjwt.service.user.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@Log4j2
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> findAll() {
        log.info("Obteniendo usuarios");
        return this.userService.findAll();
    }

    @GetMapping("/users/{username}")
    public User findByUsername(@PathVariable final String username) {
        return this.userService.findByUsername(username);
    }

    @PostMapping("/users")
    public ResponseEntity<?> create(@RequestBody final User user) {
        if (Objects.nonNull(user) && Objects.nonNull(this.userService.findByUsername(user.getUsername()))) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("User already exists");
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(this.userService.save(user));
    }
}
