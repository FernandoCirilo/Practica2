package Restaurant;

import java.time.LocalDate;

public class Pedido {

    private int cantidadPedido;
    private LocalDate fechaPedido;
    private LocalDate fechaLlegada;

    private Mercancia mercancia;
    private Proveedor proveedor;

    public Pedido(int cantidadPedido, LocalDate fechaPedido, Mercancia mercancia) {

        this.cantidadPedido = cantidadPedido;
        this.fechaPedido = fechaPedido;
        this.mercancia = mercancia;
    }

    public int getCantidadPedido() {return cantidadPedido;}
    public LocalDate getFechaPedido() {return fechaPedido;}
    public LocalDate getFechaLlegada() {return fechaLlegada;}
    public Mercancia getMercancia() {return mercancia;}

    public void setProveedor(Proveedor proveedor) {this.proveedor = proveedor;}
    public void registrarLlegada(int cantidadRecibida, LocalDate fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
        // actualiza inventario
        mercancia.actualizarExistencia(cantidadRecibida, fechaLlegada);
    }

    @Override
    public String toString() {

        String llegada;

        if (fechaLlegada == null) {
            llegada = "Restaurant.Pedido aún no recibido";
        } else {
            llegada = fechaLlegada.toString();
        }

        return "Restaurant.Pedido{" +
                "cantidadPedido=" + cantidadPedido +
                ", fechaPedido=" + fechaPedido +
                ", fechaLlegada=" + llegada +
                "\n proveedor=" + proveedor +
                '}';
    }
}