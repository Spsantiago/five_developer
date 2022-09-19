
package com.udea.ingresosygastos.serviceimpl;

import java.util.List;

import com.udea.ingresosygastos.entityes.empleado;
import com.udea.ingresosygastos.interfac.empleadoRepositor;
import com.udea.ingresosygastos.interfac.empleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class empleadoServiceImp implements empleadoService {
    @Autowired
    private empleadoRepositor repositorio;
            
    @Override
    public List<empleado> listar() {
        return repositorio.finAll();
    }

    @Override
    public empleado listarcorreo(String correo) {
      return repositorio.findOne(correo);
    }

    @Override
    public empleado add(empleado empl) {

        return repositorio.save(empl);
    }

    @Override
    public empleado edit(empleado empl) {
        return repositorio.save(empl);
    }

    @Override
    public empleado delete(String correo) {
        empleado empl = repositorio.findOne(correo);
        if (empl!=null ){
            repositorio.delete(empl);
        }
        return empl;
    }
    
}
