package com.tp2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Contacto> listaContactos = new ArrayList<>();

        while (true) {
            System.out.println("Ingrese nombre del contacto (o escriba 'no' para salir):");
            String nombre = scanner.nextLine();

            if (nombre.equalsIgnoreCase("no")) {
                break;
            }

            System.out.println("Ingrese apellido del contacto:");
            String apellido = scanner.nextLine();

            System.out.println("Ingrese el correo electrónico del contacto:");
            String email = scanner.nextLine();

            // Creamos el nuevo contacto
            Contacto nuevoContacto = new Contacto(nombre, apellido, email);

            // Validamos el correo
            if (nuevoContacto.getEmail() != null) {
                listaContactos.add(nuevoContacto);
                System.out.println("Contacto agregado exitosamente.");
            } else {
                System.out.println("El correo electrónico no es válido. Inténtelo nuevamente.");
            }
        }

        System.out.println("\nNúmero de contactos ingresados: " + listaContactos.size());
        if (listaContactos.size() > 0) {
            System.out.println("Lista de contactos:");
            for (Contacto contacto : listaContactos) {
                contacto.mostrarDatos();
            }
        }

        scanner.close();
    }
}