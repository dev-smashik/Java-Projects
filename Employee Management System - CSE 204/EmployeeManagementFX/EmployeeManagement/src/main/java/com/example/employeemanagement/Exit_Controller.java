package com.example.employeemanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Exit_Controller {
    @FXML
    Button exit;
    @FXML
    Button goto_login;

    public void exit(ActionEvent e) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("Thankyou.fxml"));
        Stage window =(Stage) exit.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }

    public void goto_login(ActionEvent e) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Stage window =(Stage) goto_login.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }





}
