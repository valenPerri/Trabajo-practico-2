package com.tp2;

import java.util.ArrayList;
import java.util.List;

public class FiltroPorAsunto {

    public List<Correo> filtarPorAsunto(List<Correo> correos, String palabraFiltro){
        List<Correo> correoFiltrado=  new ArrayList<>();
        for(Correo correo: correos){
            if(contienePalabrasFiltrosEnAsunto(correo,palabraFiltro)){
                correoFiltrado.add(correo);
            }
        }

             return correoFiltrado;
    }


private boolean contienePalabrasFiltrosEnAsunto(Correo correo, String palabraFiltro){
    return correo.getAsunto().toLowerCase().contains(palabraFiltro.toLowerCase());
}



}
    
