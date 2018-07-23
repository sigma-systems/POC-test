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
public class SubstractTest
{

		/**
		 * Test method for {@link com.calculator.demo.Calculator#add(int, int)}.
		 */
		@Test
		public void testSubstract()
		{
				Calculator calculator = new Calculator();
				assertEquals(1, calculator.substract(3, 2));
		}

}
