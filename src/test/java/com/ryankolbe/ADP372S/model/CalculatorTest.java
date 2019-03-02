package com.ryankolbe.ADP372S.model;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void add() {
        Calculator calc = new Calculator();
        int result = calc.add(10, 20);
        Assert.assertEquals("Add int a + int b", 30, result);
    }

}