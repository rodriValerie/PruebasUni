package com.example.myapplication;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class FactorialTest{
    private Factorial calculate;

    @Before
    public void setUp(){
        calculate = new Factorial();
    }

    @Test
    public void OperationNotNull(){
        assertNotNull(calculate);
    }

    @Test
    public void TestFactorialZero(){
        int result = calculate.Factorial(0);
        assertEquals(1,result);
    }

    @Test
    public void TestFactorialFive(){
        int result = calculate.Factorial(5);
        assertEquals(120,result);
    }

}