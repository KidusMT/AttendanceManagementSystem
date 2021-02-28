package com.miu.edu.cs.mpp.project.AttendanceManagementSystem.Business;

public class Student {
     private String id;
     private String firstName;
     private String lastName;
     private Section inrolledSection;
     
     
     
	public Student(String id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	public Section getInrolledSection() {
		return inrolledSection;
	}


	public void setInrolledSection(Section inrolledSection) {
		this.inrolledSection = inrolledSection;
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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


	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}


	
     
     
}
