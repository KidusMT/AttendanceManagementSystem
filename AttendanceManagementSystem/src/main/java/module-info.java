module com.miu.edu.cs.mpp.project.AttendanceManagementSystem {
    requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	requires javafx.base;

    exports com.miu.edu.cs.mpp.project.AttendanceManagementSystem;
    exports com.miu.edu.cs.mpp.project.AttendanceManagementSystem.ui.captureattendance;
    exports com.miu.edu.cs.mpp.project.AttendanceManagementSystem.ui.generateattendance;
    exports com.miu.edu.cs.mpp.project.AttendanceManagementSystem.ui.welcome;
    exports com.miu.edu.cs.mpp.project.AttendanceManagementSystem.ui.login;
//    exports com.miu.edu.cs.mpp.project.AttendanceManagementSystem.Business.GenerateTableData;
//    opens com.miu.edu.cs.mpp.project.AttendanceManagementSystem.Business.GenerateTableData to javafx.graphics;
}