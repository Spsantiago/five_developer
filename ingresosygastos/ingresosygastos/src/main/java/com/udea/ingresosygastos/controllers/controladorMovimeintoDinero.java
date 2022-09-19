package com.udea.ingresosygastos.controllers;
import java.util.List;


import com.udea.ingresosygastos.entityes.movimientodinero;
import com.udea.ingresosygastos.interfac.movimientodineroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "",maxAge =3600)
@RestController
@RequestMapping({"/movimientodedinero"})
public class controladorMovimeintoDinero {
    @Autowired
    movimientodineroService Service;

    @GetMapping
    public List<movimientodinero>listar(){return Service.listar();}
    @PostMapping
    public movimientodinero agregar (@RequestBody movimientodinero mov ){
        return Service.add(mov);
    }
    @GetMapping(path = {"/concepto"})
    public movimientodinero listarconcepto(@PathVariable("concepto") String concepto){
        return Service.listarconcepto(concepto);
    }
    @DeleteMapping( path = {"/concepto"})
    public movimientodinero delete (@PathVariable("concepto") String concepto){
        return Service.delete(concepto);
    }
}
