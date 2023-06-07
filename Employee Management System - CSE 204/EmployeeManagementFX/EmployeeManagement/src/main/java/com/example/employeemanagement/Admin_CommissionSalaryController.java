package com.example.employeemanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.fxml.Initializable;
import lib.DataHandler;
import lib.Employee;
import javax.swing.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


public class Admin_CommissionSalaryController implements Initializable
{
    @FXML
    Button add;
    @FXML
    TextArea Details;
    @FXML
    TextField name;
    @FXML
    TextField age;
    @FXML
    TextField phone;
    @FXML
    TextField designation;
    @FXML
    TextField salary;
    @FXML
    Button main_menu1;


    @FXML
    TableView<Employee> table;
    @FXML
    TableColumn<Employee, String>ID;
    @FXML
    TableColumn<Employee, String> Name;
    @FXML
    TableColumn<Employee, Integer> Age;
    @FXML
    TableColumn<Employee, String> Phone;
    @FXML
    TableColumn<Employee, String> Designation;
    @FXML
    TableColumn<Employee, Double> Salary;


    public void main_menu1(ActionEvent e) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("Admin_AddEmployee.fxml"));
        Stage window =(Stage) main_menu1.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        ArrayList<Employee> employees = Main.myCom.getEmployees();
        String data = "";
        for(Employee e: employees) {
            data += e.toString() + "\n\n";
        }
        if(employees.size()==0)
        {
           // DataHandler.saveData(Main.myCom);
            data = "No Employee Available";
        }

        Details.setText(data);

    }


    public void Admin_AddCommissionSalaryController(ActionEvent actionEvent) {
        String Name = name.getText();
        int Age = Integer.parseInt(age.getText());
        String Designation = designation.getText();
        String Phone = phone.getText();
        double Salary = Double.parseDouble(salary.getText());
        String ID = Main.myCom.addCommissionEmployee(Name, Age, Designation, Phone, Salary);
        DataHandler.saveData(Main.myCom);
        JOptionPane.showMessageDialog(null, ID + "Successfully Added!");
        initialize(null, null);
    }
}


