package com.miu.edu.cs.mpp.project.AttendanceManagementSystem.ui.generateattendance;

import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;

import com.miu.edu.cs.mpp.project.AttendanceManagementSystem.SystemInfo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class AttendanceGenerate extends Application {

	public AttendanceGenerate() {
		
	}
	
	public void start(Stage stage) throws IOException {
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/AttendanceGenerate.fxml"));

        var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        var scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
    
    @FXML
    public void initialize() {
//    	fromDateField;
    }
    
    @FXML
	public DatePicker fromDateField;
	
	@FXML
    public DatePicker toDateField;
	
	@FXML
	public void findRecord(ActionEvent event) {
		
	}
     
     @FXML
     public void fetchThisWeekAttendance(ActionEvent event) 
     {
    	 LocalDate startDate = LocalDate.now().minusWeeks(1);
    	 LocalDate endDdate = LocalDate.now();
    	 System.out.println(startDate.toString() +" <> "+ endDdate.toString());
    	 fromDateField.setValue(startDate);
    	 toDateField.setValue(endDdate);
     };
     
     @FXML
     public void fetchThisMonthAttendance(ActionEvent event) 
     {
    	 LocalDate startDate = LocalDate.now().minusMonths(1);
    	 LocalDate endDdate = LocalDate.now();
    	 System.out.println(startDate.toString() +" <> "+ endDdate.toString());
    	 fromDateField.setValue(startDate);
    	 toDateField.setValue(endDdate);
     };
}
