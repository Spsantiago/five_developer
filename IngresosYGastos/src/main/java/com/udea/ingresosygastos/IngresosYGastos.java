
package com.udea.ingresosygastos;


public class IngresosYGastos {

    public static void main(String[] args) {
             
        empresa empresa = new empresa("Grupo Bysa S.A.S", "Cra 1 # 1-115 panamericana", "6027735505", "901518345-2");
        movimientodedinero movimiento = new movimientodedinero(10500, "gasto", "eamejia");
        empleado empleado = new empleado("hola","hola","hola",empresa);
        System.out.println(empresa.toString());
        System.out.println(movimiento.toString());               
        System.out.println(empleado.toString());
    }
}
