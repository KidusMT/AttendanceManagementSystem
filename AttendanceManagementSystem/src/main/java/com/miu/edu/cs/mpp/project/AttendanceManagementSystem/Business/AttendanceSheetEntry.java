package com.miu.edu.cs.mpp.project.AttendanceManagementSystem.Business;

public class AttendanceSheetEntry {
private SessionType session = SessionType.NONE;
private Student student;
private DayAttendanceSheet attendanceSheet;

enum SessionType {
	PM, AM, NONE
}


public AttendanceSheetEntry(SessionType session,Student student, DayAttendanceSheet dayAttendanceSheet) {
	super();
	this.session = session;
	this.student=student;
	this.attendanceSheet=dayAttendanceSheet;
}


public SessionType getSession() {
	return session;
}
public void setSession(SessionType status) {
	this.session = status;
}

public void setAttendanceSheet(DayAttendanceSheet entry) {
	this.attendanceSheet=entry;
}

public Student getStudent() {
	return student;
}


@Override
public String toString() {
	return "AttendanceSheetEntry [status=" + session + ", student=" + student +  "]";
}



}
