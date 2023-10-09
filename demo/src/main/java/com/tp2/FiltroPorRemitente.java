package com.tp2;

import java.util.ArrayList;
import java.util.List;


public class FiltroPorRemitente {

public List<Correo> filtarPorRemitente (List<Correo> correos, String palabraFiltro){
        List<Correo> correoFiltrado=  new ArrayList<>();
        for(Correo correo: correos){
            if(contienePalabrasFiltrosEnRemitente(correo,palabraFiltro)){
                correoFiltrado.add(correo);
            }
        }

             return correoFiltrado;
    }

public boolean contienePalabrasFiltrosEnRemitente(Correo correo, String palabraFiltro){
    return  correo.getRemitente().toLowerCase().contains(palabraFiltro.toLowerCase());
} 



}