package com.udea.ingresosygastos;


public class movimientodedinero {
    private Long monto;
    private String concepto;
    private String usuario;

    public movimientodedinero(Long monto, String concepto, String usuario) {
        this.monto = monto;
        this.concepto = concepto;
        this.usuario = usuario;
    }

    public Long getMonto() {
        return monto;
    }

    public void setMonto(Long monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
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
