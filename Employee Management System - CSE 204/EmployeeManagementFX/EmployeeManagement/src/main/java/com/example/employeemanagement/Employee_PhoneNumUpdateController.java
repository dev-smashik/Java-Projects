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

public class Employee_PhoneNumUpdateController {
    @FXML
    TextField employee_id;
    @FXML
    TextField phone_no;
   @FXML
    Button save;
   @FXML
    Button exit;

   @FXML
    private void EditPhoneNum() throws IOException
   {
       String id = employee_id.getText();
       String phone = phone_no.getText();

       if(id.isEmpty() || phone.isEmpty())
       {
           JOptionPane.showMessageDialog(null, "Please Enter ID & Phone No.");
           return;
       }

       DataHandler.loadData();
       ArrayList<Employee> employees = Main.myCom.getEmployees();
       for (Employee e: employees)
       {
           if(e.getId().equals(id))
           {
               e.setPhoneNum(phone);
               JOptionPane.showMessageDialog(null, "Phone No added successfully");
               DataHandler.saveData(Main.myCom);
               return;
           }
       }

       JOptionPane.showMessageDialog(null, "No employee found by ID: "+id);
       return;
   }

    public void exit(ActionEvent e) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("EmployeeMenu.fxml"));
        Stage window =(Stage) exit.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }



}
