package com.ramya.assignment1.employeees;

import com.ramya.assignment1.utilities.EmployeeUtilities;

public class Assignmentmain {

    public static void main(String[] args) {
        // Create instances of Manager and Developer
        Manager manager = new Manager("ramya", 1, 100000, "");
        Developer developer = new Developer("sowmi", 2, 80000, "Java");

        // Use EmployeeUtilities methods
        EmployeeUtilities.printEmployeeDetails(manager);
        EmployeeUtilities.printEmployeeDetails(developer);

        Employee[] employees = {manager, developer};
        double totalSalary = EmployeeUtilities.calculateTotalSalary(employees);
        System.out.println("Total Salary: " + totalSalary);
    }
}



