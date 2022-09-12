package com.fastroof.lab3_spring.repository;

import com.fastroof.lab3_spring.entity.User;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Getter
@Setter
public class FakeUserRepository implements UserRepository {
    private final List<User> users = new ArrayList<>();
    public FakeUserRepository() {
        users.add(new User(0L, "john@gmail.com", "12345678", "John", "Bill"));
        users.add(new User(1L, "bob@gmail.com", "87654321", "Bob", "Brown"));
    }

}
