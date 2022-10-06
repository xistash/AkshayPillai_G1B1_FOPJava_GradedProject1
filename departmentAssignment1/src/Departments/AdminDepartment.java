package Departments;

public class AdminDepartment extends SuperDepartment {

	public String departmentName() {
		return "Admin Department";
	}

	public String getTodaysWork() {
		return "Complete your documents Submission";
	}

	public String getWorkDeadlin() {
		return "Complete by EOD";
	}

}
