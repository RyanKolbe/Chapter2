package com.ryankolbe.ADP372S.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTestsetUp {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void add() {
        int result = calculator.add(3,4);
        Assert.assertEquals(7,result);
    }
}