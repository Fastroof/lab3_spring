package com.fastroof.lab3_spring.config;

import com.fastroof.lab3_spring.entity.Order;
import com.fastroof.lab3_spring.repository.FakeUserRepository;
import com.fastroof.lab3_spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfiguration {
    //Singleton
    @Bean
    @Autowired
    @Scope("singleton")
    public UserRepository userRepository(UserRepository fakeUserRepository) {
        System.out.println(fakeUserRepository.getUsers().toString());
        return new FakeUserRepository();
    }

    //prototype
    @Bean
    @Autowired
    @Scope("prototype")
    public Order order(UserRepository fakeUserRepository) {
        System.out.println(fakeUserRepository.getUsers().toString());
        return new Order();
    }


}

