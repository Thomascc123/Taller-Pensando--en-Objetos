package com.example.demo;

import java.util.Scanner;

public class Lectura {

    Scanner sc = new Scanner(System.in);

    public int leerInt(String mensaje) {
        System.out.println(mensaje);
        int dato = sc.nextInt();
        return dato;
    }

    public String leerString(String mensaje) {
        System.out.println(mensaje);
        String dato = sc.next();
        return dato;
    }

    public double leerDouble(String mensaje) {
        System.out.println(mensaje);
        double dato = sc.nextDouble();
        return dato;
    }

    public double valDouble(String mensaje) {
        double dato;
        do {
            System.out.print(mensaje);
            while (!sc.hasNextDouble()) {
                System.out.println("Valor no válido");
                System.out.println("Debe ser un número positivo: ");
                sc.next();
            }
            dato = leerDouble("");
            if (dato < 0){
                System.out.println("El numero debe ser mayor que 0: ");
            }
        } while (dato < 0);
        return dato;
    }

    public int valInt(String mensaje) {
        int dato;
        do {
            System.out.print(mensaje);
            while (!sc.hasNextInt()) {
                System.out.println("Valor no válido");
                System.out.println("Debe ser un número entero: ");
                sc.next();
            }
            dato = leerInt("");
        } while (dato < 0);
        return dato;
    }
}
