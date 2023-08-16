package com.example.myapplication;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class MainActivityTest {

    private MainActivity calculate;

    @Before
    public void setUp(){
        calculate = new MainActivity();
    }

    @Test
    public void TestOperationSuma(){
        int result = calculate.sumar(7,9);
        assertEquals(16,result);
    }
    @Test
    public void TestOperationResta(){
        int result = calculate.restar(17,4);
        assertEquals(13,result);
    }
    @Test
    public void TestOperationMulti(){
        int result = calculate.multiplicar(10,3);
        assertEquals(30,result);
    }

}