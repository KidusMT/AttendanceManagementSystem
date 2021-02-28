package com.miu.edu.cs.mpp.project.AttendanceManagementSystem.ui.login;

import com.miu.edu.cs.mpp.project.AttendanceManagementSystem.SystemInfo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Login extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		Parent root = FXMLLoader.load(getClass().getResource("/fxml/Login.fxml"));
	    
        Scene scene = new Scene(root);
    
        primaryStage.setTitle("FXML Welcome");
        primaryStage.setScene(scene);
        primaryStage.show();
        
       
	}
	
	public static void main(String[] args) {
        launch();
    }

}
