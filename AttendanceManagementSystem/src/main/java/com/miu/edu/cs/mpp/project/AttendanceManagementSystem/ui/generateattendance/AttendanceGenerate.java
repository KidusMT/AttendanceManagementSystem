package com.miu.edu.cs.mpp.project.AttendanceManagementSystem.ui.generateattendance;

import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

import com.miu.edu.cs.mpp.project.AttendanceManagementSystem.SystemInfo;
import com.miu.edu.cs.mpp.project.AttendanceManagementSystem.Business.AttendanceSheetEntry;
import com.miu.edu.cs.mpp.project.AttendanceManagementSystem.Business.DataAccess;
import com.miu.edu.cs.mpp.project.AttendanceManagementSystem.Business.DayAttendanceSheet;
import com.miu.edu.cs.mpp.project.AttendanceManagementSystem.Business.MockData;
import com.miu.edu.cs.mpp.project.AttendanceManagementSystem.Business.Report.ReportType;
import com.miu.edu.cs.mpp.project.AttendanceManagementSystem.Business.Student;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class AttendanceGenerate extends Application {
	private ObservableList<GenerateTableData> data = FXCollections.observableArrayList();
	
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
  	public DatePicker fromDateField;
  	
  	@FXML
    public DatePicker toDateField;
  	
  	@FXML
  	public TableView<GenerateTableData> tableHView;
  	
  	@FXML
  	public TableColumn<GenerateTableData, String> firstName;
  	
    @FXML
    public TableColumn<GenerateTableData, String> lastName;
      
    @FXML
    public TableColumn<GenerateTableData, String> days;
    
    public void initialize(){
    	firstName.setCellValueFactory(new PropertyValueFactory<GenerateTableData, String>("firstName"));
    	lastName.setCellValueFactory(new PropertyValueFactory<GenerateTableData, String>("lastName"));
    	days.setCellValueFactory(new PropertyValueFactory<GenerateTableData, String>("days"));
    }
	
	@FXML
	public void findRecord(ActionEvent event) {    	 
    	 // starts by clearing old data
    	 data.clear();
    	 List<DayAttendanceSheet> attendanceList = DataAccess.fetchAttendanceSheet(ReportType.DAILY);
    	 List<Student> students = MockData.getStudents();
    	 for(int k=0; k<students.size(); k++) {
    		 GenerateTableData tableData = new GenerateTableData();
    		 tableData.setFirstName(students.get(k).getFirstName());
    		 tableData.setLastName(students.get(k).getLastName());
    		 tableData.setDays(String.valueOf(calculateDaysOfPresence(attendanceList, students.get(k))));
    		 data.add(tableData);
    	 }    	 
    	 
    	 TableViewLoad(data);
	}
	
	private void TableViewLoad(ObservableList<GenerateTableData> ticketData) {
		tableHView.setItems(getTicketData());
    }
	
	public ObservableList<GenerateTableData> getTicketData() {
        return data;
    }

     
     @FXML
     public void fetchThisWeekAttendance(ActionEvent event) 
     {
    	 LocalDate startDate = LocalDate.now().minusWeeks(1);
    	 LocalDate endDdate = LocalDate.now();
    	 System.out.println(startDate.toString() +" <> "+ endDdate.toString());
    	 fromDateField.setValue(startDate);
    	 toDateField.setValue(endDdate);
    	 
    	 // starts by clearing old data
    	 data.clear();
    	 List<DayAttendanceSheet> attendanceList = DataAccess.fetchAttendanceSheet(ReportType.WEEKLY);
    	 List<Student> students = MockData.getStudents();
    	 for(int k=0; k<students.size(); k++) {
    		 GenerateTableData tableData = new GenerateTableData();
    		 tableData.setFirstName(students.get(k).getFirstName());
    		 tableData.setLastName(students.get(k).getLastName());
    		 tableData.setDays(String.valueOf(calculateDaysOfPresence(attendanceList, students.get(k))));
    		 data.add(tableData);
    	 }    	 
    	 
    	 TableViewLoad(data);
     };
     
     public double calculateDaysOfPresence(List<DayAttendanceSheet> attendanceList, Student student) {
    	 double days = 0;
    	 for(int i = 0; i < attendanceList.size(); i++) {
    		 for(int j=0; j< attendanceList.get(i).getAttendanceEntries().size(); j++) {
    			 AttendanceSheetEntry currentAttendance = attendanceList.get(i).getAttendanceEntries().get(j);
    			
    			 if(student.getId().equals(currentAttendance.getStudent().getId())) {
    				 // if am and pm == 1 day
    				 // is am or pm == 0.5 day
    				 // if neither am nor pm == 0	    				 
    				 if(currentAttendance.isAfternoon_PM() && currentAttendance.isMorning_AM()) {
    				   days++;
    				 } else if(currentAttendance.isMorning_AM() || currentAttendance.isAfternoon_PM()) {
    					 days += 0.5;
    				 }
    			 }	    				 
    		 }    		 
		 }
    	 
    	 return days;
     }
     
     @FXML
     public void fetchThisMonthAttendance(ActionEvent event) 
     {
    	 LocalDate startDate = LocalDate.now().minusMonths(1);
    	 LocalDate endDdate = LocalDate.now();
    	 System.out.println(startDate.toString() +" <> "+ endDdate.toString());
    	 fromDateField.setValue(startDate);
    	 toDateField.setValue(endDdate);
    	 
    	 // starts by clearing old data
    	 data.clear();
    	 List<DayAttendanceSheet> attendanceList = DataAccess.fetchAttendanceSheet(ReportType.MONTHLY);
    	 List<Student> students = MockData.getStudents();
    	 for(int k=0; k<students.size(); k++) {
    		 GenerateTableData tableData = new GenerateTableData();
    		 tableData.setFirstName(students.get(k).getFirstName());
    		 tableData.setLastName(students.get(k).getLastName());
    		 tableData.setDays(String.valueOf(calculateDaysOfPresence(attendanceList, students.get(k))));
    		 data.add(tableData);
    	 }    	 
    	 
    	 TableViewLoad(data);
     };
}
