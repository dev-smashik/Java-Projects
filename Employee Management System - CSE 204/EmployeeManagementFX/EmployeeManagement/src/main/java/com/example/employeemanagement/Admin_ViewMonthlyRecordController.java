package com.example.employeemanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import lib.*;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javax.swing.*;

import static lib.Company.*;

//public class Admin_ViewMonthlyRecordController implements Initializable {
//
//    @FXML
//    TextField employee_id;
//    @FXML
//    Button search;
//    @FXML
//    TextField details;
//    @FXML
//    Button back;
//
//    Company company;
//
//
//    public void initialize(URL url, ResourceBundle r)
//    {
//        company = DataHandler.loadData();
//    }
//
//    public void Monthly_Records(ActionEvent e)
//    {
//        String Employee_ID = employee_id.getText();
//
//        try {
//            Employee employee = company.findEmployee(Employee_ID);
//            ArrayList<DailyRecord> dailyRecords = company.getDailyRecords(Employee_ID);
//            String recordData = "";
//
//            for(DailyRecord record: dailyRecords)
//            {
//                recordData += record.toString() + "\n";
//            }
//            details.setText(recordData);
//
//        } catch (InvalidEmployeeException ex) {
//            details.setText("Data Not Found!");
//        }
//    }
//    public void Back(javafx.event.ActionEvent event) throws Exception
//    {
//        Parent root = FXMLLoader.load(getClass().getResource("AdminMenu.fxml"));
//        Stage window =(Stage) back.getScene().getWindow();
//        window.setScene(new Scene(root, 600, 400));
//    }
//
//}
//public class Admin_ViewMonthlyRecordController implements Initializable {
//
//    @FXML
//    private TextField employeeIdTextField;
//
//    @FXML
//    private Button searchButton;
//
//    @FXML
//    private TextField recordDetailsTextField;
//
//    @FXML
//    private Button backButton;
//
//    private Company company;
//
//    @Override
//    public void initialize(URL url, ResourceBundle rb) {
//        company = DataHandler.loadData();
//    }
//
//    @FXML
//    private void searchButtonAction(ActionEvent event) {
//        String employeeId = employeeIdTextField.getText();
//        try {
//            Employee employee = company.findEmployee(employeeId);
//            ArrayList<DailyRecord> dailyRecords = company.getDailyRecords(employeeId);
//            String recordData = "";
//            for (DailyRecord record : dailyRecords) {
//                recordData += record.toString() + "\n";
//            }
//            recordDetailsTextField.setText(recordData);
//        } catch (InvalidEmployeeException e) {
//            recordDetailsTextField.setText("Data Not Found!");
//        }
//    }
//
//    @FXML
//    private void backButtonAction(ActionEvent event) throws IOException {
//        Parent root = FXMLLoader.load(getClass().getResource("AdminMenu.fxml"));
//        Stage window = (Stage) backButton.getScene().getWindow();
//        window.setScene(new Scene(root, 600, 400));
//    }
//
//}
public class Admin_ViewMonthlyRecordController implements Initializable {

    @FXML
    private TextField employeeIdField;

    @FXML
    private TextField recordDetailsField;

    @FXML
    private Button backButton;

    private Company company;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        company = DataHandler.loadData();
    }

    @FXML
    private void handleSearchButton(ActionEvent event) {
        String employeeId = employeeIdField.getText();
        try {
            Employee employee = company.findEmployee(employeeId);
            ArrayList<DailyRecord> dailyRecords = company.getDailyRecords(employeeId);
            String recordData = "";
            for (DailyRecord record : dailyRecords) {
                recordData += record.toString() + "\n";
            }
            recordDetailsField.setText(recordData);
        } catch (InvalidEmployeeException ex) {
            recordDetailsField.setText("Data not found!");
        }
    }

    @FXML
    private void handleBackButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AdminMenu.fxml"));
        Stage window = (Stage) backButton.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }
}
