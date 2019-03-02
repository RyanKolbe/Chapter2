package com.ryankolbe.ADP372S.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTestSetUp {

    private Calculator calculator = new Calculator();

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void add() {
        int result = calculator.add(3, 4);
        Assert.assertEquals(7, result);
    }
}