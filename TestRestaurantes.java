package com.krakedev;

public class TestRestaurante {

    public static void main(String[] args) {

        Restaurante rest1 = new Restaurante();
        Restaurante rest2 = new Restaurante();

        System.out.println("=== VALORES POR DEFECTO ===");

        System.out.println(rest1.getNombre());
        System.out.println(rest1.getDireccion());
        System.out.println(rest1.getCalificacion());

        System.out.println();

        System.out.println(rest2.getNombre());
        System.out.println(rest2.getDireccion());
        System.out.println(rest2.getCalificacion());

        rest1.setNombre("La Casona");
        rest1.setDireccion("Av. Amazonas");
        rest1.setCalificacion(4.8f);

        rest2.setNombre("El Buen Sabor");
        rest2.setDireccion("Pifo");
        rest2.setCalificacion(4.5f);

        System.out.println("\n=== VALORES MODIFICADOS ===");

        System.out.println(rest1.getNombre());
        System.out.println(rest1.getDireccion());
        System.out.println(rest1.getCalificacion());

        System.out.println();

        System.out.println(rest2.getNombre());
        System.out.println(rest2.getDireccion());
        System.out.println(rest2.getCalificacion());

    }

}