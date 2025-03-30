package Modulo_12_Arreglos;

import java.util.Scanner;

public class Ejercicio02_ArregloNumeroMasAlto {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[] numeros = new int[7];
        int aux = 0, aux2 = Integer.MIN_VALUE;
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa un número: ");
            numeros[i] = s.nextInt();

            while(numeros[i] < 11 || numeros[i] > 99){
                System.out.print("Ingrese un número valido [Mayor a 11 y Menor a 99]: ");
                numeros[i] = s.nextInt();
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > aux){
                aux2 = numeros[i];
                aux = aux2;
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("El arreglo ingresado: " + numeros[i]);
        }

        System.out.println("El número mayor del arreglo es: " + aux2);
    }
}
