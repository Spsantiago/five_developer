package com.udea.ingresosygastos.controllers;
import java.util.List;

import com.udea.ingresosygastos.entityes.empresa;
import com.udea.ingresosygastos.interfac.empresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "",maxAge =3600)
@RestController
@RequestMapping({"/empresa"})

public class controladorEmpresa {
    @Autowired
    empresaService Service;

    @GetMapping
    public List<empresa>listar(){
        return Service.listar();
    }
    @PostMapping
    public empresa add (@RequestBody empresa empr){
        return  Service.add(empr);
    }
    @GetMapping(path = {"/{NIT}"})
    public empresa listarNIT(@PathVariable("NIT") String NIT){
        return Service.listarNIT(NIT);
    }
    @PutMapping(path = {"/NIT"})
    public empresa editar(@RequestBody empresa empr, @PathVariable ("NIT") String NIT){
        return  Service.edit(empr);
    }
    @DeleteMapping (path = {"/NIT"})
    public empresa delete (@PathVariable("NIT") String NIT){
        return Service.delete(NIT);
    }
}
