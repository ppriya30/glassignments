package com.gradedcodingassignment1;

public class AdminDepartment extends SuperDepartment {
	public String departmentName() {
		return " Admin Department  ";
	}
	public String getTodaysWork() {
		return " Complete your documents Submission";
	}
	public String getWorkDeadline() {
		return " Complete by EOD ";
	}
	
	public static void main(String[] args) {
		AdminDepartment admindep = new AdminDepartment();
		admindep.departmentName();
		admindep.getTodaysWork();
		admindep.getWorkDeadline();
		

	}

}
