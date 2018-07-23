/**
 * 
 */
package com.calculator.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.calculator.demo.Calculator;

/**
 * @author Amit Kale
 */
public class MultiplyTest
{

		/**
		 * Test method for {@link com.calculator.demo.Calculator#add(int, int)}.
		 */
		@Test
		public void testMultiply()
		{
				Calculator calculator = new Calculator();
				assertEquals(6, calculator.multiply(3, 2));
		}

}
