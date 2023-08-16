package com.example.myapplication;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FibonacciTest{
    private Fibonacci calculate;

    @Before
    public void setUp(){
        calculate = new Fibonacci();
    }

    @Test
    public void TestFibonacci(){
        int result = calculate.Fibonacci(17);
        assertEquals(1597,result);
    }
    @Test
    public void TestFibonacciNum(){
        int result = calculate.Fibonacci(24);
        assertEquals(46368,result);
    }
    @Test
    public void TestFibonacciZero(){
        int result = calculate.Fibonacci(0);
        assertEquals(0,result);
    }
    @Test
    public void TestFibonacciOne(){
        int result = calculate.Fibonacci(1);
        assertEquals(1,result);
    }
}