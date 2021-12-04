package com.driver.main;
import com.department.sup.SuperClass;
import com.department.adm.*;
import com.department.hr.*;
import com.department.tech.TechDepartment;
public class Main {

	public static void main(String[] args) {
		
	//About Super Department
		SuperClass display = new SuperClass();
		display.departmentName();
		display.getTodaysWork  ();
		display.getWorkDeadline();
		display.isTodayAHoliday();
		
	//About Admin Department
		AdminDepartment display1 = new AdminDepartment();
		display1.departmentName();
		display1.getTodaysWork  ();
		display1.getWorkDeadline();
		display1.isTodayAHoliday();
			
	//About HR Department
		HrDepartment display2 = new HrDepartment();
		display2.departmentName();
		display2.getTodaysWork  ();
		display2.getWorkDeadline();
		display2.doActivity();
		display2.isTodayAHoliday();

	//About Tech Department
		TechDepartment display3 = new TechDepartment();
		display3.departmentName();
		display3.getTodaysWork  ();
		display3.getWorkDeadline();
		display3.getTechStackInformation ();
		display3.isTodayAHoliday();
	}

}
