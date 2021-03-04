package com.miu.edu.cs.mpp.project.AttendanceManagementSystem.ui.generateattendance;

import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

import com.miu.edu.cs.mpp.project.AttendanceManagementSystem.SystemInfo;
import com.miu.edu.cs.mpp.project.AttendanceManagementSystem.Business.DataAccess;
import com.miu.edu.cs.mpp.project.AttendanceManagementSystem.Business.DayAttendanceSheet;
import com.miu.edu.cs.mpp.project.AttendanceManagementSystem.Business.GenerateTableData;
import com.miu.edu.cs.mpp.project.AttendanceManagementSystem.Business.MockData;
import com.miu.edu.cs.mpp.project.AttendanceManagementSystem.Business.Report.ReportType;
import com.miu.edu.cs.mpp.project.AttendanceManagementSystem.Business.Student;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class AttendanceGenerate extends Application {
	private ObservableList<GenerateTableData> data;
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
    	firstName.setCellValueFactory(new PropertyValueFactory<GenerateTableData, String>("firstName"));
        lastName.setCellValueFactory(new PropertyValueFactory<GenerateTableData, String>("lastName"));
        days.setCellValueFactory(new PropertyValueFactory<GenerateTableData, String>("days"));
    }
    
    @FXML
	public DatePicker fromDateField;
	
	@FXML
    public DatePicker toDateField;
	
	@FXML
	private TableView<GenerateTableData> table;
	
	@FXML
    private TableColumn<GenerateTableData, String> firstName;
	
    @FXML
    private TableColumn<GenerateTableData, String> lastName;
    
    @FXML
    private TableColumn<GenerateTableData, String> days;
	
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
    	 
    	 List<DayAttendanceSheet> attendanceList = DataAccess.fetchAttendanceSheet(ReportType.WEEKLY);
    	 String firstName = "", lastName = "", daysOfPresence = "";
//    	 attendanceList.stream()
//    	 .filter(null)
    	 List<Student> students = MockData.getStudents();
    	 for(int k=0; k<students.size(); k++) {
    		 int days = 0;
    		 firstName = students.get(k).getFirstName();
    		 lastName = students.get(k).getLastName();
    		 for(int i = 0; i < attendanceList.size(); i++) {
	    		 for(int j=0; j< attendanceList.get(i).getAttendanceEntries().size(); j++) {
	    			 if(students.get(k).getId().equals(attendanceList.get(i).getAttendanceEntries().get(j).getStudent().getId()))
	    				 days++;
	    		 }    		 
    		 }
    		 daysOfPresence = String.valueOf(days);
    		 TableColumn firstNameCol = new TableColumn("First Name");
    		 
    	 }    	 
    	 
    	 
//    	 table.setItems(data);
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
