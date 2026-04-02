package com.AML3A.JWT.Auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AML3A.JWT.Auth.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

}