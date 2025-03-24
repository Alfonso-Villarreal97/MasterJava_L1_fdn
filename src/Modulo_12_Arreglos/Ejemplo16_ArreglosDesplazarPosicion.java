package Modulo_12_Arreglos;

/*
    La idea es la siguiente, se tiene un arreglo de 10 elementos y se busca que se desplacen los valores
    hacia abajo
    Arreglo inicial:
    | índice | valor |
    | 0      |  1
    | 1      |  2
    | 2      |  3
    | 3      |  4
    | 4      |  5
    | 5      |  6
    | 6      |  7
    | 7      |  8
    | 8      |  9
    | 9      |  10

    Arreglo final:
    | índice | valor |
    | 0      |  10
    | 1      |  1
    | 2      |  2
    | 3      |  3
    | 4      |  4
    | 5      |  5
    | 6      |  6
    | 7      |  7
    | 8      |  8
    | 9      |  9
* */


import java.util.Scanner;

public class Ejemplo16_ArreglosDesplazarPosicion {
    public static void main(String[] args) {

        int[] a = new int[10];
        int ultimo;
        Scanner s = new Scanner(System.in);

        /*Llenar arreglo*/
        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese el número: ");
            a[i] = s.nextInt();
        }

        ultimo = a[a.length-1]; //Se guarda el ultimo valor en una variable auxiliar
        //Se llenan los valores de forma inversa.
        for (int i = a.length - 2; i >= 0; i--) {
            a[i+1] = a[i];
        }

        a[0] = ultimo;
        System.out.println("El arreglo: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }



    }
}
