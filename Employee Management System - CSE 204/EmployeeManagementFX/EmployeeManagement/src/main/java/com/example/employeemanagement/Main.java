package com.example.employeemanagement;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lib.Company;
import lib.DataHandler;

import java.io.IOException;

public class Main extends Application {
    static Company myCom = null;

    @Override
    public void start(Stage stage) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Login_Option");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args)
    {
        System.out.println("Login_Option");
        myCom = DataHandler.loadData();
        launch(args);
    }
}
