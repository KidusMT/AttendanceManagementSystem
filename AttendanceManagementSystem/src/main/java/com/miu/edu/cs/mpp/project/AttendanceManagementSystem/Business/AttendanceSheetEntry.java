package com.miu.edu.cs.mpp.project.AttendanceManagementSystem.Business;

public class AttendanceSheetEntry {
private boolean morning_AM;
private boolean afternoon_PM;
private Student student;
private DayAttendanceSheet attendanceSheet;

public AttendanceSheetEntry(boolean morning_AM, boolean afternoon_PM,Student student, DayAttendanceSheet dayAttendanceSheet) {
	super();
	this.morning_AM = morning_AM;
	this.afternoon_PM = afternoon_PM;
	this.student=student;
	this.attendanceSheet=dayAttendanceSheet;
}



public boolean isMorning_AM() {
	return morning_AM;
}



public void setMorning_AM(boolean morning_AM) {
	this.morning_AM = morning_AM;
}



public boolean isAfternoon_PM() {
	return afternoon_PM;
}



public void setAfternoon_PM(boolean afternoon_PM) {
	this.afternoon_PM = afternoon_PM;
}



public DayAttendanceSheet getAttendanceSheet() {
	return attendanceSheet;
}



public void setStudent(Student student) {
	this.student = student;
}



public void setAttendanceSheet(DayAttendanceSheet entry) {
	this.attendanceSheet=entry;
}

public Student getStudent() {
	return student;
}


@Override
public String toString() {
	return "AttendanceSheetEntry [morning=" + (isMorning_AM()? "present": "absent") + ", afternoon=" + (isAfternoon_PM() ? "present": "") + ", student=" + student +  "]";
}



}
