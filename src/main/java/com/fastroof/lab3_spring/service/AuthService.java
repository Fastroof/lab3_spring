package com.fastroof.lab3_spring.service;

import com.fastroof.lab3_spring.pojo.UserRegistrationRequest;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface AuthService {
    Map<String, Object> processRegister(UserRegistrationRequest request);
}
