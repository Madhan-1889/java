/**
 * 
 */
package com.wipro.java.interfaces;

/**
 * 
 */
public class InterfaceExample implements Review, Show{

	/**
	 * @param args
	 */
	//interface methods get implemented here
	public void show() {
		System.out.println("Show method gets implemented");
	}
	
	public void review() {
		System.out.println("Review method gets implemented");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceExample obj = new InterfaceExample();
		obj.show();
		obj.review();

	}

}
