package com.miu.edu.cs.mpp.project.AttendanceManagementSystem.ui.login;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginController {
	
	public LoginController() {
		
	}
	
	 public void initialize() {
		 
	 }

	@FXML
	public TextField usernameField;
	
	@FXML
    public TextField passwordField;
	
	@FXML
	public Button loginBtn;
     
     @FXML
     public void printOutput(ActionEvent event) 
     {
    	 String name = usernameField.getText();
         String password = passwordField.getText();
    	 System.out.println(name +" "+ password);
     };
}
