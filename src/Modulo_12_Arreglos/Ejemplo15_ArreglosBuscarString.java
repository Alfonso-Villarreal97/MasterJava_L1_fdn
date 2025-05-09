package Modulo_12_Arreglos;

import java.util.Scanner;

public class Ejemplo15_ArreglosBuscarString {
    public static void main(String[] args) {

        String[] a = new String[5];
        Scanner s = new Scanner(System.in);

        // Poblar datos del arreglo
        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un nombre: ");
            a[i] = s.next();
        }


        System.out.println("\r\nIngrese un nombre a buscar: ");
        String nombre = s.next();
        int i = 0;

        /*Forma 2 con un for sin inicializar*/
        for(;i<a.length && !a[i].equalsIgnoreCase(nombre);i++){}

        if(i==a.length){
            System.out.println("Número no encontrado");
        } else if (a[i].toLowerCase().compareTo(nombre.toLowerCase()) == 0) {
            System.out.println("Encontrado en la posición: " + i);
        }

    }
}
