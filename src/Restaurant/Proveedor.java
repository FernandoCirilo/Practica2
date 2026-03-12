package Restaurant;
public class Proveedor {
    private String nombre;
    private int telefono;
    private String direccion;

    public Proveedor(String nombre, int telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {return nombre;}
    public int getTelefono() {return telefono;}
    public String getDireccion() {return direccion;}

    @Override
    public String toString() {
        return "Proveedor{ " +
                "nombre= " + nombre +
                ", telefono= " + telefono +
                ", direccion= " + direccion +
                " }\n";
    }
}
