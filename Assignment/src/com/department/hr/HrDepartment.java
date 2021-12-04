package com.department.hr;

import com.department.sup.SuperClass;

public class HrDepartment extends SuperClass {
		
	public String departmentName () {
			String department = null;
			System.out.println("Welcome to HR Department");
					return department;
		}

	public String getTodaysWork () {
			String todaysWork = null;
			System.out.println("1. Fill today’s timesheet and mark your attendance");
					return todaysWork;
		}
	public String getWorkDeadline () {
			String workDeadline = null;
			System.out.println("2. Complete by EOD ");
					return workDeadline ;
		}
	public String doActivity () {
			String activity = null;
			System.out.println("3. Team Lunch");
					return activity ;
		}

}
