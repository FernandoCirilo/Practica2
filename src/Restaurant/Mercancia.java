package Restaurant;

import java.time.LocalDate;

public class Mercancia {

    private String nombre;
    private int existencia;
    private LocalDate fechaEntrada;
    private int puntoDeReorden;

    public Mercancia(String nombre, int existencia, LocalDate fechaEntrada, int puntoDeReorden) {
        this.nombre = nombre;
        this.existencia = existencia;
        this.fechaEntrada = fechaEntrada;
        this.puntoDeReorden = puntoDeReorden;
    }

    public String getNombre() {return nombre;}
    public int getExistencia() {return existencia;}
    public LocalDate getFechaEntrada() {return fechaEntrada;}
    public int getPuntoDeReorden() {return puntoDeReorden;}
    public void actualizarExistencia(int cantidad, LocalDate fechaLlegada) {
        existencia += cantidad;
        fechaEntrada = fechaLlegada;
    }
    @Override
    public String toString() {
        return "Restaurant.Mercancia{" +
                "nombre='" + nombre + '\'' +
                ", existencia=" + existencia +
                ", fechaEntrada=" + fechaEntrada +
                ", puntoDeReorden=" + puntoDeReorden +
                '}';
    }
}