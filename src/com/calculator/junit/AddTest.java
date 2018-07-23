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
public class AddTest
{

		/**
		 * Test method for {@link com.calculator.demo.Calculator#add(int, int)}.
		 */
		@Test
		public void testAdd()
		{
				Calculator calculator = new Calculator();
				assertEquals(5, calculator.add(3, 2));
		}

}
