
package com.udea.ingresosygastos.entityes;

import javax.persistence.*;

@Entity
@Table(name="empleado")
public class empleado {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String correo;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private empresa empresa;

    public empleado(String correo, String nombre, String apellido, empresa empresa) {
        this.correo = correo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.empresa = empresa;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "empleado{" +
                "correo='" + correo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", empresa=" + empresa +
                '}';
    }
}
