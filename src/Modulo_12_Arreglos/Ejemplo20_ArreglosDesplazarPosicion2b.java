package Modulo_12_Arreglos;
import java.util.Scanner;
/*
* Agregar un elemento a una posicion determinada y mover los siguientes elementos
* Se sabe que los arreglos no crecen de forma dinámica
* */
public class Ejemplo20_ArreglosDesplazarPosicion2b {
    public static void main(String[] args) {

        int[] a = new int[10];
        int elemento, posicion, ultimo;
        Scanner s = new Scanner(System.in);

        /*Llenar arreglo*/
        /*Se llena hasta el total del arreglo - 1 es decir hasta 9 numeros*/
        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese el número: ");
            a[i] = s.nextInt();
        }

        System.out.println("Nuevo Elemento: ");
        elemento = s.nextInt();

        System.out.println("Posicion donde agregar (de 0 a 9)");
        posicion = s.nextInt();

        ultimo = a[a.length-1];
        for (int i = a.length - 2; i >= posicion; i--) {
            a[i+1] = a[i];
        }

        int[] b = new int[a.length+1];
        System.arraycopy(a, 0, b , 0, a.length);
        b[posicion] = elemento;
        b[b.length-1] = ultimo;

        System.out.println("El arreglo: ");
        for (int i = 0; i < b.length; i++) {
            System.out.println("b[" + i +"] = " + b[i]);
        }
    }
}
