package com.miu.edu.cs.mpp.project.AttendanceManagementSystem.Business;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DayAttendanceSheet {
private LocalDate date;
private String semester;
private Section ownerSection;
private Course course;
private Instructor instructor;
private List<AttendanceSheetEntry> attendanceEntries;


public DayAttendanceSheet(LocalDate date, String semester, AttendanceSheetEntry firstAttendanceEntry) {
	super();
	this.date = date;
	this.semester = semester;
	
	attendanceEntries=new ArrayList<AttendanceSheetEntry>(); //1 to 1..*
	firstAttendanceEntry.setAttendanceSheet(this);
	attendanceEntries.add(firstAttendanceEntry);
}
public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}
public String getSemester() {
	return semester;
}
public void setSemester(String semester) {
	this.semester = semester;
}
public Section getOwnerSection() {
	return ownerSection;
}
public void setOwnerSection(Section ownerSection) {
	this.ownerSection = ownerSection;
}
public Course getCourse() {
	return course;
}
public void setCourse(Course course) {
	this.course = course;
}
public Instructor getInstructor() {
	return instructor;
}
public void setInstructor(Instructor instructor) {
	this.instructor = instructor;
}
public List<AttendanceSheetEntry> getAttendanceEntries() {
	return attendanceEntries;
}


}
