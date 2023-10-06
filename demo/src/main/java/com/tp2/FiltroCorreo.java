package com.tp2;

import java.util.ArrayList;
import java.util.List;

public class FiltroCorreo {

    public List<Correo> filtarCorreos(List<Correo> correos, String palabrasFiltradas){
        List<Correo> correoFiltrado= new ArrayList<>();
        for(Correo correo: correos){

            if(contienePalabrasFiltro(correo, palabrasFiltradas)){
                correoFiltrado.add(correo);
            }
        }
        return correoFiltrado;
    }

private boolean contienePalabrasFiltro(Correo correo, String palabrasFiltradas){
    String contenidoCorreo= correo.getAsunto() + " " + correo.getContenido() + " " + correo.getRemitente();
    for(String palabraFiltro : palabrasFiltradas){
        if(contenidoCorreo.toLowerCase().contains(palabraFiltro.toLowerCase())){
            return true;
        }
    }
        return false;
}


}
    








