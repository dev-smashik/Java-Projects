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
import lib.InvalidEmployeeException;

import java.io.IOException;

//public class Employee_SearchByIDController {
//    @FXML
//    Button search;
//    @FXML
//    Button exit;
//
//    @FXML
//    TextField employee_id;
//    @FXML
//    TextField details;
//
//    public void searchEmployeeId() throws IOException
//    {
//        String id = employee_id.getText();
//        DataHandler.loadData();
//        ArrayList<Employee> employees = Main.myCom.getEmployees();
//        String employeeInfo = "";
//
//        for(Employee e: employees) {
//            if (e.getId().equals(id)) {
//                employeeInfo = e.toString();
//                break;
//            }
//        }
//
//        if(employeeInfo.isEmpty())
//        {
//            details.setText("No employee Found");
//        }
//        else
//        {
//            details.setText(employeeInfo);
//        }
//    }
//    public void exit(ActionEvent e) throws Exception
//    {
//        Parent root = FXMLLoader.load(getClass().getResource("EmployeeMenu.fxml"));
//        Stage window =(Stage) exit.getScene().getWindow();
//        window.setScene(new Scene(root, 600, 400));
//    }
//}
//public class Employee_SearchByIDController {
//    @FXML
//    private Button searchButton;
//    @FXML
//    private Button exitButton;
//    @FXML
//    private TextField employeeIdTextField;
//    @FXML
//    private TextField detailsTextField;
//    public void searchEmployeeById() {
//        String employeeId = employeeIdTextField.getText();
//        ArrayList<Employee> employees = DataHandler.loadData().getEmployees();
//        String employeeInfo = "";
//
//        for (Employee employee : employees) {
//            if (employee.getId().equals(employeeId)) {
//                employeeInfo = employee.toString();
//                break;
//            }
//        }
//
//        if (employeeInfo.isEmpty()) {
//            detailsTextField.setText("No employee found.");
//        } else {
//            detailsTextField.setText(employeeInfo);
//        }
//
//    }
//
//    public void exit(ActionEvent event) throws IOException {
//        Parent root = FXMLLoader.load(getClass().getResource("EmployeeMenu.fxml"));
//        Stage window = (Stage) exitButton.getScene().getWindow();
//        window.setScene(new Scene(root, 600, 400));
//    }
//}
//

public class Employee_SearchByIDController {
    @FXML
    private Button searchButton;
    @FXML
    private Button exitButton;
    @FXML
    private TextField employeeIdTextField;
    @FXML
    private TextArea detailsTextField;

    public void searchEmployeeById() {
        String employeeId = employeeIdTextField.getText();
        Company company = DataHandler.loadData();

        try {
            Employee employee = company.findEmployee(employeeId);
            detailsTextField.setText(employee.toString());
        } catch (InvalidEmployeeException ex) {
            detailsTextField.setText("No employee found.");
        }
    }

    public void exit(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("EmployeeMenu.fxml"));
        Stage window = (Stage) exitButton.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }
}
