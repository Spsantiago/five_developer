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
    public movimientodinero listarconcepto(String concepto) {
        return repositorio.findOne(concepto);
    }

    @Override
    public movimientodinero add(movimientodinero movimeinto) {
        return repositorio.save(movimeinto);
    }

    @Override
    public movimientodinero edit(movimientodinero movimeinto) {
        return repositorio.save(movimeinto);
    }

    @Override
    public movimientodinero delete(String concepto) {
        movimientodinero movimientodinero= repositorio.findOne(concepto);
        if (movimientodinero!=null){
            repositorio.delete(movimientodinero);
        }
        return movimientodinero;
    }
}
