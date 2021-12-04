package com.department.adm;

import com.department.sup.SuperClass;

public class AdminDepartment extends SuperClass {
	
	public String departmentName () {
		String department = null;
		System.out.println("Welcome to Admin Department ");
				return department;
	}

	public String getTodaysWork () {
		String todaysWork = null ;
		System.out.println ("1. Complete your documents Submission");
				return todaysWork;
	}
	public String getWorkDeadline () {
		String workDeadline = null;
		System.out.println("2. Complete by EOD ");
				return workDeadline ;
	}
	
}
