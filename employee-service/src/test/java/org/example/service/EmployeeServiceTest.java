package org.example.service;

import org.example.module.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class EmployeeServiceTest {

    private EmployeeService employeeService;

    @BeforeEach
    void setUp() {
        employeeService = new EmployeeService();
    }

    @Test
    void testAddEmployees() {

        employeeService.addEmployees("Shetu", "neshtey", 200);


        List<Employee> employees = employeeService.getEmployees();
        assertEquals(1, employees.size());


        Employee emp = employees.get(0);
        assertEquals(1, emp.getEmployeeId());
        assertEquals("Shetu", emp.getEmployeeFirstName());
        assertEquals("neshtey", emp.getEmployeeLastName());
        assertEquals(200, emp.getEmployeeSalary());
    }

    @Test
    void testGetEmployees_emptyList() {

        List<Employee> employees = employeeService.getEmployees();
        assertTrue(employees.isEmpty());
    }
}