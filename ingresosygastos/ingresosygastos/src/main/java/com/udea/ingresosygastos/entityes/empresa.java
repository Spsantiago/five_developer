
package com.udea.ingresosygastos.entityes;

import javax.persistence.*;
@Entity
@Table(name="empresa")
public class empresa {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String NIT;
    @Column
    private String nombre;
    @Column
    private String direccion;
    @Column
    private String telefono;

    public empresa(String NIT, String nombre, String direccion, String telefono) {
        this.NIT = NIT;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "empresa{" +
                "NIT='" + NIT + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}



