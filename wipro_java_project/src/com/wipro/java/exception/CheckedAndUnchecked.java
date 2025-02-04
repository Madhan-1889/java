/**
 * 
 */
package com.wipro.java.exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 */
public class CheckedAndUnchecked {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void readFile(String filePath) throws IOException{
		
        File file = new File(filePath);
	    FileReader freader = new FileReader(file); // If file path is wrong may throw IOException
	    System.out.println("File opened successfully.");
	    freader.close();
    }    
	
	public static void calculate(int num1,int num2) {
		int ans=num1/num2;
		System.out.println(ans);
	}

	public static void main(String[] args) {
	    try {
	        readFile("D:\\HandsOn\\java\\wipro_java_project\\src\\com\\wipro\\java\\exception\\empty.txt"); // This file does not exist
	    } 
	    catch (IOException e) {
	        System.out.println("Checked Exception");
	    }
	    try {
	        calculate(10,0);
	    } 
	    catch (ArithmeticException e) {
	        System.out.println("Unchecked Exception");
	    }
	}

}
