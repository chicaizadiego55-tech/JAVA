package com.krakedev;

public class TestPlato {

    public static void main(String[] args) {

        Plato platoA = new Plato();
        Plato platoB = new Plato();
        Plato platoC = new Plato();

        System.out.println("=== VALORES POR DEFECTO ===");

        System.out.println(platoA.getNombre());
        System.out.println(platoA.getTipo());
        System.out.println(platoA.getPrecio());
        System.out.println(platoA.isDisponible());

        platoA.setNombre("Ceviche");
        platoA.setTipo("Entrada");
        platoA.setPrecio(6.50f);
        platoA.setDisponible(true);

        platoB.setNombre("Lomo Saltado");
        platoB.setTipo("Plato fuerte");
        platoB.setPrecio(10.75f);
        platoB.setDisponible(true);

        platoC.setNombre("Cheesecake");
        platoC.setTipo("Postre");
        platoC.setPrecio(4.25f);
        platoC.setDisponible(false);

        System.out.println("\n=== VALORES MODIFICADOS ===");

        System.out.println(platoA.getNombre());
        System.out.println(platoA.getTipo());
        System.out.println(platoA.getPrecio());
        System.out.println(platoA.isDisponible());

        System.out.println();

        System.out.println(platoB.getNombre());
        System.out.println(platoB.getTipo());
        System.out.println(platoB.getPrecio());
        System.out.println(platoB.isDisponible());

        System.out.println();

        System.out.println(platoC.getNombre());
        System.out.println(platoC.getTipo());
        System.out.println(platoC.getPrecio());
        System.out.println(platoC.isDisponible());

    }

}
