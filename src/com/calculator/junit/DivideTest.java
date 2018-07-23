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
public class DivideTest
{

		/**
		 * Test method for {@link com.calculator.demo.Calculator#add(int, int)}.
		 */
		@Test
		public void testDivide()
		{
				Calculator calculator = new Calculator();
				assertEquals(2, (int)calculator.divide(4, 2));
		}

}
