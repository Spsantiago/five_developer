
package com.udea.ingresosygastos.interfac;

import com.udea.ingresosygastos.entityes.empleado;

import java.util.List;


public interface empleadoService {

        List<empleado>listar();
        empleado listarcorreo(String correo);
        empleado add(empleado empl);
        empleado edit(empleado empl);
        empleado delete(String correo);
}
