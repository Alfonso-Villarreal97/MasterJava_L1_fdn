package Modulo_12_Arreglos;

import java.util.Scanner;

public class Ejemplo14_ArreglosBuscarNumero {
    public static void main(String[] args) {

        int[] a = new int[10];
        Scanner s = new Scanner(System.in);

        // Poblar datos del arreglo
        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un número: ");
            a[i] = s.nextInt();
        }


        System.out.println("\r\nIngrese un número a buscar: ");
        int num = s.nextInt();
        int i = 0;

       /* Forma 1 de buscar dentro del arreglo
       while(i<a.length && a[i] != num){
            i++;
        }
        */

        /*Forma 2 con un for sin inicializar*/
        for(;i<a.length && a[i] != num;i++){}

        if(i==a.length){
            System.out.println("Número no encontrado");
        } else if (a[i] == num) {
            System.out.println("Encontrado en la posición: " + i);
        }

    }
}
