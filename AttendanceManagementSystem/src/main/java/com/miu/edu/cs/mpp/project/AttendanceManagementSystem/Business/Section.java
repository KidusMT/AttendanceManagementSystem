package com.miu.edu.cs.mpp.project.AttendanceManagementSystem.Business;

import java.util.ArrayList;
import java.util.List;

public class Section {
	private String semester;
	private Room room;
	private Course course;
	private Instructor instructor;
	List<DayAttendanceSheet> attendances;
	private List<Student> students;
	
	
	public Section(String semester, Instructor instructor, Room room, Course course, Student firstStudent, DayAttendanceSheet firstAttendanceSheet) {
		super();
		this.semester = semester;
		
		// 1 to 1 single direction relationships
		this.room=room;
		this.course=course;
		this.instructor=instructor;
		
		//1 to 1..* with day attendance sheet, by directional
		attendances=new ArrayList<DayAttendanceSheet>();
		firstAttendanceSheet.setOwnerSection(this);
		attendances.add(firstAttendanceSheet);
		
		//1 to 1..* with student, by directional
		students=new ArrayList<Student>();
		firstStudent.setInrolledSection(this);
		students.add(firstStudent);
	}
	
	
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}


	public Room getRoom() {
		return room;
	}


	public Course getCourse() {
		return course;
	}


	public Instructor getInstructor() {
		return instructor;
	}


	public List<DayAttendanceSheet> getAttendances() {
		return attendances;
	}


	public void addAttendance(DayAttendanceSheet attendance) {
		attendance.setOwnerSection(this);
		attendances.add(attendance);
	}


	public List<Student> getStudents() {
		return students;
	}


	public void addStudent(Student student) {
		student.setInrolledSection(this);
		students.add(student);
	}
	
	
	

}
