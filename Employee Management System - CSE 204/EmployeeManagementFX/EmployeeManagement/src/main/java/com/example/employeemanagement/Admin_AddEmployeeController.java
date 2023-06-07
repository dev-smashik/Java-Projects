package com.example.employeemanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;



public class Admin_AddEmployeeController {
    @FXML
    Button salaried_employee;
    @FXML
    Button hourly_employee;
    @FXML
    Button commission_employee;
    @FXML
    Button main_menu;

    public void Salaried_employee(ActionEvent e) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("Admin_SalariedEmployee.fxml"));
        Stage window =(Stage) salaried_employee.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }
    public void Hourly_employee(ActionEvent e) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("Admin_HourlyEmployee.fxml"));
        Stage window =(Stage) hourly_employee.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }
    public void Commission_employee(ActionEvent e) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("Admin_CommissionSalary.fxml"));
        Stage window =(Stage) commission_employee.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }
    public void Main_menu(ActionEvent e) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("AdminMenu.fxml"));
        Stage window =(Stage) main_menu.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }


}
