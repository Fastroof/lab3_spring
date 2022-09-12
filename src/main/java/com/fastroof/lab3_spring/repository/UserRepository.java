package com.fastroof.lab3_spring.repository;

import com.fastroof.lab3_spring.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository {
    List<User> getUsers();
}