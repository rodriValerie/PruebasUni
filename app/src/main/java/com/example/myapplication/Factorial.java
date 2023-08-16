package com.example.myapplication;
public class Factorial{
    int result = 0;
    public int Factorial(int num) {
        if (num == 0) {
            return 1;
        }else {
            return num*Factorial(num-1);
        }
    }
}