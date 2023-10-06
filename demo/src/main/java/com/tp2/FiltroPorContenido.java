package com.tp2;

import java.util.ArrayList;
import java.util.List;

public class FiltroPorContenido {

      public List<Correo> filtarPorContenido (List<Correo> correos, String palabraFiltro){
        List<Correo> correoFiltrado=  new ArrayList<>();
        for(Correo correo: correos){
            if(contienePalabrasFiltrosEnContenido(correos,palabraFiltro)){
                correoFiltrado.add(correo);
            }
        }

             return correoFiltrado;
    }

private boolean contienePalabrasFiltrosEnContenido(List<Correo> correos, String palabraFiltro){
    return ((Correo) correos).getContenido().toLowerCase().contains(palabraFiltro.toLowerCase());
}

}
    
