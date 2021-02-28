package com.miu.edu.cs.mpp.project.AttendanceManagementSystem.Business;

public class AttendanceSheetEntry {
private boolean status;
private Student student;
private DayAttendanceSheet attendanceSheet;




public AttendanceSheetEntry(boolean status, Student student, DayAttendanceSheet dayAttendanceSheet) {
	super();
	this.status = status;
	this.student=student;
	this.attendanceSheet=dayAttendanceSheet;
}


public boolean getStatus() {
	return status;
}
public void setStatus(boolean status) {
	this.status = status;
}

public void setAttendanceSheet(DayAttendanceSheet entry) {
	this.attendanceSheet=entry;
}


@Override
public String toString() {
	return "AttendanceSheetEntry [status=" + status + ", student=" + student +  "]";
}



}
