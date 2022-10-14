package ru.maren.dao.repository;


import lombok.AllArgsConstructor;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@org.springframework.stereotype.Repository

@AllArgsConstructor
public class Repository {
    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private final static String SCRIPT_FILE_NAME = "getProductName.sql";
    private final String query = read(SCRIPT_FILE_NAME);

    private static String read(String scriptFileName) {
        try (InputStream is = new ClassPathResource(scriptFileName).getInputStream();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            return bufferedReader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<String> getProductName(String name) {
        List<String> productNames = namedParameterJdbcTemplate.queryForList(query,
                Map.of("name", name),
                String.class);
        return productNames;
    }


}
