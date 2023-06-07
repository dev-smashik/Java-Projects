package com.example.employeemanagement;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
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

public class Admin_HourlyEmployeeController
{
    @FXML
    private Button add;
    @FXML
    Button Main_menu;

    @FXML
    TextField name;
    @FXML
    TextField age;
    @FXML
    TextField phone;
    @FXML
    TextField designation;
    @FXML
    TextField hourly_rate;
    @FXML
    TextArea details;


    public void initialize (URL arg0, ResourceBundle arg1)
    {
        //Company com = new Company("UAP");
        ArrayList<Employee> employees = Main.myCom.getEmployees();
        String data = "";

        for(Employee e: employees)
        {
            data += e.toString()+"\n";
        }

        if(employees.size()==0)
        {
            data = "No Employee Available";
        }
        details.setText(data);
    }

    public void Add_HourlyRate(javafx.event.ActionEvent actionEvent)
    {
        String Name = name.getText();
        int Age = Integer.parseInt(age.getText());
        String Designation = designation.getText();
        String Phone = phone.getText();
        double Hourly_Rate = Double.parseDouble(hourly_rate.getText());
        String id = Main.myCom.addHourlyEmployee(Name, Age, Designation, Phone, Hourly_Rate);
        //System.out.println(Main.myCom.getEmployees().size());
        DataHandler.saveData(Main.myCom);
        JOptionPane.showMessageDialog(null, id + "Successfully Added!");
        initialize(null, null);
    }

    public void Main_Menu(javafx.event.ActionEvent event) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("Admin_AddEmployee.fxml"));
        Stage window =(Stage) Main_menu.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }

}
