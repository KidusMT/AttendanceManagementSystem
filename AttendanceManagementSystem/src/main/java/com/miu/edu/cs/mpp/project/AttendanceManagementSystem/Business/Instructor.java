package com.miu.edu.cs.mpp.project.AttendanceManagementSystem.Business;

public class Instructor {

	private String id;
	private String firstName;
	private String lastName;
	private User user;
	
	
	public Instructor(String id, String firstName, String lastName, String username, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		user=new User(username, password, this);// one to one composition
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
		return "Instructor [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
