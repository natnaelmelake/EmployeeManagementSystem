package org.example.service;

import org.example.module.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    private List<Employee> employees;
    private int nextId = 1;

    public EmployeeService(){

        employees = new ArrayList<>();
    }


    public void addEmployees(String firstName, String lastName, double salary){
        Employee emp = new Employee(nextId++, firstName, lastName, salary);
        employees.add(emp);
    }


    public List<Employee> getEmployees() {
        return employees;
    }
}
