

package com.udea.ingresosygastos;


public class empleado {
    private String nombre;
    private String apellido;
    private String correo;
    private empresa empresa;

    public empleado(String nombre, String apellido, String correo, empresa empresa) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.empresa = empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String Apellido) {
        this.apellido = Apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String Correo) {
        this.correo = Correo;
    }

    public empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(empresa Empresa) {
        this.empresa = Empresa;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", Apellido=" + apellido + ", Correo=" + correo + ", Empresa=" + empresa + '}';
    }

}
