package com.bookswipe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
    private static final String URL = "jdbc:mysql://localhost:3306/bookswipe";
    private static final String USER = "root"; // or your MySQL user
    private static final String PASSWORD = "root1234"; // enter your actual MySQL password

    public static Connection connect() {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("✅ Connected to database!");
            return conn;
        } catch (SQLException e) {
            System.out.println("❌ Failed to connect to database!");
            e.printStackTrace();
            return null;
        }
    }
}