package com.tp2;

public class Contacto {

  private String nombre= " ";
  private String apellido= " ";
  private String email;

  public String getNombre(){
      return nombre;
  }
  public String getApellido(){
      return apellido;
  }

  public String getEmail(){
      return email;
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
}

  public void setApellido(String apellido){
    this.apellido = apellido;
}

  public void setEmail(String email){
    this.email = email;
}


 public Contacto(String nombre,String apellido, String email){
    this.nombre=nombre; 
    this.apellido= apellido;
    this.email=email;
  }

//validar correo aca fijarse como introducir 

    }








