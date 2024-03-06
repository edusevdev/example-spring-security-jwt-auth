package com.example.demopresupuestos.service;

import com.example.demopresupuestos.model.entity.User;
import com.example.demopresupuestos.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional(readOnly = true)
    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public User findByUsername(final String username) {
        return this.userRepository.findByUsername(username);
    }

    @Override
    public User save(User user) {
        // TODO meter roles

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }
}
