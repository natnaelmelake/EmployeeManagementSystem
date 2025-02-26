package org.example.module;

public class Employee {

    private int employeeId;
    private String employeeFirstName;
    private String employeeLastName;
    private double employeeSalary;


    public Employee(int employeeId,String employeeFirstName, String employeeLastName, double employeeSalary){
        this.employeeId = employeeId;
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.employeeSalary = employeeSalary;
    }// constructor


    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }
}
