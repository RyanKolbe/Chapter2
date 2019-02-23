package com.ryankolbe.ADP372S.model;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorImplementationTest {

    @Test
    public void add() {
        CalculatorInterface calculatorInterface = new CalculatorImplementation();
        int result = calculatorInterface.add(4, 5);
        Assert.assertEquals(9, result);
    }

    @Test
    public void testFile() {
        //precondition;
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigClass.class);
        CalculatorInterface calculatorInterface = (CalculatorInterface)applicationContext.getBean("typical");

        //actual test;
        int result = calculatorInterface.add(3,1);
        Assert.assertEquals(4,result);
    }
}