package org.example.module;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void testEmployeeConstructorAndGetters() {

        int expectedId = 1;
        String expectedFirstName = "Nati";
        String expectedLastName = "chekan";
        double expectedSalary = 200.0;

        Employee employee = new Employee(expectedId, expectedFirstName, expectedLastName, expectedSalary);

        assertEquals(expectedId, employee.getEmployeeId(), "ID mismatch");
        assertEquals(expectedFirstName, employee.getEmployeeFirstName(), "First name mismatch");
        assertEquals(expectedLastName, employee.getEmployeeLastName(), "Last name mismatch");
        assertEquals(expectedSalary, employee.getEmployeeSalary(), "Salary mismatch");
    }
}
