package com.udea.ingresosygastos.interfac;


import com.udea.ingresosygastos.entityes.movimientodinero;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface movimientodineroRepositor extends Repository<movimientodinero, Integer> {
    List<movimientodinero> finAll();
    movimientodinero findOne(String concepto);
    movimientodinero save (movimientodinero movimientodinero);
    void delete (movimientodinero movimientodinero);
}
