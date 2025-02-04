/**
 * 
 */
package com.wipro.java.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * 
 */
public class CheckedException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {  
            File file = new File("empty.txt");  //the file used here is not exit
            FileReader freader = new FileReader(file);  
            System.out.println(freader);
        } catch (FileNotFoundException e) {  
            System.out.println("File not found");  //exception handled here
        }  

	}

}
