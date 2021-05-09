package com.cafe_server.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cafe_server.demo.model.ERole;
import com.cafe_server.demo.model.Role;

@Repository
public interface JwtRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}