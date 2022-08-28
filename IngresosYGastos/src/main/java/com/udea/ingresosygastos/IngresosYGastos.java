
package com.udea.ingresosygastos;


public class IngresosYGastos {

    public static void main(String[] args) {
             
        empresa emp = new empresa("Grupo Bysa S.A.S", "Cra 1 # 1-115 panamericana", "6027735505", "901518345-2");
        movimientodedinero movimiento = new movimientodedinero(10500, "gasto", "eamejia");
        
        System.out.println(emp.toString());
        System.out.println(movimiento.toString());               
       
    }
}
