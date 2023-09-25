package com.tp2;

import java.util.ArrayList;

import java.util.List;

public class Contacto {
    private String Nombre;
    private String Email;

    public List<Correo> BandejaDeEntrada = new ArrayList<>();
    public List<Correo> BandejaDeEnviados = new ArrayList<>();

    public Contacto(){

    }

    public List<Correo> getBandejaDeEntrada(){
        return BandejaDeEntrada;
    }

    public List<Correo> getBandejaDeEnviados(){
        return BandejaDeEnviados;
    }

    public Contacto(String Nombre, String Email){
        //preg monos
    }










}
