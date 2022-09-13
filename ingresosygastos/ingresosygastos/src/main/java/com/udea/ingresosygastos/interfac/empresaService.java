package com.udea.ingresosygastos.interfac;


import com.udea.ingresosygastos.entityes.empresa;

import java.util.List;
public interface empresaService {
    List<empresa>listar();
    empresa listarcorreo(String NIT);
    empresa add(empresa empr);
    empresa edit(empresa empr);
    empresa delete(String NIT);
}
