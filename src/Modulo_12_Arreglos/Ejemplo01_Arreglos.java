package Modulo_12_Arreglos;

import java.util.Arrays;

public class Ejemplo01_Arreglos {
    public static void main(String[] args) {

    /*ARREGLOS CON ENTEROS*/

        int[] numeros = new int[4]; //Definir el tamaño del arreglo
        System.out.println("El tamaño del array es: " + numeros.length);


        numeros[0] = 10;
        numeros[1] = Integer.valueOf("2");
        numeros[2] = 35;
        numeros[3] = -355;

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[numeros.length - 1];

        /*  Se usa - 1 porque el valor de length es 4 y éste excede
            el arreglo ya que solo tenemos las posiciones de 0 a 3
            Entonces, si pasamos numeros[4] esto sale de los limites del array.
        */

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);

    /*ARREGLOS CON STRING*/
        String[] productos = new String[7];
        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco duro SSD Samsung";
        productos[3] = "Asus notebook";
        productos[4] = "MacBook Air";
        productos[5] = "Chromecast";
        productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos); //Método helper que ordena un arreglo de A-Z || de Menor a Mayor

        /*Imprimiendo de forma directa*/
        System.out.println("productos = " + productos[0]);
        System.out.println("productos = " + productos[1]);
        System.out.println("productos = " + productos[2]);
        System.out.println("productos = " + productos[3]);

        /*Imprimiendo guardando el valor de una posición del arreglo en una variable*/
        String prod4 = productos[4];
        String prod5 = productos[5];
        String prod6 = productos[6];

        System.out.println("productos = " + prod4);
        System.out.println("productos = " + prod5);
        System.out.println("productos = " + prod6);


    }
}
