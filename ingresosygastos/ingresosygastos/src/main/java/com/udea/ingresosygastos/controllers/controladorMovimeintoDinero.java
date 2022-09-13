package com.udea.ingresosygastos.controllers;
import java.util.List;


import com.udea.ingresosygastos.entityes.movimientodinero;
import com.udea.ingresosygastos.interfac.movimientodineroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "",maxAge =3600)
@RestController
@RequestMapping({"/movimientodedinero"})
public class controladorMovimeintoDinero {
    @Autowired
    movimientodineroService Service;

    @GetMapping
    public List<movimientodinero>listar(){return Service.listar();}
}
