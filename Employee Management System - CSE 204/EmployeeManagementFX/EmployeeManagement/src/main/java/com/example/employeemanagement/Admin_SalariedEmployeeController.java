package com.example.employeemanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import lib.DataHandler;
import lib.Employee;

import javax.swing.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Admin_SalariedEmployeeController implements Initializable {

    @FXML
    TextArea Employee1;
    @FXML
    TextField name1;
    @FXML
    TextField age1;
    @FXML
    TextField phone1;
    @FXML
    TextField designation1;
    @FXML
    TextField monthly_salary1;
    @FXML
    Button add1;
    @FXML
    Button main_menu1;

    public void main_menu1(ActionEvent e) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("Admin_AddEmployee.fxml"));
        Stage window =(Stage) main_menu1.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }

    public void initialize(URL arg0, ResourceBundle arg1) {
        ArrayList<Employee> employees = Main.myCom.getEmployees();
        String data = "";

        for (Employee e : employees)
        {
            data += e.toString() + "\n";
        }
        if (employees.size() == 0) {
            data = "No Employee Available";
        }
// TODO Auto-generated method stub
        Employee1.setText(data);
    }

    public void addEmployee(ActionEvent event) {
        String name = name1.getText();
        int age = Integer.parseInt(age1.getText());
        String des = designation1.getText();
        String ph = phone1.getText();
        double sal = Double.parseDouble(monthly_salary1.getText());
        String id = Main.myCom.addSalariedEmployee(name, age, des, ph, sal);
        //System.out.println(Main.myCom.getEmployees().size());
        DataHandler.saveData(Main.myCom);
        JOptionPane.showMessageDialog(null, id + "Added.");
        initialize(null, null);

    }
}
