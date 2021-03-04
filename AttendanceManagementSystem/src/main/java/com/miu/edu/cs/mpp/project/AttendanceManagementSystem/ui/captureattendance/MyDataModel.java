package com.miu.edu.cs.mpp.project.AttendanceManagementSystem.ui.captureattendance;

import java.time.LocalDate;

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ToggleButton;

/**
 * @author Bruke Abebe
 *
 */
public class MyDataModel {


	private String firstName ;
	private String lastName ;
	public  enum  Session {AM, PM};
	private LocalDate Date;
	private CheckBox checkBox1;
	//private Session sessionPM;
	//private Session sessionAM;
	private CheckBox checkBox2;

	public MyDataModel(String firstName, String lastName, LocalDate date) {
		
		this.firstName = firstName;
		this.lastName = lastName;
	    
		this.Date = date;
		this.checkBox1 = new CheckBox("Left");
		this.checkBox2 = new CheckBox("Left");
	}

/*
	public MyDataModel(String firstName2, String lastName2, String session2, Object date2, ToggleButton toggleButton) {
		// TODO Auto-generated constructor stub
	}

*/
	public String getFirstName() {
		return firstName;
	}

	public CheckBox getCheckBox1() {
		return checkBox1;
	}

	public void setCheckBox1(CheckBox checkBox1) {
		this.checkBox1 = checkBox1;
	}

	public CheckBox getCheckBox2() {
		return checkBox2;
	}

	public void setCheckBox2(CheckBox checkBox2) {
		this.checkBox2 = checkBox2;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDate() {
		return Date;
	}


	public void setDate(LocalDate date) {
		this.Date = date;
	}

/*
	public Boolean getPresent() {
		return present;
	}


	public void setPresent(Boolean present) {
		this.present = present;
	}
	*/
	

	
}
