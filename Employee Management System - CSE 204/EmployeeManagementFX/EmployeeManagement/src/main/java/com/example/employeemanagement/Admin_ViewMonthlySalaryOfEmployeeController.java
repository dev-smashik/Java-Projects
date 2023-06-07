package com.example.employeemanagement;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import lib.Company;
import lib.DataHandler;
import lib.Employee;
import javafx.scene.control.Button;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.ArrayList;

public class Admin_ViewMonthlySalaryOfEmployeeController {

    @FXML
    TextField employee_id;
    @FXML
    Button show;
    @FXML
    Button back;
    @FXML
    TextField details;

    public void Back(javafx.event.ActionEvent e) throws  Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("AdminMenu.fxml"));
        Stage window = (Stage) back.getScene().getWindow();
        window.setScene(new Scene(root,600, 400));
    }

//    public void Details(ActionEvent e) throws IOException
//    {
//        ArrayList<Employee> employees = DataHandler.loadData().getEmployees();
//        String data = "";
//        for(Employee x: employees)
//        {
//            data = x.toString()+"\n";
//        }
//
//        if(employees.size() == 0)
//        {
//            data = "No employee Found";
//        }
//        details.setText(data);
//    }

    public void Monthly_Salary_Of_Employee() throws  IOException
    {
        String EmployeeID =  employee_id.getText();
        Company com = DataHandler.loadData();
        ArrayList<Employee> employees = com.getEmployees();
        boolean f = false;

        for(Employee x: employees)
        {
            if(x.getId().equals(EmployeeID))
            {
                details.setText(Double.toString(x.getSalary()));
                f = true;
                break;
            }
        }

        if(!f)
        {
            JOptionPane.showMessageDialog(null, "Sorry we couldn't found this ID");
            return;
        }
    }


}
