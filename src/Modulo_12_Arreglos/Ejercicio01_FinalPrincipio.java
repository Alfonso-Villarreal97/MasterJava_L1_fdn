/*
* Teclear un arreglo de 10 elementos.
* Mostrar de Final al Principio
* Último - Primero
* Penúltimo - Segundo, etc
* */
package Modulo_12_Arreglos;

import java.util.Scanner;

public class Ejercicio01_FinalPrincipio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i, arreglo[];
        arreglo = new int[10];

        /* Poblar arreglo manualmente */
        for (i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero: ");
            arreglo[i] = scanner.nextInt();
        }

        System.out.println("El resultado es:");
        for (i = 0; i <= 4; i++) {
            System.out.println(arreglo[9 - i]); // y el i-ésimo por el final
            System.out.println(arreglo[i]); // mostramos el i-ésimo número por el principio
        }
    }
}
