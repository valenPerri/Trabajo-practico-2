package com.tp2;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    public List<Correo> BandejaDeEntrada = new ArrayList<>();
    public List<Correo> BandejaDeEnviados = new ArrayList<>(); 

    public List<Correo> getBandejaDeEntrada(){ 
        return BandejaDeEntrada;
    }

   public List<Correo> getBandejaDeEnviados(){ 
        return BandejaDeEnviados;
    }

    
}
