
package com.udea.ingresosygastos.entityes;

import javax.persistence.*;

@Entity
@Table(name="movimientodedinero")
public class movimientodinero {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String concepto;
    @Column
    private long monto;
    @Column
    private empleado usuario;

    public movimientodinero(long monto, String concepto, empleado usuario) {
        this.monto = monto;
        this.concepto = concepto;
        this.usuario = usuario;
    }

    public long getMonto() {
        return monto;
    }

    public void setMonto(long monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public empleado getUsuario() {
        return usuario;
    }

    public void setUsuario(empleado usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "movimeintodinero{" +
                "monto=" + monto +
                ", concepto='" + concepto + '\'' +
                ", usuario=" + usuario +
                '}';
    }
}
