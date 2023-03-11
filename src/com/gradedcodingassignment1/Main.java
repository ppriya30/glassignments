package com.gradedcodingassignment1;

public class Main {

	public static void main(String[] args) {
        AdminDepartment adminDepartment = new AdminDepartment();
		
		System.out.println("Welcome to"+adminDepartment.departmentName());
		System.out.println(adminDepartment.getTodaysWork());
		System.out.println(adminDepartment.getWorkDeadline());
		System.out.println(adminDepartment.isTodayAHoliday());
		System.out.println();
		
		
		
		HrDepartment hrDepartment = new HrDepartment();
		
		System.out.println("Welcome to"+hrDepartment.departmentName());
		System.out.println(hrDepartment.doActivity());
		System.out.println(hrDepartment.getTodaysWork());
		System.out.println(hrDepartment.getWorkDeadline());
		System.out.println(hrDepartment.isTodayAHoliday());
		System.out.println();
		
		
		Techdepartment techdepartment = new Techdepartment();
		
		System.out.println("Welcome to"+techdepartment.departmentName());
		System.out.println(techdepartment.getTodaysWork());
		System.out.println(techdepartment.getWorkDeadline());
		System.out.println(techdepartment.getTechStackInformation());
		System.out.println(techdepartment.isTodayAHoliday());
		
	}

}
