/**
 * 
 */
package com.wipro.java.collection;

/**
 * 
 */
public class ArraySimple {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[5]; //initializing array
		
		arr[0]=1; //Initialize values in index 0 
		arr[1]=2; //Initialize values in index 1 
		arr[2]=3; //Initialize values in index 2 
		arr[3]=4; //Initialize values in index 3 
		arr[4]=5; //Initialize values in index 4 
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Array Index of "+i+": "+arr[i]);
		}

	}

}
