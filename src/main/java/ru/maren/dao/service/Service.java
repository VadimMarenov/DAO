package ru.maren.dao.service;

import lombok.AllArgsConstructor;
import ru.maren.dao.repository.Repository;

import java.util.List;

@org.springframework.stereotype.Service
@AllArgsConstructor
public class Service {
    private final Repository repository;

    public List<String> getProductName(String name) {
        return repository.getProductName(name);
    }
}
