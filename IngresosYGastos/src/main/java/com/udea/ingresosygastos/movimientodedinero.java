package com.udea.ingresosygastos;


public class movimientodedinero {
    private long monto;
    private String concepto;
    private empleado usuario;

    public movimientodedinero(long monto, String concepto, empleado usuario) {
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
        return "Movimiento Dinero{" +
                "Monto='" + monto + '\'' +
                ", Concepto='" + concepto + '\'' +
                ", Usuario=" + usuario +
                '}';
    }
}
