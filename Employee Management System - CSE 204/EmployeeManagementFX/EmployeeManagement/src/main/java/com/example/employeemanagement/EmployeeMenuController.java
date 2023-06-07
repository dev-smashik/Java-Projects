package com.example.employeemanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class EmployeeMenuController {
    @FXML
    Button view_profile;
    @FXML
    Button edit_phone_number;
    @FXML
    Button search_for_an_employee_by_id;
    @FXML
    Button search_for_an_employee_by_name;
    @FXML
    Button enter_daily_record;
    @FXML
    Button switch_role;
    @FXML
    Button exit;

    public void view_profile(ActionEvent e) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("Employee_ViewProfile.fxml"));
        Stage window =(Stage) view_profile.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }

    public void edit_phone_number(ActionEvent e) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("Employee_PhoneNumUpdate.fxml"));
        Stage window =(Stage) edit_phone_number.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }
    public void Search_for_an_employee_by_id(ActionEvent e) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("Employee_SearchByID.fxml"));
        Stage window =(Stage) search_for_an_employee_by_id.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }

    public void Search_for_an_employee_by_name(ActionEvent e) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("Employee_SearchEmployeeByName.fxml"));
        Stage window =(Stage) search_for_an_employee_by_name.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }
    public void Enter_daily_record(ActionEvent e) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("Employee_EnterDailyRecord.fxml"));
        Stage window =(Stage) enter_daily_record.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }

    public void Switch_role(ActionEvent e) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Stage window =(Stage) switch_role.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }

    public void exit(ActionEvent e) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("Exit.fxml"));
        Stage window =(Stage) exit.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }
}
