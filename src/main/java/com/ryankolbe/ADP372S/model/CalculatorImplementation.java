package com.ryankolbe.ADP372S.model;

public class CalculatorImplementation implements CalculatorInterface{

    @Override
    public int add(int a, int b) {
        return (Integer.parseInt(String.valueOf(a)) + Integer.parseInt(String.valueOf(b)));
    }
}
