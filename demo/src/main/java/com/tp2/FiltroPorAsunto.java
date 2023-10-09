package com.tp2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroPorAsunto {
    /* 
 
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
*/ 

public List<Correo> filtrarPorAsunto(Buzon buzon, String asunto) {
        List<Correo> bandejaEntrada = buzon.getBandejaDeEntrada();
        List<Correo> bandejaEnviados = buzon.getBandejaDeEnviados();

        
        List<Correo> correosFiltradosEntrada = bandejaEntrada.stream().filter(correo -> correo.getAsunto().contains(asunto)).collect(Collectors.toList());

        
        List<Correo> correosFiltradosEnviados = bandejaEnviados.stream().filter(correo -> correo.getAsunto().contains(asunto)).collect(Collectors.toList());

        List<Correo> correosFiltrados = new ArrayList<>();
        correosFiltrados.addAll(correosFiltradosEntrada);
        correosFiltrados.addAll(correosFiltradosEnviados);

        return correosFiltrados;
    }

}
    
