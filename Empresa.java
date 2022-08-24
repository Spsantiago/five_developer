package mintic;

public class Empresa {

    private String nombre;
    private String direccion;
    private long Telefono;
    private long NIT;

    public Empresa(){

    }
    public Empresa(String nombre, String direccion, long telefono, long NIT) {
        this.nombre = nombre;
        this.direccion = direccion;
        Telefono = telefono;
        this.NIT = NIT;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getTelefono() {
        return Telefono;
    }

    public void setTelefono(long telefono) {
        Telefono = telefono;
    }

    public long getNIT() {
        return NIT;
    }

    public void setNIT(long NIT) {
        this.NIT = NIT;
    }
}
