package com.example.authjwt.service;

import com.example.authjwt.model.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findByUsername(final String username);

    User save(User user);
}
