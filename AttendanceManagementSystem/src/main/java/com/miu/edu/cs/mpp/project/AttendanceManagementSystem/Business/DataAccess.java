package com.miu.edu.cs.mpp.project.AttendanceManagementSystem.Business;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.miu.edu.cs.mpp.project.AttendanceManagementSystem.Business.Report.ReportType;

public class DataAccess {

	public static List<DayAttendanceSheet> fetchAttendanceSheet(ReportType repType) {
		LocalDate startDate = null;
   	 	LocalDate endDdate = null;
		switch(repType) {
		case DAILY:// is going to be a little bit different. Need another argument to fetch with the selection date
			break;
		case WEEKLY:
			startDate = LocalDate.now().minusWeeks(1);
	   	 	endDdate = LocalDate.now();
			break;
		case MONTHLY:
			startDate = LocalDate.now().minusMonths(1);
	   	 	endDdate = LocalDate.now();
			break;
		}
		
		return MockData.getDayAttendanceSheets(startDate, endDdate);
	}
}
