package com.miu.edu.cs.mpp.project.AttendanceManagementSystem.Business;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.miu.edu.cs.mpp.project.AttendanceManagementSystem.Business.AttendanceSheetEntry.SessionType;

public class MockData {

	public static List<DayAttendanceSheet> getDayAttendanceSheets(LocalDate startDate, LocalDate endDate) {
		List<DayAttendanceSheet> attendanceSheets = new ArrayList<>();
		// constructor information
		// LocalDate date, String semester, AttendanceSheetEntry firstAttendanceEntry
		DayAttendanceSheet das = new DayAttendanceSheet(LocalDate.parse("2019-03-29"), "1ST_CS_SEMISTER");
		// constructor information for AttendanceSheetEntry
		// boolean status, Student student, DayAttendanceSheet dayAttendanceSheeta
		ArrayList<AttendanceSheetEntry> entries = new ArrayList<>();
		// constructor information for Student model
		// String id, String firstName, String lastName

		entries.add(new AttendanceSheetEntry(SessionType.NONE, new Student("612301", "Kebede", "Matewos"), das));
		entries.add(new AttendanceSheetEntry(SessionType.NONE, new Student("612302", "Temam", "Matewos"), das));
		entries.add(new AttendanceSheetEntry(SessionType.NONE, new Student("612303", "Daniel", "Matewos"), das));
		entries.add(new AttendanceSheetEntry(SessionType.NONE, new Student("612304", "Kebron", "Matewos"), das));
		entries.add(new AttendanceSheetEntry(SessionType.NONE, new Student("612305", "Dereje", "Matewos"), das));
		entries.add(new AttendanceSheetEntry(SessionType.NONE, new Student("612306", "Efrem", "Matewos"), das));
		entries.add(new AttendanceSheetEntry(SessionType.NONE, new Student("612307", "Henok", "Matewos"), das));
		entries.add(new AttendanceSheetEntry(SessionType.NONE, new Student("612308", "Kaleb", "Matewos"), das));
		entries.add(new AttendanceSheetEntry(SessionType.NONE, new Student("612309", "Mamo", "Matewos"), das));
		entries.add(new AttendanceSheetEntry(SessionType.NONE, new Student("612310", "Galilio", "Matewos"), das));
		entries.add(new AttendanceSheetEntry(SessionType.NONE, new Student("612311", "Socratus", "Matewos"), das));
		entries.add(new AttendanceSheetEntry(SessionType.NONE, new Student("612312", "Barak", "Obama"), das));
		entries.add(new AttendanceSheetEntry(SessionType.NONE, new Student("612313", "Bereket", "Matewos"), das));
		entries.add(new AttendanceSheetEntry(SessionType.NONE, new Student("612314", "Anteneh", "Matewos"), das));
		entries.add(new AttendanceSheetEntry(SessionType.NONE, new Student("612315", "Solomon", "Matewos"), das));
		entries.add(new AttendanceSheetEntry(SessionType.NONE, new Student("612316", "Teddy", "Matewos"), das));
		entries.add(new AttendanceSheetEntry(SessionType.NONE, new Student("612317", "Kasa", "Matewos"), das));
		das.getAttendanceEntries().addAll(entries);
		
		return attendanceSheets;
	}
	
	public static List<Student> getStudents(){
		List<Student> attendanceSheets = new ArrayList<>();
		attendanceSheets.add(new Student("612301", "Kebede", "Matewos"));
		attendanceSheets.add(new Student("612302", "Temam", "Matewos"));
		attendanceSheets.add(new Student("612303", "Daniel", "Matewos"));
		attendanceSheets.add(new Student("612304", "Kebron", "Matewos"));
		attendanceSheets.add(new Student("612305", "Dereje", "Matewos"));
		attendanceSheets.add(new Student("612306", "Efrem", "Matewos"));
		attendanceSheets.add(new Student("612307", "Henok", "Matewos"));
		attendanceSheets.add(new Student("612308", "Kaleb", "Matewos"));
		attendanceSheets.add(new Student("612309", "Mamo", "Matewos"));
		attendanceSheets.add(new Student("612310", "Galilio", "Matewos"));
		attendanceSheets.add(new Student("612311", "Socratus", "Matewos"));
		attendanceSheets.add(new Student("612312", "Barak", "Obama"));
		attendanceSheets.add(new Student("612313", "Bereket", "Matewos"));
		attendanceSheets.add(new Student("612314", "Anteneh", "Matewos"));
		attendanceSheets.add(new Student("612315", "Solomon", "Matewos"));
		attendanceSheets.add(new Student("612316", "Teddy", "Matewos"));
		attendanceSheets.add(new Student("612317", "Kasa", "Matewos"));
		return attendanceSheets;
	}
}
