package com.wipro.java.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest 
{
	private final Calculator calculator = new Calculator();
	
	@Test
	public void textAdd()
	{
		int result = calculator.add(10, 20);
		assertEquals(50, result);
	}
	
	@Test
	public void textSubtract()
	{
		int result = calculator.add(30,10);
		assertEquals(20, result);
	}
	
	@Test
	public void textAddWithNegativeNumbers()
	{
		int result = calculator.add(-10, -20);
		assertEquals(-50, result);
	}
	
	@Test
	public void textSubstractWithNegativeNumbers()
	{
		int result = calculator.add(-10, -20);
		assertEquals(10, result);
	}
	
}