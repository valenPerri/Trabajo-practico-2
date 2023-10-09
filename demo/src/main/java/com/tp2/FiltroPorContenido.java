package com.tp2;

import java.util.ArrayList;
import java.util.List;

public class FiltroPorContenido {
    public List<Correo> filtarPorContenido (List<Correo> correos, String palabraFiltro){
        List<Correo> correoFiltrado=  new ArrayList<>();
        for(Correo correo: correos){
            if(contienePalabrasFiltrosEnContenido(correo,palabraFiltro)){
                correoFiltrado.add(correo);
            }
        }

             return correoFiltrado;
    }

private boolean contienePalabrasFiltrosEnContenido(Correo correo, String palabraFiltro){
    return correo.getContenido().toLowerCase().contains(palabraFiltro.toLowerCase());
}

}
    
