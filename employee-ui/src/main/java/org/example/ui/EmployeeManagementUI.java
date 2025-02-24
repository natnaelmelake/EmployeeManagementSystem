package org.example.ui;


import org.example.module.Employee;
//import org.example.module.TestEmployee;
import org.example.service.EmployeeService;

import javax.swing.*;
import java.awt.*;

public class EmployeeManagementUI {

    private EmployeeService employeeService;
    private DefaultListModel<String> employeeListModel = new DefaultListModel<>();


    public EmployeeManagementUI() {
        employeeService = new EmployeeService();
        JFrame frame = new JFrame();

        frame.setTitle("Employee Management System");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JTabbedPane tabbedPane = new JTabbedPane();

        tabbedPane.addTab("Home", homePanel());
        tabbedPane.addTab("Employee List", employeeListPanel());
        tabbedPane.addTab("Add Employee", addEmployeePanel());

        frame.add(tabbedPane);

        frame.setVisible(true);
    }

    private JPanel homePanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        JLabel label = new JLabel("<html><h1>Welcome to Employee Management System</h1><p>Use the tabs above to navigate.</p></html>", SwingConstants.CENTER);
        panel.add(label, BorderLayout.CENTER);
        return panel;
    }


    private JPanel employeeListPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        JList<String> employeeList = new JList<>(employeeListModel);
        JScrollPane scrollPane = new JScrollPane(employeeList);
        panel.add(scrollPane, BorderLayout.CENTER);

        return panel;
    }


    // Method to update JList when new employees are added
    private void updateEmployeeList() {
        employeeListModel.clear();  // Clear old data
        for (Employee emp : employeeService.getEmployees()) {
            employeeListModel.addElement(emp.getEmployeeId() + " - " + emp.getEmployeeFirstName() + " " + emp.getEmployeeLastName() + " - $" + emp.getEmployeeSalary());
        }
    }



    private JPanel addEmployeePanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        JLabel firstNameLabel = new JLabel("FirstName:");
        JTextField firstNameField = new JTextField();

        JLabel lastNameLabel = new JLabel("LastName:");
        JTextField lastNameField = new JTextField();


        JLabel salaryLabel = new JLabel("Salary:");
        JTextField salaryField = new JTextField();

        JButton addButton = new JButton("Add Employee");
        addButton.addActionListener(e -> {
            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();
            double salary = Double.parseDouble(salaryField.getText());


            employeeService.addEmployees(firstName,lastName,salary);
            updateEmployeeList();


            JOptionPane.showMessageDialog(null, "Employee Added Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            firstNameField.setText("");
            lastNameField.setText("");
            salaryField.setText("");
        });

        panel.add(firstNameLabel);
        panel.add(firstNameField);
        panel.add(lastNameLabel);
        panel.add(lastNameField);
        panel.add(salaryLabel);
        panel.add(salaryField);
        panel.add(new JLabel());  // Spacer
        panel.add(addButton);

        return panel;
    }

    public static void main(String[] args) {


    new EmployeeManagementUI();


    }
}
