package com.miu.edu.cs.mpp.project.AttendanceManagementSystem.ui.login;




import java.io.IOException;

import com.miu.edu.cs.mpp.project.AttendanceManagementSystem.Business.Instructor;
import com.miu.edu.cs.mpp.project.AttendanceManagementSystem.DataSourse.InstructorList;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

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
	public Label btnIncorrectPass;
     
     @FXML
     public void loginbuttonControler(ActionEvent event) 
     {
    	 String username = usernameField.getText().trim();
         String password = passwordField.getText().trim();
         //validation on input validation to be done... like emptiness
         if(authenticate(username,password)) {
        	 InstructorList instructorData=InstructorList.INSTRUCTOR1;
    		 //login successful
    		 // create instructor object and open home page with this object
    		 // pass this object as parameter
    		 Instructor instructor =new Instructor(instructorData.id,instructorData.firstName,instructorData.lastName
    				 , instructorData.Account.username,instructorData.Account.password);
    		 //replace stage with home page scene and pass instructor object to home page control
    		 System.out.println(" login successful, "+instructor.toString());
    		 Parent generateReportRoot;
    		    try {
    		    	generateReportRoot = FXMLLoader.load(getClass().getResource("/fxml/Welcome.fxml"));
    		        Stage stage = new Stage();
    		        stage.setTitle("My New Stage Title");
    		        stage.setScene(new Scene(generateReportRoot));
    		        stage.show();
    		    } catch (IOException e) {
    		        e.printStackTrace();
    		    }
    		    ((Node) event.getSource()).getScene().getWindow().hide();
    		 btnIncorrectPass.setText("");
         }else {
               btnIncorrectPass.setText("Login Unsuccessful");
         }
         
    	
     };
     
     
     private boolean authenticate(String username, String password ) {
    	 //there is no database so there is no query, just compare with static instructor
    	InstructorList instructorData=InstructorList.INSTRUCTOR1;
    	 if ((username.equals(instructorData.Account.username))&&(password.equals(instructorData.Account.password))) {
			return true;
		}
    	 return false;
     }
}
