package Modulo_12_Arreglos;

import java.util.Scanner;

public class Ejemplo20_ArreglosDesplazarPosicion3b {
    public static void main(String[] args) {

        int[] a = new int[7];
        int numero, posicion, ultimo;

        Scanner s = new Scanner(System.in);

        /*Llenar 6 elementos del arreglo de 7*/
        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un número: ");
            a[i] = s.nextInt();
        }
        System.out.println();

        System.out.println("Ingrese un número a insertar: ");
        numero = s.nextInt();

        ultimo = a[a.length -1];
        posicion = 0;
        while (posicion < a.length-1 && numero > a[posicion]){
            posicion++;
        }

        for(int i = a.length -2; i >= posicion; i--){
            a[i+1] = a[i];
        }

        int[] b = new int[a.length+1];
        System.arraycopy(a,0,b,0,a.length);

        if(numero > ultimo){
            b[b.length-1] = numero;
        } else {
            b[b.length - 1] = ultimo;
            b[posicion] = numero;
        }

        System.out.println("El nuevo arreglo ordenado: ");
        for (int i = 0; i < b.length; i++) {
            System.out.println(i + " => " + b[i]);
        }
    }
}
