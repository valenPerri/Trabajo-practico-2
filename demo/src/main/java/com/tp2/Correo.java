package com.tp2;

import java.util.ArrayList;

import java.util.List;

public class Correo {
    private String Asunto;
    private String Contenido;
    private Contacto Remitente;
    private List<Contacto> Para = new ArrayList<>();

    public Correo(String Asunto, String Contenido, Contacto Remitente, List<Contacto> Para){

    }

    public void AgregarContacto(Contacto contacto1){
        Para.add(contacto1);

    }

    public List<Contacto> getPara(){
        return Para;
    }

    public void EnviarCorreo(Correo correo1){
        Remitente.BandejaDeEnviados.add(correo1);

    }




    
}
