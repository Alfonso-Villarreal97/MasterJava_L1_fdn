/*
* Idea del ejercicio:
* Tener dos arreglos y generar un tercer arreglo con los datos combinados de los arreglos
* */

package Modulo_12_Arreglos;

public class EjemploArregloCombinados {
    public static void main(String[] args) {
        int[] a,b,c;
        a = new int[9];
        b = new int[9];
        c = new int[18];

        /*Poblar arreglo a*/
        for (int i = 0; i < a.length; i++) {
            a[i] = i+1; // Llenará {1,2,3,4,5,6,7,8,9}
        }

        /*Poblar arreglo b*/
        for (int i = 0; i < b.length; i++) {
            b[i] = (i+1)*5; // Llenará {5,10,15,20,...,45}
        }

        /*Poblar arreglo c*/
        int aux = 0;
        /*  Poblando arreglo C con 3 elementos según la configuración actual, 
            en cada iteración obtenemos 3 elementos del arreglo A y B y los guardamos en el arreglo C
         */
        for (int i = 0; i < b.length; i+=3) {
            for (int j = 0; j < 3; j++) { //Este for toma 3 elementos del arreglo A y los almacena en el arreglo C
                c[aux++] = a[i+j];
            }

            for (int j = 0; j < 3; j++) { //Este for toma 3 elementos del arreglo B y los almacena en el arreglo C
                c[aux++] = b[i+j];
            }
        }

        for (int i = 0; i < c.length; i++) {
            System.out.println(i + ": " + c[i]);
        }
    }
}
