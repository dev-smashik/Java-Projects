package com.example.employeemanagement;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import lib.Company;
import lib.DataHandler;
import lib.Employee;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;

public class Employee_ViewProfileController {
    @FXML
    Button addAnother;
    @FXML
    Button back;
    @FXML
     TextField employeeid;
    @FXML
    TextField name;
    @FXML
    TextField age;
    @FXML
    TextField phone;
    @FXML
    TextField designation;
    @FXML
    TextField employeeSalary;
    @FXML
    Button search;


    public void DetailsEmployeeID() throws IOException
    {
        String employeeID;
        employeeID = employeeid.getText();
        Company com = DataHandler.loadData();
        ArrayList<Employee> employees = com.getEmployees();
        boolean f = true;
        for(Employee e: employees) {
            if (e.getId().equals(employeeID)) {
                name.setText(e.getName());
                age.setText(Integer.toString(e.getAge()));
                designation.setText((e.getDesignation()));
                phone.setText(e.getPhoneNum());
                employeeSalary.setText(Double.toString(e.getSalary()));
                f = true;
                break;
            }

        }

        if(!f)
        {
            JOptionPane.showMessageDialog(null,("Couldn't find your ID"+ employeeID));
            return;
        }
        
    }

    public void Back(javafx.event.ActionEvent actionEvent) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("EmployeeMenu.fxml"));
        Stage window =(Stage) back.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }

}
