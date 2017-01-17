package testCalculator;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Calculator;

public class CalculatorAddition extends Calculator {
	@Test
	public void testSumWithPositiveNumbers() {
		Assert.assertEquals(getSum(20, 30), 50);

	}

	@Test
	public void testSumWithNegativeNumbers() {
		Assert.assertEquals(getSum(-20, -30), -50);

	}

	@Test
	public void testSumWithPositiveAndNegativeNumbers() {
		Assert.assertEquals(getSum(20, -30), -10);
	}

	@Test
	public void testSumWithNegativeAndPositiveNumbers() {
		Assert.assertEquals(getSum(-20, 30), 10);
	}
	
	@Test
	public void testSumWithZeroAndPositiveNumber(){
		Assert.assertEquals(getSum(0, 20), 20);
		
	}
	
	@Test
	public void testSumWithZeroAndNegativeNumber(){
		Assert.assertEquals(getSum(0, -20), -20);
	}
	@Test
	public void testSumWithPositiveNumberAndZero(){
		Assert.assertEquals(getSum(30, 0), 30);
		
	}

	@Test
	public void testSumWithNegativeNumberandZero(){
		Assert.assertEquals(getSum(-30, 0), -30);
	}
}
