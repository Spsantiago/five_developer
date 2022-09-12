package com.udea.ingresosygastos.interfac;

import com.udea.ingresosygastos.entityes.empresa;
import org.springframework.data.repository.Repository;

import java.util.List;


public interface empresaRepositor extends Repository <empresa, Integer>{
    List<empresa>finAll();
    empresa findOne(String NIT);
    empresa save (empresa empr);
    void delete (empresa empr);
}
