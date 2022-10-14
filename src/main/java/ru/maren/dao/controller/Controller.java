package ru.maren.dao.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.maren.dao.service.Service;

import java.util.List;

@RestController
@AllArgsConstructor
public class Controller {
    private final Service service;

    @GetMapping("/products/fetch-product")
    public List<String> getProductName(@RequestParam String name) {
        return service.getProductName(name);
    }
}
