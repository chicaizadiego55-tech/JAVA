package com.krakedev;

public class TestRectangulo {

    public static void main(String[] args) {

        Rectangulo rect = new Rectangulo();

        System.out.println("Valores por defecto");
        System.out.println(rect.getBase());
        System.out.println(rect.getAltura());

        rect.setBase(4);
        rect.setAltura(2);

        System.out.println("\nValores modificados");
        System.out.println("Base: " + rect.getBase());
        System.out.println("Altura: " + rect.getAltura());
        System.out.println("Perímetro: " + rect.calcularPerimetro());

    }

}
