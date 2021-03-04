package com.miu.edu.cs.mpp.project.AttendanceManagementSystem.Business;

import java.util.List;

public interface Report {
	
	enum ReportType {
		DAILY, WEEKLY, MONTHLY
	}

	public List<DayAttendanceSheet> generateReport();
}
