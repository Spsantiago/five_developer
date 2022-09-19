
package com.udea.ingresosygastos.controllers;

import java.util.List;

import com.udea.ingresosygastos.entityes.empleado;
import com.udea.ingresosygastos.interfac.empleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping
    public empleado add (@RequestBody empleado empl){
        return Service.add(empl);
    }
    @GetMapping (path = {"/{correo}"})
    public empleado listarcorreo(@PathVariable("correo")String correo){
    return Service.listarcorreo(correo);
    }
    @PutMapping (path = {"/correo"})
    public empleado editar(@RequestBody empleado empl, @PathVariable("coreo") String correo){
        empl.setCorreo(correo);
        return Service.edit(empl);
    }
    @DeleteMapping (path = {"/coreo"})
    public empleado delete (@PathVariable("coreo") String correo){
        return Service.delete(correo);
    }
}
