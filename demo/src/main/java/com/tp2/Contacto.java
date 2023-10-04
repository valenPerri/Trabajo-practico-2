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
        setEmail(email);
    }

    public void setEmail(String email) {
        String expresion = "^[A-Za-z0-9+_.-]+@(.+)$"; // define regex que da una expresion regular para verificar el  correo (letras, numeros seguidos de @)
        Pattern pattern = Pattern.compile(expresion); // crea el objeto atraves de la expresion
        Matcher matcheo = pattern.matcher(email); // machea el email con las expresiones que se cargaron por lo que si mail coincide hace el match sino lo toma como invalido

        if (matcheo.matches()) {
            this.email = email; // aca hacemos el match
        } else {
            System.out.println("El correo electrónico no es válido");
            this.email = null; // nulo si es inválido
        }
    }

    public String getEmail() {
        return email;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Correo electrónico: " + email);
        System.out.println();
    }





}
