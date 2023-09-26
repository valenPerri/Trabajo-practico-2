package com.tp2;

import java.util.ArrayList;

import java.util.List;

public class Correo {
    private String Asunto;
    private String Contenido;
    private Contacto Remitente;
    private List<Contacto> Para = new ArrayList<>();

    public Correo(String Asunto, String Contenido, Contacto Remitente, List<Contacto> Para){
        this.Asunto= Asunto;
        this.Contenido= Contenido;
        this.Remitente= Remitente;
        this.Para= Para; 
        
    }
    
    public String getAsunto(){
        return Asunto;
    }

     public String getContenido(){
        return Contenido;
    }

     public Contacto getRemitente(){
        return Remitente;
    }

    public void AgregarContacto(Contacto contacto1){
        Para.add(contacto1);

    }

    public List<Contacto> getPara(){
        return Para;
    }




    
}
