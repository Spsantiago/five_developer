
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public empleado add(empleado empl) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public empleado edit(empleado empl) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public empleado delete(String correo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
