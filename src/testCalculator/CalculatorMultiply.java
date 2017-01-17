package testCalculator;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Calculator;

public class CalculatorMultiply extends Calculator {
	@Test
	public void testMultiplyWithPositiveNumbers() {
		Assert.assertEquals( getMultiply (15, 5), 75);

	}

	@Test
	public void testMultiplyWithNegativeNumbers() {
		Assert.assertEquals(getMultiply (-15, -5), 75);

	}

	@Test
	public void testMultiplyWithPositiveAndNegativeNumbers() {
		Assert.assertEquals( getMultiply (15, -5), -75);
	}

	@Test
	public void testMultiplyWithNegativeAndPositiveNumbers() {
		Assert.assertEquals( getMultiply (-15, 5), -75);
	}
	
	@Test
	public void testMultiplyWithZeroAndPositiveNumber(){
		Assert.assertEquals( getMultiply (0, 15), 0);
		
	}
	
	@Test
	public void testMultiplyWithZeroAndNegativeNumber(){
		Assert.assertEquals( getMultiply (0, -15), -0);
	}
	@Test
	public void testMultiplyWithPositiveNumberAndZero(){
		Assert.assertEquals( getMultiply (15, 0), 0);
		
	}

	@Test
	public void testMultiplyWithNegativeNumberandZero(){
		Assert.assertEquals( getMultiply (-15, 0), -0);
	}

}
