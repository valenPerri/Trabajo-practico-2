package com.tp2;

import java.util.ArrayList;
import java.util.List;

public class Correo {

    private String asunto = " ";
    private String contenido = " ";
    private String remitente;
    private List<String> para;
   

    public Correo(String asunto, String contenido, String remitente, String paraUnico){ //constructorUnico
        this.asunto= asunto;
        this.contenido= contenido;
        this.remitente= remitente;
        this.para=new ArrayList<>();
        this.para.add(paraUnico);
    }

    public Correo(String asunto, String contenido, String remitente, List<String> paraVarios){ //constructorVarios
        this.asunto= asunto;
        this.contenido= contenido;
        this.remitente= remitente;
        this.para=new ArrayList<>();
        this.para= paraVarios;    
    }

      public Correo(String asunto, String contenido, String remitente){ //constructorVarios
        this.asunto= asunto;
        this.contenido= contenido;
        this.remitente= remitente;
  
    }

    public Correo(){
    }


    public String getAsunto(){
        return asunto;
    }

     public String getContenido(){
        return contenido;
    }

     public String getRemitente(){
        return remitente;
    }
     public List<String> getPara(){
        return para;
    }




    

    
}
