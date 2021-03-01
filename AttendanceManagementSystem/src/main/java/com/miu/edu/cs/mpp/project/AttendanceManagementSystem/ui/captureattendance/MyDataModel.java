package com.miu.edu.cs.mpp.project.AttendanceManagementSystem.ui.captureattendance;

import java.time.LocalDate;

import javafx.beans.property.SimpleStringProperty;

public class MyDataModel {

	
	private String firstName ;
	private String lastName ;
	private  String session;
	private LocalDate Date;
	private Boolean present;


	public MyDataModel(String firstName, String lastName, String session, LocalDate date, Boolean present) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.session = session;
		this.Date = date;
		this.present = present;
	}


	


	




	public String getFirstName() {
		return firstName;
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


	public String getSession() {
		return session;
	}


	public void setSession(String session) {
		this.session = session;
	}


	public LocalDate getDate() {
		return Date;
	}


	public void setDate(LocalDate date) {
		this.Date = date;
	}


	public Boolean getPresent() {
		return present;
	}


	public void setPresent(Boolean present) {
		this.present = present;
	}
	
	

	
}
