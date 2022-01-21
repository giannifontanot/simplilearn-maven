package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
Calculator calculator;
    @org.junit.Before
    public void setUp() throws Exception {
         calculator = new Calculator();
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void add() {
        assertEquals("Addition", calculator.add(2,2),4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExceptionIsThrown(){

    }

    @org.junit.Test
    public void subtract() {
    }

    @org.junit.Test
    public void multiply() {
    }

    @org.junit.Test
    public void divide() {
    }
}