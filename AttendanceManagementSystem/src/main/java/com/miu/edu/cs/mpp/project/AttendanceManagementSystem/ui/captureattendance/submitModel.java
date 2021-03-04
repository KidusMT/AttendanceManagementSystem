package com.miu.edu.cs.mpp.project.AttendanceManagementSystem.ui.captureattendance;

import java.time.LocalDate;

import javafx.scene.control.CheckBox;

/**
 * @author Bruke Abebe
 *
 */

public class submitModel {

		
		private String firstName ;
		private String lastName ;
		//public  enum  Session {AM, PM};
		private LocalDate Date;
        private boolean sessionPM;
        private boolean sessionAM;
		//private Session sessionPM;
		//private Session sessionAM;
		
	
	/*
		public MyDataModel(String firstName2, String lastName2, String session2, Object date2, ToggleButton toggleButton) {
			// TODO Auto-generated constructor stub
		}

	*/
		public String getFirstName() {
			return firstName;
		}





		public boolean isSessionPM() {
			return sessionPM;
		}





		public void setSessionPM(boolean sessionPM) {
			this.sessionPM = sessionPM;
		}





		public boolean isSessionAM() {
			return sessionAM;
		}





		public void setSessionAM(boolean sessionAM) {
			this.sessionAM = sessionAM;
		}





		public submitModel(String firstName, String lastName, LocalDate date, boolean sessionPM, boolean sessionAM)
		{
			
			this.firstName = firstName;
			this.lastName = lastName;
			Date = date;
			this.sessionPM = sessionPM;
			this.sessionAM = sessionAM;
		}



		@Override
		public String toString() {
			return "submitModel [firstName=" + firstName + ", lastName=" + lastName + ", Date=" + Date + ", sessionPM="
					+ sessionPM + ", sessionAM=" + sessionAM + "]";
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


