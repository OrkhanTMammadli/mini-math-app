package com.ltc.minimathapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3), "2 + 3 must equal 5");
    }



//    @Test
//    public void testFailScenario() {
//        Calculator calculator = new Calculator();
//         assertEquals(6, calculator.add(2, 3), "This test is designed to fail");
//    }
}