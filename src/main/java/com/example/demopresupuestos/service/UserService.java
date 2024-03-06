package com.example.demopresupuestos.service;

import com.example.demopresupuestos.model.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findByUsername(final String username);

    User save(User user);
}
