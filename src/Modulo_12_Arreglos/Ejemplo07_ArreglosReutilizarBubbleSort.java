package Modulo_12_Arreglos;

public class Ejemplo07_ArreglosReutilizarBubbleSort {

    /* Método sortBurbuja para ordenar cualquier arreglo */
    /* Espera como parámetro un arreglo de objetos, de esta manera no importa */
    public static void sortBurbuja(Object[] arreglo){
        int total = arreglo.length;
        int contador = 0;

        for (int i = 0; i < total - 1; i++) {

            for (int j = 0; j < total - 1 - i; j++){
                /* Se castea a un objeto Comparable para pasarlo a tipo referencia*/
                if( ((Comparable) arreglo[j+1]).compareTo(arreglo[j]) > 0){ //Compara los string lexicográficamente basados en su UNICODE
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliar;
                }
                contador++;
            }

        }
        System.out.println("contador = " + contador);
    }

    public static void main(String[] args) {

        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy", "Disco duro SSD Samsung", "Asus notebook",
                "MacBook Air", "Chromecast", "Bicicleta Oxford"};

        Integer[] numeros = new Integer[4];
        numeros[0] = 10;
        numeros[1] = Integer.parseInt("7");
        numeros[2] = 35;
        numeros[3] = -1;

        int total = productos.length;
        int total2 = numeros.length;

        sortBurbuja(productos);
        sortBurbuja(numeros);

        System.out.println("== Ordenamiento descendente burbuja optimizado y reutilizado con método ==");
        for (int i = 0; i < total; i++) {
            System.out.println("Imprimiendo arreglo de strings índice " + i + ": " + productos[i]);
        }

        for (int i = 0; i < total2; i++) {
            System.out.println("Imprimiendo arreglo de números para índice " + i + ": " + numeros[i]);
        }


    }
}
