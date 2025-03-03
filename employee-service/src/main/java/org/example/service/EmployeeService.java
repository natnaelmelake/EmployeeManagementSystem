package org.example.service;

import org.example.module.Employee;

import java.util.ArrayList;
import java.util.List;

import java.sql.*;

public class EmployeeService {

    private List<Employee> employees;
    private int nextId = 1;

    public EmployeeService() {

        employees = new ArrayList<>();
    }


    public void addEmployees(String firstName, String lastName, double salary) {
        Employee emp = new Employee(nextId++, firstName, lastName, salary);
        employees.add(emp);
    }


    public List<Employee> getEmployees() {
        return employees;
    }
}


//    private static final String URL = "jdbc:mysql://localhost:3307/EmployeeDB";
//    private static final String USER = "root";
//    private static final String PASSWORD = ""; // Set your password if necessary
//
//    // Add Employee to Database
//    public void addEmployees(String firstName, String lastName, double salary) {
//        String sql = "INSERT INTO employees (employeeFirstName, employeeLastName, employeeSalary) VALUES (?, ?, ?)";
//
//        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
//             PreparedStatement stmt = conn.prepareStatement(sql)) {
//
//            stmt.setString(1, firstName);
//            stmt.setString(2, lastName);
//            stmt.setDouble(3, salary);
//
//            stmt.executeUpdate();
//            System.out.println("Employee added successfully!");
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    // Retrieve Employees from Database
//    public List<Employee> getEmployees() {
//        List<Employee> employees = new ArrayList<>();
//        String sql = "SELECT * FROM employees";
//
//        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
//             Statement stmt = conn.createStatement();
//             ResultSet rs = stmt.executeQuery(sql)) {
//
//            while (rs.next()) {
//                int id = rs.getInt("employeeId");
//                String firstName = rs.getString("employeeFirstName");
//                String lastName = rs.getString("employeeLastName");
//                double salary = rs.getDouble("employeeSalary");
//
//                employees.add(new Employee(id, firstName, lastName, salary));
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        return employees;
//    }
//}
