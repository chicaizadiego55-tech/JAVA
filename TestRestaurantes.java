package com.krakedev;

public class TestRestaurante {

    public static void main(String[] args) {

        Restaurante rest1 = new Restaurante(
                "La Casona",
                "Av. Amazonas",
                4.8f);

        Restaurante rest2 = new Restaurante(
                "El Buen Sabor",
                "Pifo",
                4.5f);

        System.out.println("Restaurante 1");
        System.out.println(rest1.getNombre());
        System.out.println(rest1.getDireccion());
        System.out.println(rest1.getCalificacion());

        System.out.println();

        System.out.println("Restaurante 2");
        System.out.println(rest2.getNombre());
        System.out.println(rest2.getDireccion());
        System.out.println(rest2.getCalificacion());
    }
}