/**
 * 
 */
package com.wipro.java.exception;

/**
 * 
 */
public class ArithmeticExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;  
        int num2 = 0;  
        int result = num2/num1; 
        System.out.println("Result: " + result);  
        //If we on go any exception it will be handle by try and catch block
        try {  
            int result2 = num1 / num2; //a number divisible by zero is not possible so we have to write this code inside try block
            System.out.println("Result: " + result2);  
        } 
        catch (ArithmeticException e) {  
            System.out.println("Division by zero is not allowed");  
        }
        //finally is a block which will get run whether exception occur or not
        finally {
        	System.out.println("Code completed successfully");
        }
        System.out.println("End");

	}

}
