
package com.udea.ingresosygastos.controllers;

import java.util.List;

import com.udea.ingresosygastos.entityes.empleado;
import com.udea.ingresosygastos.interfac.empleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "",maxAge =3600)
@RestController
@RequestMapping({"/empleado"})
public class controladorempleado {
   
    @Autowired
    empleadoService Service;
    
    @GetMapping
    public List<empleado>listar(){
        return Service.listar();
    }
}
