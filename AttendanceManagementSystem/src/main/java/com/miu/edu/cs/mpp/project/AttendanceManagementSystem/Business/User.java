package com.miu.edu.cs.mpp.project.AttendanceManagementSystem.Business;

public class User {
  private String userName;
  private String password;
  private Instructor accountOwner;
  // modify on class diagram
  
  
public User(String userName, String password, Instructor owner) {
	this.userName = userName;
	this.password = password;//hash password on th
	accountOwner=owner;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
//getter for password may have security problem
//use hashing for password
public void setPassword(String password) {
	this.password = password;
}

public Instructor getAccountOwner() {
	return accountOwner;
}
@Override
public String toString() {
	return "User [userName=" + userName + ", password=" + password +  "]";
}


}
