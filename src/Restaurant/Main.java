package Restaurant;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Proveedor proveedor1 = new Proveedor("Distribuidora Norte", 5551234, "Av Central 101");

        Mercancia mercancia1 = new Mercancia("Carne", 20, LocalDate.of(2026,3,1),
                10);

        Pedido pedido1 = new Pedido(30, LocalDate.of(2026,3,5), mercancia1);

        System.out.println("Restaurant.Mercancia inicial:");
        System.out.println(mercancia1);

        pedido1.setProveedor(proveedor1);

        System.out.println("\nRestaurant.Pedido realizado:");
        System.out.println(pedido1);

        pedido1.registrarLlegada(30, LocalDate.of(2026,3,7));

        System.out.println("\nRestaurant.Mercancia después de llegada del pedido:");
        System.out.println(mercancia1);

        System.out.println("\nRestaurant.Proveedor:");
        System.out.println(proveedor1);
    }
}