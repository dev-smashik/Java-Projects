package com.example.employeemanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import lib.DataHandler;
import lib.Employee;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;

public class Admin_IncreaseSalaryController {

    @FXML
    TextField employeeID;
    @FXML
    Button add;
    @FXML
    Button main_menu;
    @FXML
    TextField increase_salary;

    public void main_menu(ActionEvent e) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("AdminMenu.fxml"));
        Stage window =(Stage) main_menu.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }

    public void add(ActionEvent e) throws IOException
    {
        String id = employeeID.getText();
        double salary = Double.parseDouble(increase_salary.getText());

        if(id.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"ID not found!");
            return;
        }
        DataHandler.loadData();
        ArrayList<Employee> employees = Main.myCom.getEmployees();
        for(Employee x: employees)
        {
            if(x.getId().equals(id))
            {
                x.increaseSalary(salary);
                JOptionPane.showMessageDialog(null,"Congratulation! Your Salary Updated Sucessfully!");
                DataHandler.saveData(Main.myCom);
                return;
            }
        }

        JOptionPane.showMessageDialog(null,"ID not found!");
        return;
    }



}
