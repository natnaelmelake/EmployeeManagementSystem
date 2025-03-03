package org.example.ui;

import org.example.module.Employee;
import org.example.service.EmployeeService;
import javax.swing.DefaultListModel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeManagementUITest {

    private EmployeeManagementUI employeeManagementUI;
    private EmployeeService employeeService;

    @BeforeEach
    public void setUp() {
        employeeManagementUI = new EmployeeManagementUI();
        employeeService = employeeManagementUI.getEmployeeService(); // Access the service
    }

    @Test
    public void testUpdateEmployeeList() {
        // Add employees using employeeService
        employeeService.addEmployees("Teno", "Haile", 50000);
        employeeService.addEmployees("Batu", "Berhe", 60000);

        // Update the UI model
        employeeManagementUI.updateEmployeeList();

        // Get the updated employee list
        DefaultListModel<String> employeeListModel = employeeManagementUI.getEmployeeListModel();

        // Assertions
        assertEquals(2, employeeListModel.getSize());
        assertEquals("1 - Teno Haile - $50000.0", employeeListModel.getElementAt(0));
        assertEquals("2 - Batu Berhe - $60000.0", employeeListModel.getElementAt(1));
    }
}
