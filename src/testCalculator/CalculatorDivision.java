package testCalculator;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Calculator;


	public class CalculatorDivision extends Calculator {
		@Test
		public void testDivisionWithPositiveNumbers() {
			Assert.assertEquals( getDivision (15, 5), 3);

		}

		@Test
		public void testDivisionWithNegativeNumbers() {
			Assert.assertEquals(getDivision(-15, -5), 3);

		}

		@Test
		public void testDivisionWithPositiveAndNegativeNumbers() {
			Assert.assertEquals( getDivision (15, -5), -3);
		}

		@Test
		public void testDivisionWithNegativeAndPositiveNumbers() {
			Assert.assertEquals( getDivision (-15, 5), -3);
		}
		
		@Test
		public void testDivisionWithZeroAndPositiveNumber(){
			Assert.assertEquals( getDivision (1, 15), 0);
			
		}
		
		@Test
		public void testDivisionWithZeroAndNegativeNumber(){
			Assert.assertEquals( getDivision (1, -15), 0);
		}
		@Test
		public void testDivisionWithPositiveNumberAndZero(){
			Assert.assertEquals( getDivision (15, 1), 15 );
			
		}

		@Test
		public void testDivisionWithNegativeNumberandZero(){
			Assert.assertEquals( getDivision (-15, 1), -15);
		}

}
