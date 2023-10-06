package com.tp2;

import java.util.ArrayList;
import java.util.List;

public class Filtro {

    public List<Correo> filtarCorreo(List<Correo> correos, List<String> palabrasFiltradas){
        List<Correo> correoFiltrado = new ArrayList<>();

        for(Correo correo: correos){

            if(contienePalabrasFiltros(correo, palabrasFiltradas)){
                correoFiltrado.add(correo);
            }
        }

        return correoFiltrado;

    }

public boolean contienePalabrasFiltros(Correo correo, List<String> palabrasFiltradas){
        String contenidoCorreo =correo.getAsunto() + " " + correo.getContenido() + " " + correo.getRemitente();
        for(String palabraFiltro : palabrasFiltradas){
            if(contenidoCorreo.toLowerCase().contains(palabraFiltro.toLowerCase())){
                return true;
            }
        }

                return false;
    }

    public List<Correo> filtarPorAsunto(List<Correo> correos, String palabraFiltro){
        List<Correo> correoFiltrado = new ArrayList<>();
        for(Correo correo: correos){
            if(contienePalabrasFiltrosEnAsunto(correo, palabraFiltro)){
                correoFiltrado.add(correo);
            }
        }

               return correoFiltrado;
    }

    public List<Correo> filtarPorContenido(List<Correo> correos, String palabraFiltro){
        List<Correo> correoFiltrado = new ArrayList<>();
        for(Correo correo: correos){
            if(contienePalabrasFiltrosEnContenido(correo, palabraFiltro)){
                correoFiltrado.add(correo);
            }
        }

               return correoFiltrado;
    }

        public List<Correo> filtarPorRemitente(List<Correo> correos, String palabraFiltro){
        List<Correo> correoFiltrado = new ArrayList<>();
        for(Correo correo: correos){
            if(contienePalabrasFiltrosEnRemitente(correo, palabraFiltro)){
                correoFiltrado.add(correo);
            }
        }

               return correoFiltrado;
    }

private boolean contienePalabrasFiltrosEnAsunto(Correo correo, String palabraFiltro){
    return correo.getAsunto().toLowerCase().contains(palabraFiltro.toLowerCase());
}

private boolean contienePalabrasFiltrosEnContenido(Correo correo, String palabraFiltro){
    return correo.getContenido().toLowerCase().contains(palabraFiltro.toLowerCase());
}

private boolean contienePalabrasFiltrosEnRemitente(Correo correo, String palabraFiltro){
    return correo.getRemitente().toLowerCase().contains(palabraFiltro.toLowerCase());
}






   

}
