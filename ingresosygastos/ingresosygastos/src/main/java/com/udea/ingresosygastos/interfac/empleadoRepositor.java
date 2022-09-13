
package com.udea.ingresosygastos.interfac;

import com.udea.ingresosygastos.entityes.empleado;
import org.springframework.data.repository.Repository;

import java.util.List;


public interface empleadoRepositor extends Repository<empleado, Integer> {
    List<empleado>finAll();
    empleado findOne(String correo);
    empleado save (empleado empl);
    void delete (empleado empl);
}
