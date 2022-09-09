
package com.udea.ingresosygastos;


public class empleado {
    private String nombre;
    private String Apellido;
    private String Correo;
    private empresa Empresa;

    public empleado(String nombre, String Apellido, String Correo, empresa Empresa) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.Correo = Correo;
        this.Empresa = Empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public empresa getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(empresa Empresa) {
        this.Empresa = Empresa;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", Apellido=" + Apellido + ", Correo=" + Correo + ", Empresa=" + Empresa + '}';
    }

}
