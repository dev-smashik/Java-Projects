package com.example.employeemanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    Button admin;
    @FXML
    Button employee;
    @FXML
    Button exit;

    public void admin(ActionEvent e) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("AdminMenu.fxml"));
        Stage window =(Stage) admin.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }
    public void employee(ActionEvent e) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("Employee_Verify.fxml"));
        Stage window =(Stage) employee.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }

    public void exit(ActionEvent e) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("Exit.fxml"));
        Stage window =(Stage) exit.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }

}
