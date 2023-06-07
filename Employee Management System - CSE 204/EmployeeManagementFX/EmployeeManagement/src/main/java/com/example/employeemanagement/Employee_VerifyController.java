package com.example.employeemanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import lib.Employee;

import javax.swing.*;
import java.io.IOException;


public class Employee_VerifyController {

    @FXML
    TextField employee_id;
    @FXML
    Button verify;
    @FXML
    Button back;

    boolean isEmployeeIDValid(String id)
    {
        for(Employee e: Main.myCom.getEmployees())
        {
            if(e.getId().equals(id))
            {
                return true;
            }
        }
        return  false;
    }

    public void Enter(ActionEvent e) throws IOException
    {
        String id = employee_id.getText();
        try{
            Employee emp = Main.myCom.findEmployee(id);
            System.out.println(emp.getId() + " is a valid employee");
        } catch (Exception e1)
        {
            System.out.println(e1.getMessage());
        }

        if(isEmployeeIDValid(id))
        {
            Parent root = FXMLLoader.load(getClass().getResource("EmployeeMenu.fxml"));
            Stage window =(Stage) verify.getScene().getWindow();
            window.setScene(new Scene(root, 600, 400));
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Couldn't Verify");
            return;
        }
    }

    public void Back(javafx.event.ActionEvent e) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Stage window =(Stage) back.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }

}
//public class Employee_VerifyController {
//
//    @FXML
//    private TextField employeeIdTextField;
//
//    @FXML
//    private Button verifyButton;
//
//    @FXML
//    private Button backButton;
//
//    private Company company;
//
//    public void initialize(URL url, ResourceBundle rb) {
//        company = DataHandler.loadData();
//    }
//
//    private boolean isEmployeeIdValid(String id) {
//        for (Employee e : company.getEmployees()) {
//            if (e.getId().equals(id)) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    @FXML
//    private void verifyButtonAction(ActionEvent event) throws IOException {
//        String id = employeeIdTextField.getText();
//        if (isEmployeeIdValid(id)) {
//            Parent root = FXMLLoader.load(getClass().getResource("EmployeeMenu.fxml"));
//            Stage window = (Stage) verifyButton.getScene().getWindow();
//            window.setScene(new Scene(root, 600, 400));
//        } else {
//            JOptionPane.showMessageDialog(null, "Couldn't Verify");
//        }
//    }
//
//    @FXML
//    private void backButtonAction(ActionEvent event) throws IOException {
//        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
//        Stage window = (Stage) backButton.getScene().getWindow();
//        window.setScene(new Scene(root, 600, 400));
//    }
//
//}
