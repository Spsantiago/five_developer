package mintic;

public class MovimientosDienro {

    private Long Monto;
    private String Concepto;
    private String Usuario;

    public MovimientosDienro(Long monto, String concepto, String usuario) {
        Monto = monto;
        Concepto = concepto;
        Usuario = usuario;
    }

    public Long getMonto() {
        return Monto;
    }

    public void setMonto(Long monto) {
        Monto = monto;
    }

    public String getConcepto() {
        return Concepto;
    }

    public void setConcepto(String concepto) {
        Concepto = concepto;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }
    @Override
    public String toString() {
        return  '{'"Usuario='" + Usuario + '\'' +
                ", Concepto='" + Concepto + '\'' +
                ", Usuario=" + Usuario +
                '}';
    }
}