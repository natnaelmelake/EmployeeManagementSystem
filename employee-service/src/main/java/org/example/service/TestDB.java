package org.example.service;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDB {
    public static void main(String[] args) {
        // MySQL Database URL (Replace 'your_database' with the actual database name)
        String url = "jdbc:mysql://localhost:3307/EmployeeDB";
        String user = "root"; // Change if you use a different username
        String password = ""; // Set your actual password (if any)

        try {
            // Load MySQL JDBC Driver (not necessary for modern JDBC, but safe to include)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Database connected successfully!");

            // Close Connection
            connection.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database connection failed!");
            e.printStackTrace();
        }
    }
}
