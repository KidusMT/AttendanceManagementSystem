package com.miu.edu.cs.mpp.project.AttendanceManagementSystem.ui.captureattendance;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.ResourceBundle;

import com.miu.edu.cs.mpp.project.AttendanceManagementSystem.SystemInfo;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import com.miu.edu.cs.mpp.project.AttendanceManagementSystem.ui.captureattendance.MyDataModel;
import com.miu.edu.cs.mpp.project.AttendanceManagementSystem.ui.captureattendance.MyDataModel.Session;


public class AttendanceCapture extends Application implements Initializable{
	
	
	
	private Text actionStatus;
	
	
	public void start(Stage stage) throws IOException {
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/CaptureAttendance.fxml"));

        var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        var scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
	
	@FXML
	public TableView<MyDataModel> myTableView;

	@FXML
	public TableColumn<MyDataModel, String> firstName;
	@FXML
	public TableColumn<MyDataModel, String> lastName;
	@FXML
	public TableColumn<MyDataModel, String> session;
	@FXML
	public TableColumn<MyDataModel, String> Date;
	@FXML
	public TableColumn<MyDataModel, CheckBox> checkBox1;
	
	public TableColumn<MyDataModel, CheckBox> checkBox2;

	HashMap<String,MyDataModel>  readAttendaceSheet;
	HashMap<String, submitModel>  saveAttendanceSheet;
    submitModel submitModel;

	private ObservableList<MyDataModel> getItemsToAdd(){
		ObservableList<MyDataModel> dataModel = FXCollections.observableArrayList(
	new MyDataModel("Bruke", "yyy" , LocalDate.now() ),
				new MyDataModel("Kidus", "Bdd",   LocalDate.now() ),
			new MyDataModel("henok", "Bdd", LocalDate.now()));
	// this method would fetch the neessary items from database.
			
			return dataModel;
	}
	
	
	public void initialize(URL location, ResourceBundle resources) {
		
		
		firstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
		lastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
		
		Date.setCellValueFactory(new PropertyValueFactory<>("Date"));
		checkBox1
			.setCellValueFactory(new PropertyValueFactory<>("checkBox1"));
		
		checkBox2
		.setCellValueFactory(new PropertyValueFactory<>("checkBox2"));

		
		}
	
@FXML
	public  void generateListOfAttendance(ActionEvent event)
	{
		//TableView.getItems().add("c");
		//tableView.getItems().add("d");
		
	myTableView.setItems(getItemsToAdd());
	};
	
	
	public submitModel mapModel(MyDataModel dataModel) //maps model of data from table to data to be submitted 
	{
		
		boolean submitModelCheckBox1;
		boolean submitModelCheckBox2;
		if(dataModel.getCheckBox1().isSelected())
		{
			submitModelCheckBox1=true;
			
		}
		
		else
		{
			submitModelCheckBox1=false;
			
		}
		
		if(dataModel.getCheckBox2().isSelected())
		{
			submitModelCheckBox2=true;
			
		}
		
		else
		{
			submitModelCheckBox2=false;
			
		}
		
		 submitModel sm= new submitModel(dataModel.getFirstName(), dataModel.getLastName(),	dataModel.getDate(), submitModelCheckBox1, submitModelCheckBox2);
		
		 return sm;
		
		
	}
	@FXML
	public  void submitAttendance(ActionEvent event)
	{
		//TableView.getItems().add("c");
		//tableView.getItems().add("d");
		//List <List<String>> arrList=new ArrayList<>();
		 HashMap<String, submitModel> map = new HashMap<>();
		
		for(int i=0; i<myTableView.getItems().size(); i++)
		{
			submitModel=mapModel(myTableView.getItems().get(i));
			System.out.print(submitModel.toString());		
			map.put(submitModel.getFirstName(), submitModel);
		}
		
	};

    public static void main(String[] args) {
        launch();
    }
}
