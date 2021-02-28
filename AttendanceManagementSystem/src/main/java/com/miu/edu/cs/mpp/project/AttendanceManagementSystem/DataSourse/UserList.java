package com.miu.edu.cs.mpp.project.AttendanceManagementSystem.DataSourse;

public enum UserList {
	ACCOUNT1("john","pass123");
	
   public final String username;
	public final String password;
	
	UserList(String username, String password){
		this.username=username;
		this.password=password;
	}
}
