package com.tp2;

import java.util.ArrayList;

import java.util.List;

public class Correo {

    private String asunto;
    private String contenido;
    private Contacto remitente;
    private List<Contacto> para = new ArrayList<>();

    public Correo(String asunto, String contenido, Contacto remitente, List<Contacto> para){
        this.asunto= asunto;
        this.contenido= contenido;
        this.remitente= remitente;
        this.para= para; 

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
        para.add(contacto1);

    }

     public List<Contacto> getPara(){
        return para;
    }
    




    

    
}
