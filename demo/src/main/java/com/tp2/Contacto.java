package com.tp2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Contacto {

    private String nombre;
    private String apellido;
    private String email;

    public Contacto(String nombre, String apellido, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email= email;
    }

    public Contacto(String email) {  
        this.setEmail(email);
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
    String expresion = "^[A-Za-z0-9+_.-]+@(.+)$"; // define regex para verificar el correo (letras, números seguidos de @)
    Pattern pattern = java.util.regex.Pattern.compile(expresion); // crea el objeto a través de la expresión
    Matcher matcheo = pattern.matcher(email); // hace match del email con las expresiones

    if (matcheo.matches()) {
        this.email = email; // aca hacemos el match
    } 
    else {
        throw new IllegalArgumentException("El correo electrónico no es válido");
    }

}



}