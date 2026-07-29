package com.krakedev;

public class TestPlato {

    public static void main(String[] args) {

        Plato platoA = new Plato("Ceviche", "Entrada", 6.50f, true);
        Plato platoB = new Plato("Lomo Saltado", "Plato fuerte", 10.75f, true);
        Plato platoC = new Plato("Cheesecake", "Postre", 4.25f, false);

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
