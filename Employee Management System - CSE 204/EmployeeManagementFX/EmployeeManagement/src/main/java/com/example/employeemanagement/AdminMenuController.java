package com.example.employeemanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AdminMenuController {

    @FXML
    Button Add_Employee;
    @FXML
    Button Increase_salary;
    @FXML
    Button View_monthly_salary;
    @FXML
    Button Details_specific_salary;
    @FXML
    Button View_monthly_record;
    @FXML
    Button Switch_role;
    @FXML
    Button exit;

    public void Add_employee(ActionEvent e) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("Admin_AddEmployee.fxml"));
        Stage window =(Stage) Add_Employee.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }

    public void Increase_salary(ActionEvent e) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("Admin_IncreaseSalary.fxml"));
        Stage window =(Stage) Increase_salary.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }

    public void View_monthly_salary(ActionEvent e) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("Admin_ViewMonthlySalaryOfEmployee.fxml"));
        Stage window =(Stage) View_monthly_salary.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }

    public void Details_specific_salary(ActionEvent e) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("Admin_DetailsOfSpecificEmployee.fxml"));
        Stage window =(Stage) Details_specific_salary.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }

    public void View_monthly_record(ActionEvent e) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("Admin_ViewMonthlyRecord.fxml"));
        Stage window =(Stage) View_monthly_record.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }

    public void Switch_role(ActionEvent e) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Stage window =(Stage) Switch_role.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }

    public void exit(ActionEvent event) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("Exit.fxml"));
        Stage window =(Stage) exit.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }





}
