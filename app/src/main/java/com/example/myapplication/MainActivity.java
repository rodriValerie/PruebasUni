package com.example.myapplication;

public class MainActivity{
    int rvResultado=0;
    public int sumar(int primerNumero, int segundoNumero){
        rvResultado=primerNumero+segundoNumero;
        return rvResultado;
    }
    public int restar(int primerNumero, int segundoNumero){
        rvResultado=primerNumero-segundoNumero;
        return rvResultado;
    }
    public int multiplicar(int primerNumero, int segundoNumero){
        rvResultado=primerNumero*segundoNumero;
        return rvResultado;
    }
    public int dividir(int primerNumero, int segundoNumero){
        rvResultado=primerNumero/segundoNumero;
        return rvResultado;
    }
}