package com.miu.edu.cs.mpp.project.AttendanceManagementSystem.ui.welcome;

import java.io.IOException;

import com.miu.edu.cs.mpp.project.AttendanceManagementSystem.SystemInfo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Welcome extends Application {
	
	public Welcome() {
	}

	
	public void start(Stage stage) throws IOException {
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Welcome.fxml"));

        var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        var scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
    
    @FXML
    public void markAttendance(ActionEvent event) 
    {
   	 	System.out.println("markAttendance");
	   	Parent attendanceGenerateRoot;
	    try {
	    	attendanceGenerateRoot = FXMLLoader.load(getClass().getResource("/fxml/captureAttendance.fxml"));
	        Stage stage = new Stage();
	        stage.setTitle("My New Stage Title");
	        stage.setScene(new Scene(attendanceGenerateRoot));
	        stage.show();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
    };

    
    @FXML
    public void generateReprot(ActionEvent event) 
    {
      	System.out.println("generateReprot");
      	Parent generateReportRoot;
	    try {
	    	generateReportRoot = FXMLLoader.load(getClass().getResource("/fxml/AttendanceGenerate.fxml"));
	        Stage stage = new Stage();
	        stage.setTitle("My New Stage Title");
	        stage.setScene(new Scene(generateReportRoot));
	        stage.show();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
    };
}
