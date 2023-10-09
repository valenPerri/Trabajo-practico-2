package com.tp2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class FiltroPorRemitente {

  public List<Correo> filtroPorRemitente(Buzon buzon, String remitente) {
        List<Correo> bandejaDeEntrada = buzon.getBandejaDeEntrada();
        List<Correo> bandejaDeEnviados = buzon.getBandejaDeEnviados();

        List<Correo> correoFiltradoEntrada = bandejaDeEntrada.stream().filter(correo -> correo.getRemitente().contains(remitente)).collect(Collectors.toList());
        
        List<Correo> correoFiltradoEnviados = bandejaDeEnviados.stream().filter(correo -> correo.getRemitente().contains(remitente)).collect(Collectors.toList());

        List<Correo> correoFiltrados = new ArrayList<>();

        correoFiltrados.addAll(correoFiltradoEntrada);
        correoFiltrados.addAll(correoFiltradoEnviados);

        return correoFiltrados;
    }


}