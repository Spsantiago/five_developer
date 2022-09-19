package com.udea.ingresosygastos.serviceimpl;
import java.util.List;


import com.udea.ingresosygastos.entityes.empresa;
import com.udea.ingresosygastos.interfac.empresaRepositor;
import com.udea.ingresosygastos.interfac.empresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class empresaServiceImp implements empresaService {
    @Autowired
    private empresaRepositor repositorio;
    @Override
    public List<empresa> listar() {
        return repositorio.finAll();
    }

    @Override
    public empresa listarNIT(String NIT) {
        return null;
    }

    @Override
    public empresa add(empresa empr) {
        return repositorio.save(empr);
    }

    @Override
    public empresa edit(empresa empr) {
        return repositorio.save(empr);
    }

    @Override
    public empresa delete(String NIT) {
        empresa empr= repositorio.findOne(NIT);
        if (empr != null ){
            repositorio.delete(empr);
        }
        return empr;
    }
}
