package testCalculator;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Calculator;

public class CalculatorSubtruct extends Calculator   {
	//Calculator cal;
	
	// public class CalculatorSubtruct  extend calculator .
	
	@Test
	public void testSubWithPositiveNumbers() {
		Assert.assertEquals(getSubtract(50, 30), 20);

	}
	@Test
	public void testSubWithNegtiveNumbers(){
		Assert.assertEquals(getSubtract(-50, -30), -20);
	}
	@Test
	public void testSubWithPositiveAndNegativeNumbers() {
		Assert.assertEquals(getSubtract(50, -30), 80);
	}

	@Test
	public void testSubWithNegativeAndPositiveNumbers() {
		Assert.assertEquals(getSubtract(-50, 30), -80);
	}
	
	@Test
	public void testSubWithZeroAndPositiveNumber(){
		Assert.assertEquals(getSubtract(0, 20), -20);
		
	}
	
	@Test
	public void testSubWithZeroAndNegativeNumber(){
		Assert.assertEquals(getSubtract(0, -20), 20);
	}
	@Test
	public void testSubWithPositiveNumberAndZero(){
		Assert.assertEquals(getSubtract(30, 0), 30);
		
	}

	@Test
	public void testSubWithNegativeNumberandZero(){
		Assert.assertEquals(getSubtract(-30, 0), -30);
	}
	
}
