package com.ramya.assignment1.employeees;

public class Manager extends Employee {
	private String department;
	
	
	public Manager(String name,int employeeid,double salary,String department) {
		super(name,employeeid,salary);
		this.department=department;
	}


	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}


	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	
	

}
