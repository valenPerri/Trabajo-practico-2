package com.tp2;

import java.util.ArrayList;
import java.util.List;

public class FiltroPorRemitente {

          public List<Correo> filtarPorRemitente (List<Correo> correos, String palabraFiltro){
        List<Correo> correoFiltrado=  new ArrayList<>();
        for(Correo correo: correos){
            if(contienePalabrasFiltrosEnRemitente(correos,palabraFiltro)){
                correoFiltrado.add(correo);
            }
        }

             return correoFiltrado;
    }

private boolean contienePalabrasFiltrosEnRemitente(List<Correo> correos, String palabraFiltro){
    return ((Correo) correos).getRemitente().toLowerCase().contains(palabraFiltro.toLowerCase());
}
    
}
