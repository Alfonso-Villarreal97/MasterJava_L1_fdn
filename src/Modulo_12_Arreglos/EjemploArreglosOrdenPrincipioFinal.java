/*
    i-ésimo número principio y final
    Arreglo de enteros de 10 elementos
    Mostrar elementos en un orden determinado

    P.e
    El primero con el último
    El segundo con el penúltimo
    El tercero con el antepenultimo
    
*/
package Modulo_12_Arreglos;

public class EjemploArreglosOrdenPrincipioFinal {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        int[] a = new int[10]; //Este arreglo busca poblar los iesimos

        for (int i = 0; i< numeros.length; i++){
            numeros[i] = i + 1;
        }

        int aux = 0;
        for (int i = 0; i < numeros.length - i; i++) {
            a[aux++] = numeros[i]; //recorrido lineal [1,2,3,4,5,6,7,8,9]
            a[aux++] = numeros[numeros.length - 1 - i]; //recorrido invertido [10,9,8,7,6,5,4,3,2,1]
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println("Posición en memoria = " + i + " iésimo valor: " + a[i]);
        }

    }

}
