package Modulo_12_Arreglos;

public class Ejemplo06_ArregloForBubbleSortNumeros {
    public static void main(String[] args) {
        /* Ordenamiento burbuja aplicado a números */
        int[] numeros = new int[4];
        numeros[0] = 10;
        numeros[1] = Integer.parseInt("7");
        numeros[2] = 35;
        numeros[3] = -1;

        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++){
                /* Se castea el Integer para pasarlo a tipo referencia*/
                if( ((Comparable) numeros[j+1]).compareTo(numeros[j]) < 0){ //Compara los string lexicográficamente basados en su UNICODE
                    int auxiliar = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = auxiliar;
                }
            }
        }

        System.out.println("\n\n==Ordenamiento burbuja optimizado en numeros=");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Para indice " + i + ": " + numeros[i]);
        }

    }
}
