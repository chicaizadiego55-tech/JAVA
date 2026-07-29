package com.krakedev;

public class TestCalculadora {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        double producto = calc.multiplicar(10, 5);
        System.out.println("Multiplicación: " + producto);
        
        double cociente = calc.dividir(10, 2);
        System.out.println("División: " + cociente);
        
        double promedio = calc.promediar(10, 8, 9);
        System.out.println("Promedio: " + promedio);
        
        calc.mostrarResultado();

    }

}