package com.udea.ingresosygastos.serviceimpl;

import com.udea.ingresosygastos.entityes.movimientodinero;
import com.udea.ingresosygastos.interfac.movimientodineroRepositor;
import com.udea.ingresosygastos.interfac.movimientodineroService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class movimeintodineroServiceImp implements movimientodineroService {
    @Autowired
    private movimientodineroRepositor repositorio;
    @Override
    public List<movimientodinero> listar() {
        return repositorio.finAll();
    }

    @Override
    public movimientodinero listarcorreo(String concepto) {
        return null;
    }

    @Override
    public movimientodinero add(movimientodinero movimeinto) {
        return null;
    }

    @Override
    public movimientodinero edit(movimientodinero movimeinto) {
        return null;
    }

    @Override
    public movimientodinero delete(String concepto) {
        return null;
    }
}
