package com.miu.edu.cs.mpp.project.AttendanceManagementSystem.ui.captureattendance;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import com.miu.edu.cs.mpp.project.AttendanceManagementSystem.ui.captureattendance.MyDataModel;


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
	public TableColumn<MyDataModel, String> Present;

	


	private ObservableList<MyDataModel> getItemsToAdd(){
		ObservableList<MyDataModel> dataModel = FXCollections.observableArrayList(
	new MyDataModel("Bruke", "yyy" ,"bbb",   null, true),
				new MyDataModel("Kidus", "Bdd","fff" ,null  , true),
			new MyDataModel("henok", "Bdd","C", null , true));
	// this method would fetch the necessary items from database.
			
			return dataModel;
	}
	
	
	public void initialize(URL location, ResourceBundle resources) {
		
		
		firstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
		lastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
		session.setCellValueFactory(new PropertyValueFactory<>("session"));
		Date.setCellValueFactory(new PropertyValueFactory<>("Date"));
		Present.setCellValueFactory(new PropertyValueFactory<>("Present"));

		
		}
	
	

@FXML
	public  void generateListOfAttendance(ActionEvent event)
	{
		//TableView.getItems().add("c");
		//tableView.getItems().add("d");
		
	myTableView.setItems(getItemsToAdd());
	};

    public static void main(String[] args) {
        launch();
    }
}
