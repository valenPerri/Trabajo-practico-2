package com.tp2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroAsuntoyContenido {

    
      /*public List<Correo> filtrarAsuntoContenido(List<Correo> correos, List<String> palabrasClave) {
        List<Correo> correosFiltrados = new ArrayList<>();

        for (Correo correo : correos) {
            // Verificar si el asunto, contenido o remitente contiene alguna palabra clave
            if (contienePalabraClave(correo, palabrasClave)) {
                correosFiltrados.add(correo);
            }
        }

        return correosFiltrados;
    }

    private boolean contienePalabraClave(Correo correo, List<String> palabrasClave) {
        String contenidoCorreo = correo.getAsunto() + " " + correo.getContenido();
        for (String palabraClave : palabrasClave) {
            if (contenidoCorreo.toLowerCase().contains(palabraClave.toLowerCase())) {
                return true;
            }
        }
        return false;
    } */ 

    public List<Correo> filtrarPorAsuntoyContenido(Buzon buzon, String palabraFiltroAsunto, String palabraFiltroContenido) {
        List<Correo> bandejaDeEntrada = buzon.getBandejaDeEntrada();
        List<Correo> bandejaDeEnviados = buzon.getBandejaDeEnviados();
    
        List<Correo> correosFiltrados = new ArrayList<>();
    
        correosFiltrados.addAll(
            bandejaDeEntrada.stream()
                .filter(correo -> correo.getAsunto().contains(palabraFiltroAsunto) && correo.getContenido().contains(palabraFiltroContenido))
                .collect(Collectors.toList())
        );
    
        correosFiltrados.addAll(
            bandejaDeEnviados.stream()
                .filter(correo -> correo.getAsunto().contains(palabraFiltroAsunto) && correo.getContenido().contains(palabraFiltroContenido))
                .collect(Collectors.toList())
        );
    
        return correosFiltrados;
    }
    
}
