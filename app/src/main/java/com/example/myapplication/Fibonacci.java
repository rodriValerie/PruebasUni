package com.example.myapplication;

public class Fibonacci{

    int valor=0;
    public int Fibonacci(int valor){
        if ((valor == 0) || (valor == 1)) {
            return valor;
        }else{
            return Fibonacci(valor-1)+Fibonacci(valor-2);
        }
    }
}