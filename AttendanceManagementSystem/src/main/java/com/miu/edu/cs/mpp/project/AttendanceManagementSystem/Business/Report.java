package com.miu.edu.cs.mpp.project.AttendanceManagementSystem.Business;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Report {
private LocalDate from;
private LocalDate to;
List<DayAttendanceSheet> attendances;



public Report(LocalDate from, LocalDate to) {
	super();
	this.from = from;
	this.to = to;
	attendances= new ArrayList<DayAttendanceSheet>();// 0..* unidirectional
}
public LocalDate getFrom() {
	return from;
}
public void setFrom(LocalDate from) {
	this.from = from;
}
public LocalDate getTo() {
	return to;
}
public void setTo(LocalDate to) {
	this.to = to;
}

public void addAttendace(DayAttendanceSheet attendance) { // 0..* unidirectional
	attendances.add(attendance);
}
@Override
public String toString() {
	return "Report [from=" + from + ", to=" + to + "]";
}

}
