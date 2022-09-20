package com.fastroof.lab3_spring.service;

import org.springframework.stereotype.Service;

@Service
public interface SearchService {
    String getSearchRequestAnswer(Double area, Integer bedroomCount, Integer price);
}
