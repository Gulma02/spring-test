package com.example.demo.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLRepository {
    private String table = "";
    @Autowired
    Environment env = null;

    private Connection getConnection() throws Exception {
        try {
            return DriverManager.getConnection(
                    env.getProperty("spring.datasource.url"),
                    env.getProperty("spring.datasource.username"),
                    env.getProperty("spring.datasource.password")
            );
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        }
    }
}
