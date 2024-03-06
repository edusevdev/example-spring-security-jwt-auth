package com.example.demopresupuestos.model.repository;

import com.example.demopresupuestos.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(final String username);
}
