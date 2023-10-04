package com.tp2;

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

        String expresion = "^[A-Za-z0-9+_.-]+@(.+)$"; // define regex para verificar el correo (letras, números seguidos de @)
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(expresion); // crea el objeto a través de la expresión
        java.util.regex.Matcher matcheo = pattern.matcher(email); // hace match del email con las expresiones


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

    public void mostrarContacto() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Correo electrónico: " + email);
        System.out.println();
    }





}
