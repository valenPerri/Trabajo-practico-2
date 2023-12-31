package com.tp2;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroCorreo {
/* 
    public List<Correo> filtarCorreos(List<Correo> correos, List<String> palabrasFiltradas){
        List<Correo> correoFiltrado= new ArrayList<>();
        for(Correo correo: correos){

            if(contienePalabrasFiltro(correo, palabrasFiltradas)){
                correoFiltrado.add(correo);
            }
        }
        return correoFiltrado;
    }

private boolean contienePalabrasFiltro(Correo correo, List<String> palabrasFiltradas){
    String contenidoCorreo= correo.getAsunto() + " " + correo.getContenido() + " " + correo.getRemitente();
    for(String palabraFiltro : palabrasFiltradas){
        if(contenidoCorreo.toLowerCase().contains(palabraFiltro.toLowerCase())){
            return true;
        }
    }
        return false;
} */

 public List<Correo> filtrarPorAsuntoContenidoRemitente(Buzon buzon, String palabraFiltroAsunto, String palabraFiltroContenido, String palabraFiltroRemitente) {
    List<Correo> bandejaDeEntrada = buzon.getBandejaDeEntrada();
    List<Correo> bandejaDeEnviados = buzon.getBandejaDeEnviados();

    List<Correo> correoFiltrados = new ArrayList<>();

    correoFiltrados.addAll(
        bandejaDeEntrada.stream()
            .filter(correo -> correo.getAsunto().contains(palabraFiltroAsunto)
                              && correo.getContenido().contains(palabraFiltroContenido)
                              && correo.getRemitente().contains(palabraFiltroRemitente))
            .collect(Collectors.toList())
    );

    correoFiltrados.addAll(
        bandejaDeEnviados.stream()
            .filter(correo -> correo.getAsunto().contains(palabraFiltroAsunto)
                              && correo.getContenido().contains(palabraFiltroContenido)
                              && correo.getRemitente().contains(palabraFiltroRemitente))
            .collect(Collectors.toList())
    );

    return correoFiltrados;
}
}


    








