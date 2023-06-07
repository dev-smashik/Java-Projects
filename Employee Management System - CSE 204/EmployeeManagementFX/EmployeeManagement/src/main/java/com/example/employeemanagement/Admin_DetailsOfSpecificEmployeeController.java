package com.example.employeemanagement;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import lib.Company;
import lib.DataHandler;
import lib.Employee;
import javafx.scene.control.TextField;
import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;

public class Admin_DetailsOfSpecificEmployeeController {
    @FXML
    Button Back;
    @FXML
    Button Search;
    @FXML
    TextField employee_ID;
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

    public void Details_of_Specific_Employee() throws IOException
    {
        String Employee_ID = employee_ID.getText();
        Company com = DataHandler.loadData();
        ArrayList<Employee> employees = com.getEmployees();
        boolean f = false;
        for(Employee x : employees)
        {
            if(x.getId().equals(Employee_ID))
            {
                name.setText(x.getName());
                age.setText(Integer.toString(x.getAge()));
                phone.setText(x.getPhoneNum());
                designation.setText(x.getDesignation());
                salary.setText(Double.toString(x.getSalary()));
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
    public void Back(javafx.event.ActionEvent event) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("AdminMenu.fxml"));
        Stage window =(Stage) Back.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }

}
