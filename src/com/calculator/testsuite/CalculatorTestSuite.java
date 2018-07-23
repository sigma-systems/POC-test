package com.calculator.testsuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.calculator.junit.AddTest;
import com.calculator.junit.DivideTest;
import com.calculator.junit.MultiplyTest;
import com.calculator.junit.SubstractTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({
   AddTest.class,
   SubstractTest.class,
   MultiplyTest.class,
   DivideTest.class
})

public class CalculatorTestSuite {

}

