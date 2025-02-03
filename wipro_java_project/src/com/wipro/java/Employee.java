/**
 * 
 */
package com.wipro.java;

/**
 * POJO - Plain Old Java Object
 */
public class Employee {

	private int empId;//Employee Id
	private String name;// Employee's Name
	private String age; //Employee's Age
	private int salary; //Employee's Salary
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Employee(){
		// TODO Auto-generated constructor stub	
	}

}
