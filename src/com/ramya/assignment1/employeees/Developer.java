package com.ramya.assignment1.employeees;

public class Developer extends Employee {
	private String programminglanguage;
	
	public Developer(String name,int employeeid,double salary,String programminglanguage) {
		super(name,employeeid,salary);
		this.programminglanguage=programminglanguage;
		

	}

	/**
	 * @return the programminglanguage
	 */
	public String getProgramminglanguage() {
		return programminglanguage;
	}

	/**
	 * @param programminglanguage the programminglanguage to set
	 */
	public void setProgramminglanguage(String programminglanguage) {
		this.programminglanguage = programminglanguage;
	}

}
