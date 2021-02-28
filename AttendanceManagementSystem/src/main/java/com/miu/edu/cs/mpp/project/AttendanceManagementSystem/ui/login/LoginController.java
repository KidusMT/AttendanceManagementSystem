package com.miu.edu.cs.mpp.project.AttendanceManagementSystem.ui.login;




import com.miu.edu.cs.mpp.project.AttendanceManagementSystem.Business.Instructor;
import com.miu.edu.cs.mpp.project.AttendanceManagementSystem.DataSourse.InstructorList;

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
         }else {
        	 System.out.println(" login unsuccessful...");
        	 // toDo: implement error message on login page
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
