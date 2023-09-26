package com.tp2;

import java.util.ArrayList;

import java.util.List;

public class Correo {

    private String asunto;
    private String contenido;
    private Contacto remitente;
   // private List<Contacto> Para = new ArrayList<>();

    public Correo(String asunto, String contenido, Contacto remitente /*List<Contacto> Para*/){
        this.asunto= asunto;
        this.contenido= contenido;
        this.remitente= remitente;
        //this.Para= Para; 

    }
    
    public String getAsunto(){
        return asunto;
    }

     public String getContenido(){
        return contenido;
    }

     public Contacto getRemitente(){
        return remitente;
    }

    public void AgregarContacto(Contacto contacto1){
        Para.add(contacto1);

    }

    /*  public List<Contacto> getPara(){
        return Para;
    }
    */




    
}
