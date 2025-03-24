package Modulo_12_Arreglos;

import java.util.Scanner;

public class Ejemplo12_ArreglosParesImpares {
    public static void main(String[] args) {

        int[] a, pares, impares;
        int totalPares = 0, totalImpares = 0;

        a = new int[10];
        Scanner s = new Scanner(System.in);

        //Este for recorre lo que el usuario ingresa
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }

        // Este for sirve para contar la cantidad de pares e impares que existen en el arreglo ingresado por el usuario
        // y definen el tamaño del nuevo arreglo que contendrá los nuevos datos
        for(int i = 0; i < a.length; i++) {
            if (a[i]%2 == 0){
                totalPares++;
            } else {
                totalImpares++;
            }
        }

        // Inicializamos los arreglos donde se indica el tamaño del arreglo con base al resultado de los contadores
        pares = new int[totalPares];
        impares = new int[totalImpares];

        int j = 0;
        int k = 0;

        // Poblar arreglos de pares e impares
        for(int i = 0; i < a.length; i++) {
            if (a[i]%2 == 0){
                pares[j++] = a[i];
            } else {
                impares[k++] = a[i];
            }
        }

        System.out.println("Pares");
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + " ");
        }

        System.out.println("\r\nImpares");
        for (int i = 0; i < impares.length; i++) {
            System.out.print(impares[i] + " ");
        }
        System.out.println();
    }
}
