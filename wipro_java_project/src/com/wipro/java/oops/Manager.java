/**
 * 
 */
package com.wipro.java.oops;

/**parent class = Employee
 *  child class = Manager
 *  Keyword = extends
 */
public class Manager extends Employee{

	public static void main(String a[]) {
		
		//Employee is parent class
    	//Manager is instance of child class
		Employee emp= new Manager();
    	emp.setEmpId(12);
    	emp.setName("Ram");
    	emp.setAge(32);
    	emp.setSalary(30000);
    	System.out.println(emp.getEmpId());
    	System.out.println(emp.getName());
    	System.out.println(emp.getAge());
    	System.out.println(emp.getSalary());
	}
}
