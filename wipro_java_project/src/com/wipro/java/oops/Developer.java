/**
 * 
 */
package com.wipro.java.oops;

/** parent class = Employee
 *  child class = Developer
 *  Keyword = extends
 */
public class Developer extends Employee{

	/**
	 * 
	 */
    public static void main(String a[]) {
		
    	//Employee is parent class
    	//Developer is instance of child class
    	Employee emp= new Developer();
    	emp.setEmpId(201);
    	emp.setName("Bob");
    	emp.setAge(24);
    	emp.setSalary(23000);
    	System.out.println(emp.getEmpId());
    	System.out.println(emp.getName());
    	System.out.println(emp.getAge());
    	System.out.println(emp.getSalary());
	}

}
