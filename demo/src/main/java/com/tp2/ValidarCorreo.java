package com.tp2;
 import java.util.Scanner;

public class ValidarCorreo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una dirección de correo electrónico: ");
        String correo = scanner.nextLine();

        if (validarCorreoElectronico(correo)) {
            System.out.println("La dirección de correo electrónico es válida.");
        } else {
            System.out.println("La dirección de correo electrónico no es válida.");
        }

        scanner.close();
    }

    public static boolean validarCorreoElectronico(String correo) {
        // Verificar si contiene "@" y ".com"
        return correo.contains("@") && correo.endsWith(".com");
    }
    
    
}
