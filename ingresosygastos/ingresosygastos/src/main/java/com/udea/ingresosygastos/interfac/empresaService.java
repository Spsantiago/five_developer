package com.udea.ingresosygastos.interfac;


import com.udea.ingresosygastos.entityes.empresa;

import java.util.List;
public interface empresaService {
    List<empresa>listar();
    empresa listarNIT(String NIT);
    empresa add(empresa empr);
    empresa edit(empresa empr);
    empresa delete(String NIT);
}
