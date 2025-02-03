/**
 * 
 */
package com.wipro.java.oops.inheritance;

/**parent class = Employee
 *  child class = ProjectLead
 *  Keyword = extends 
 */
public class ProjectLead extends Employee{

	/**
	 * 
	 */
    public static void main(String a[]) {
		
    	//Employee is parent class
    	//ProjectLead is instance of child class
    	Employee emp= new ProjectLead();
    	emp.setEmpId(101);
    	emp.setName("Alpha");
    	emp.setAge(28);
    	emp.setSalary(25000);
    	System.out.println(emp.getEmpId());
    	System.out.println(emp.getName());
    	System.out.println(emp.getAge());
    	System.out.println(emp.getSalary());
	}

}
