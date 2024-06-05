/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.math;

import static org.junit.Assert.*;

import org.junit.*;

public class CalculatorTest {

    //business object(s) under test - a "fixture"
    private Calculator calc;

    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("beforeclass");
    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("afterclass");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("setup");
        calc = new Calculator();
    }

    @After
    public void cleanUP() throws Exception {
        System.out.println("cleanup");

    }

    @Test
    public void testAdd() {
        System.out.println("testAdd");
        assertEquals(5, calc.add(1, 4));  // expected, actual
    }


    @Test
    public void testDivide(){
        System.out.println("testDivide");
        assertEquals(2.5, calc.divide(5, 2),.001);
    }

    @Test
    public void testIsEven(){
        System.out.println("testIsEven");
        assertTrue(calc.isEven(10));
    }
}