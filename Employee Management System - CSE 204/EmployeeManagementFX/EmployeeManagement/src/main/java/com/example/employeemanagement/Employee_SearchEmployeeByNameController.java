package com.example.employeemanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import lib.Company;
import lib.DataHandler;
import lib.Employee;

import java.io.IOException;
import java.util.ArrayList;

public class Employee_SearchEmployeeByNameController {

    @FXML
    private TextField employeeNameTextField;
    @FXML
    private Button searchButton;
    @FXML
    private TextArea employeeDetailsTextField;
    @FXML
    private Button exitButton;

    public void initialize() {
    }

    public void searchEmployeeByName(ActionEvent event) {
        String employeeName = employeeNameTextField.getText();

        if (employeeName.isEmpty()) {
            employeeDetailsTextField.setText("Please Enter Employee Name!");
            return;
        }

        Company company = DataHandler.loadData();
        ArrayList<Employee> employees = company.getEmployees();
        Employee foundEmployee = null;

        for (Employee employee : employees) {
            if (employee.getName().equals(employeeName)) {
                foundEmployee = employee;
                break;
            }
        }

        if (foundEmployee != null) {
            employeeDetailsTextField.setText(foundEmployee.toString());
        } else {
            employeeDetailsTextField.setText("No Employee Name Found!");
        }
    }

    public void exit(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("EmployeeMenu.fxml"));
        Stage window = (Stage) exitButton.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }
}
