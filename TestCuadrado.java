package com.krakedev;

public class TestCuadrado {

    public static void main(String[] args) {

        Cuadrado c1 = new Cuadrado(3);
        Cuadrado c2 = new Cuadrado(5);
        Cuadrado c3 = new Cuadrado(8);

        System.out.println("CUADRADO 1");
        System.out.println("Lado: " + c1.getLado());
        System.out.println("Área: " + c1.calcularArea());
        System.out.println("Perímetro: " + c1.calcularPerimetro());

        System.out.println();

        System.out.println("CUADRADO 2");
        System.out.println("Lado: " + c2.getLado());
        System.out.println("Área: " + c2.calcularArea());
        System.out.println("Perímetro: " + c2.calcularPerimetro());

        System.out.println();

        System.out.println("CUADRADO 3");
        System.out.println("Lado: " + c3.getLado());
        System.out.println("Área: " + c3.calcularArea());
        System.out.println("Perímetro: " + c3.calcularPerimetro());
    }
}