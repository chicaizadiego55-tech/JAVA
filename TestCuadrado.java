package com.krakedev;

public class TestCuadrado {

    public static void main(String[] args) {

        Cuadrado c1 = new Cuadrado();
        Cuadrado c2 = new Cuadrado();
        Cuadrado c3 = new Cuadrado();

        System.out.println("Valores por defecto");
        System.out.println(c1.getLado());

        c1.setLado(3);
        c2.setLado(5);
        c3.setLado(8);

        System.out.println("\nCUADRADO 1");
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