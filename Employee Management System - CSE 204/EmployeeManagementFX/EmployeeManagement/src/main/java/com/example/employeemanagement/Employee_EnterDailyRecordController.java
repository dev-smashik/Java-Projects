package com.example.employeemanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import lib.Company;
import lib.DataHandler;
import lib.InvalidEmployeeException;

import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

//public class Employee_EnterDailyRecordController {
//    @FXML
//    Button search;
//    @FXML
//    Button enter;
//    @FXML
//    Button back;
//    @FXML
//    TextField employee_id;
//    @FXML
//    TextField hour_or_sale;
//    Company company;
//    public void initialize(URL arg0, ResourceBundle arg1)
//    {
//        company = DataHandler.loadData();
//    }
//
//    public void EnterDailyRecords(ActionEvent e)
//    {
//        String id = employee_id.getText();
//        String sale = hour_or_sale.getText();
//
//        if(id.isEmpty() || sale.isEmpty())
//        {
//            Alert alert = new Alert(Alert.AlertType.ERROR);
//            alert.setTitle("Error");
//            alert.setHeaderText(null);
//            alert.setContentText("Please enter all the fields.");
//            alert.showAndWait();
//        }
//        else
//        {
//            try{
//                double Value = Double.parseDouble(sale);
//                company.addRecord(id, Value);
//                DataHandler.saveData(company);
//                JOptionPane.showMessageDialog(null, "Added Successfully!");
//                return;
//            }
//            catch (NumberFormatException ex)
//            {
//                JOptionPane.showMessageDialog(null, "Enter valid Number!!!");
//                return;
//            }
//            catch (InvalidEmployeeException ex)
//            {
//                JOptionPane.showMessageDialog(null, "No employee Found");
//                return;
//            }
//        }
//
//    }
//
//    public void Back(javafx.event.ActionEvent e) throws Exception
//    {
//        Parent root = FXMLLoader.load(getClass().getResource("Admin_AddEmployee.fxml"));
//        Stage window =(Stage) back.getScene().getWindow();
//        window.setScene(new Scene(root, 600, 400));
//    }
//
//
//}
public class Employee_EnterDailyRecordController {


    @FXML
    private Button backButton;

    @FXML
    private TextField employeeIdTextField;


    @FXML
    private TextField hourOrSaleTextField;

    private Company company;

    public void initialize(URL url, ResourceBundle resource) {
        company = DataHandler.loadData();
    }

    @FXML
    private void enterButtonAction(ActionEvent event) {
        String employeeId = employeeIdTextField.getText();
        String hourOrSale = hourOrSaleTextField.getText();

        if (employeeId.isEmpty() || hourOrSale.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please enter all fields.");
            alert.showAndWait();
        } else {
            try {
                double value = Double.parseDouble(hourOrSale);
                company.addRecord(employeeId, value);
                DataHandler.saveData(company);
                JOptionPane.showMessageDialog(null, "Added Successfully!");
                return;
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Enter a valid number.");
                return;
            } catch (InvalidEmployeeException ex) {
                JOptionPane.showMessageDialog(null, "Employee not found.");
                return;
            }
        }
    }

    @FXML
    private void backButtonAction(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("EmployeeMenu.fxml"));
        Stage window = (Stage) backButton.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }
}
