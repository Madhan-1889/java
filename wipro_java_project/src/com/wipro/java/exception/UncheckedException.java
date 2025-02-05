/**
 * 
 */
package com.wipro.java.exception;
/**
 * 
 */
public class UncheckedException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = null; 
	     try {  
	         int length = str.length(); // Attempting to call a method on a null reference  
	         System.out.println("Length of the string: " + length);  
	     }
	     catch (NullPointerException e) {  
	         System.out.println("String cannot be null");  
	    
	     }  
	     int[] numbers = {1, 2, 3, 4, 5}; 
	     try {  
	         int index = 5; 
	         int value = numbers[index]; // Attempting to access an element at an invalid index  
	         System.out.println("Value at index " + index + " is " + value);  
	     } 
	     catch (ArrayIndexOutOfBoundsException e) {  
	         System.out.println("Index is out of bounds");  
	     }  

	}

}
