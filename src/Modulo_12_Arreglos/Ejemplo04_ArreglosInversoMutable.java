/*
    En este programa se invierte un arreglo mediante el intercambio de las posiciones
    -- Forma 1 --
    Primero se ordena el arreglo de forma alfabética
    Luego se invierte utilizando el método creado donde nosotros.

    -- Forma 2 --
    Utilizando la API Collections.

*/

package Modulo_12_Arreglos;

import java.util.Arrays;

public class Ejemplo04_ArreglosInversoMutable {

    // == Método para invertir una cadena creada por nosotros (Explícita)
    public static void arregloInverso(String[] arreglo){ /* Intercambiar valores */
        int total2 = arreglo.length;
        int total = arreglo.length;
        for(int i = 0; i < total2; i++){
            String actual = arreglo[i];
            String inverso = arreglo[total-1-i]; //arreglo[7-1-0 = 6] then...
            arreglo[i] = inverso; // arreglo[6] = inverso
            arreglo[total-1-i] = actual;
            total2--;
        }
    }

    public static void main(String[] args) {

    /*ARREGLO INVERSO CON STRING*/
        //Inicializar arreglo
        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy", "Disco duro SSD Samsung", "Asus notebook",
                "MacBook Air", "Chromecast", "Bicicleta Oxford"};

        int total = productos.length; // ≤ Buena práctica para evitar iterar el length en tiempos de ejecución
        Arrays.sort(productos); //Ordena alfabéticamente
        arregloInverso(productos);
        //Collections.reverse(Arrays.asList(productos)); //Convierte el arreglo a lista


        /* Imprimir arreglo ordenado */
        System.out.println("==Usando for ==");
        for (int i = 0; i < total; i++) {
            System.out.println("Para indice " + i + ":" + productos[i]);
        }

    }
}
