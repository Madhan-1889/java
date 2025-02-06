/**
 * 
 */
package com.wipro.java.java8;

/**
 * 
 */
interface TestInterface1{
	default void show() {
		System.out.println("Default Interface1");
	}
}

interface TestInterface2{
	default void show() {
		System.out.println("Default Interface2");
	}
}

public class DefaultUseCase implements TestInterface1,TestInterface2 {

	public void show() {
		//use super keyword to call the show function of particular interface
		TestInterface1.super.show();
		TestInterface2.super.show();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultUseCase d = new DefaultUseCase();
		d.show();
	}

}
