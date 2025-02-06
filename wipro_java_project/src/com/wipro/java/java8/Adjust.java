/**
 * 
 */
package com.wipro.java.java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * 
 */
public class Adjust {

	/**
	 * Function to check date and time
	 */
	public static void checkingAdjusters() {
		LocalDate date= LocalDate.now();
		System.out.println("The current date is "+date);
		
		//Getting first day of next month
		LocalDate dayofNextMonth = date.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("FirstDayOfNextMonth:"+dayofNextMonth);
		
		//Getting the next Saturday
		LocalDate nextSaturday= date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println("nextSaturday:"+nextSaturday);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkingAdjusters();

	}

}
