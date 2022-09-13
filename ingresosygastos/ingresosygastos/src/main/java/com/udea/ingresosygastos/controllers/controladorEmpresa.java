package com.udea.ingresosygastos.controllers;
import java.util.List;

import com.udea.ingresosygastos.entityes.empresa;
import com.udea.ingresosygastos.interfac.empresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
