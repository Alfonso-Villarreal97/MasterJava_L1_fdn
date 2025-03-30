/*
    Leer 7 números por teclado para llenar un arreglo y a continuación calcular el promedio
    de los números positivos, el promedio de los negativos y contar el número de ceros.
*/
package Modulo_12_Arreglos;

import java.util.Scanner;

public class Ejercicio03_ArreglosEstadistico {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numeros = new int[7];
        int contadorPos = 0, contadorNeg = 0, contadorCeros = 0;

        /*Ingresar los valores*/
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa un número: ");
            numeros[i] = s.nextInt();

            if(numeros[i] >= 1){
                contadorPos++;
            } else if (numeros[i] == 0){
                contadorCeros++;
            } else if (numeros[i] < 0) {
                contadorNeg++;
            }
        }

        /*Definir el tamaño de los arreglos con base a contadores */
        int totalPos = 0, totalNeg = 0;
        /* Sumar numeros almacenados de acuerdo a su signo*/
        for (int i = 0; i < numeros.length; i++) {

            if(numeros[i] >= 1){
                totalPos = totalPos + numeros[i];
            } else if (numeros[i] < 0){
                totalNeg = totalNeg + numeros[i];
            }
        }

        System.out.println("El promedio de los positivos es: " + (float)totalPos / contadorPos);
        System.out.println("El promedio de los negativos es: " + (float)totalNeg / contadorNeg);
        System.out.println("Cantidad de ceros es: " + contadorCeros);
    }
}
