package com.miu.edu.cs.mpp.project.AttendanceManagementSystem.Business;

public class Room {
	private String roomNumber;
	private String building;
	private short floor;
	
	
	
	public Room(String roomNumber, String building, short floor) {
		super();
		this.roomNumber = roomNumber;
		this.building = building;
		this.floor = floor;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public short getFloor() {
		return floor;
	}
	public void setFloor(short floor) {
		this.floor = floor;
	}
	

}
