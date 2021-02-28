package com.miu.edu.cs.mpp.project.AttendanceManagementSystem.DataSourse;



public enum InstructorList {
	
	INSTRUCTOR1("4536","John","Amanual",UserList.ACCOUNT1);
	
	public final String id;
	public final String firstName;
	public final String lastName;
	public final UserList Account;
	
	InstructorList(String id, String firstName, String lastName, UserList Account) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.Account=Account;
	}
	

}
