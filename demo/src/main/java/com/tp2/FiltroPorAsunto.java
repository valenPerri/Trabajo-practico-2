package com.tp2;

import java.util.ArrayList;
import java.util.List;

public class FiltroPorAsunto {

    public List<Correo> filtarPorAsunto(List<Correo> correos, String palabraFiltro){
        List<Correo> correoFiltrado=  new ArrayList<>();
        for(Correo correo: correos){
            if(contienePalabrasFiltrosEnAsunto(correos,palabraFiltro)){
                correoFiltrado.add(correo);
            }
        }

             return correoFiltrado;
    }

private boolean contienePalabrasFiltrosEnAsunto(List<Correo> correos, String palabraFiltro){
    return ((Correo) correos).getAsunto().toLowerCase().contains(palabraFiltro.toLowerCase());
}

}
    
