package com.tp2;

import java.util.List;

public class Correo {

    private String asunto = " ";
    private String contenido = " ";
    private Contacto remitente;
    private List<Contacto> para;
   

    public Correo(String asunto, String contenido, Contacto remitente, Contacto paraUnico){ //constructorUnico
        this.asunto= asunto;
        this.contenido= contenido;
        this.remitente= remitente;
        this.para=List.of(paraUnico);
    }

    public Correo(String asunto, String contenido, Contacto remitente, List<Contacto> paraVarios){ //constructorVarios
        this.asunto= asunto;
        this.contenido= contenido;
        this.remitente= remitente;
        this.para= paraVarios;    
    }

    public Correo(){

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

    public void setAsunto(String asunto){
        this.asunto = asunto;
    }

    public void setContenido(String contenido){
        this.contenido= contenido;
    }

    public void setRemitente(Contacto remitente){
        this.remitente= remitente;
    }

    



    

    
}
