package com.krakedev;

public class TestRestaurantes {

    public static void main(String[] args) {

        Restaurante rest1 = new Restaurante();
        Restaurante rest2 = new Restaurante();

       
        System.out.println("=== VALORES POR DEFECTO ===");

        System.out.println("Restaurante 1");
        System.out.println("Nombre: " + rest1.nombre);
        System.out.println("Dirección: " + rest1.direccion);
        System.out.println("Calificación: " + rest1.calificacion);

        System.out.println();

        System.out.println("Restaurante 2");
        System.out.println("Nombre: " + rest2.nombre);
        System.out.println("Dirección: " + rest2.direccion);
        System.out.println("Calificación: " + rest2.calificacion);

        // Modificar atributos

        rest1.nombre = "La Casona";
        rest1.direccion = "Av. Amazonas, Quito";
        rest1.calificacion = 4.8f;

        rest2.nombre = "El Buen Sabor";
        rest2.direccion = "Pifo, Quito";
        rest2.calificacion = 4.5f;

        System.out.println("\n=== VALORES MODIFICADOS ===");

        System.out.println("Restaurante 1");
        System.out.println("Nombre: " + rest1.nombre);
        System.out.println("Dirección: " + rest1.direccion);
        System.out.println("Calificación: " + rest1.calificacion);

        System.out.println();

        System.out.println("Restaurante 2");
        System.out.println("Nombre: " + rest2.nombre);
        System.out.println("Dirección: " + rest2.direccion);
        System.out.println("Calificación: " + rest2.calificacion);

    }

}
