package com.udea.ingresosygastos.interfac;
import com.udea.ingresosygastos.entityes.movimientodinero;

import java.util.List;
public interface movimientodineroService {
    List<movimientodinero>listar();
    movimientodinero listarcorreo(String concepto);
    movimientodinero add(movimientodinero movimeinto);
    movimientodinero edit(movimientodinero movimeinto);
    movimientodinero delete(String concepto);
}
