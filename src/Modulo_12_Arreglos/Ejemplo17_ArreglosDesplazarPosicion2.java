package Modulo_12_Arreglos;
import java.util.Scanner;
/*
* Agregar un elemento a una posicion determinada
* */
public class Ejemplo17_ArreglosDesplazarPosicion2 {
    public static void main(String[] args) {

        int[] a = new int[10];
        int elemento, posicion;
        Scanner s = new Scanner(System.in);

        /*Llenar arreglo*/
        /*Se llena hasta el total del arreglo - 1 es decir hasta 9 numeros*/
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print("Ingrese el número: ");
            a[i] = s.nextInt();
        }

        System.out.println("Nuevo Elemento: ");
        elemento = s.nextInt();

        System.out.println("Posicion donde agregar (de 0 a 9)");
        posicion = s.nextInt();

        for (int i = a.length - 2; i >= posicion; i--) {
            a[i+1] = a[i];
        }

        a[posicion] = elemento;

        System.out.println("El arreglo: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
