package Restaurant;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {

        Proveedor proveedor1 = new Proveedor("Distribuidora Norte", 5551234, "Av Central 101");

        Mercancia mercancia1 = new Mercancia("Carne", 10, LocalDate.of(2026,3,1),
                10);

        Pedido pedido1 = new Pedido(30, LocalDate.of(2026,3,5), mercancia1);

        System.out.println("Mercancia inicial:");
        System.out.println(mercancia1);

        System.out.println("Proveedor:");
        System.out.println(proveedor1);

        boolean b = mercancia1.setPuntoDeReorden();
        System.out.println("La existencia es igual o menor que el punto de reorden: "+b);

        pedido1.setProveedor(proveedor1);
        System.out.println("Pedido realizado:");
        System.out.println(pedido1);

        pedido1.registrarLlegada(30, LocalDate.of(2026,3,7));
        System.out.println("Pedido entregado:");
        System.out.println(pedido1);

        System.out.println("Mercancia después de llegada del pedido:");
        System.out.println(mercancia1);
    }
}