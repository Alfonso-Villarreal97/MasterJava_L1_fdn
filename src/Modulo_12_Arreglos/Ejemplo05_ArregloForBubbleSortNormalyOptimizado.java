/*
    Algoritmo Ordenamiento burbuja normal y optimizada
    Explicación debajo.
* */
package Modulo_12_Arreglos;

public class Ejemplo05_ArregloForBubbleSortNormalyOptimizado {

     public static void main(String[] args) {
        //Inicializar arreglo
        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy", "Disco duro SSD Samsung", "Asus notebook",
                "MacBook Air", "Chromecast", "Bicicleta Oxford"};

        int total = productos.length; // ≤ Buena práctica para evitar iterar el length en tiempos de ejecución
        int contador = 0;
        int contador2 = 0;

        // Algoritmo método burbuja
        /* Compara tdo con tdo, ordena un elemento nada más en cada iteración*/
        for (int i = 0; i < total; i++) { //recorre la primera palabra "Kingston..." vs "
            for (int j = 0; j <total; j++){
                // Se compara con 0, ya que el método compareTo retorna 0 si son iguales, 1 si el unicode es mayor y -1 si el unicode es menor
                if(productos[i].compareTo(productos[j]) < 0){ //Compara los string lexicográficamente basados en su UNICODE
                    String auxiliar = productos[i];
                    productos[i] = productos[j];
                    productos[j] = auxiliar;
                }
                contador++;
            }
        }

        /* Imprimir arreglo ordenado */
        System.out.println("==Ordenamiento burbuja==");
        for (int i = 0; i < total; i++) {
            System.out.println("Para indice " + i + ":" + productos[i]);
        }

        // Algoritmo método burbuja optimizado
        /*  Compara un elemento con el siguiente dentro de las iteraciones;
            compara un elemento con otro y así dentro de la misma iteración */
        for (int i = 0; i < total - 1; i++) {
            for (int j = 0; j <total - 1 - i; j++){
                if(productos[j+1].compareTo(productos[j]) < 0){ //Compara los string lexicográficamente basados en su UNICODE
                    String auxiliar = productos[i];
                    productos[i] = productos[j+1];
                    productos[j] = auxiliar;
                }
                contador2++;
            }
        }

        System.out.println("\n\n==Ordenamiento burbuja optimizado=");
        for (int i = 0; i < total; i++) {
            System.out.println("Para indice " + i + ":" + productos[i]);
        }

        System.out.println("contador iteraciones ordenamiento normal: " + contador); //¿Cuántas veces iteró el recorrido de ese pequeño arreglo?
        System.out.println("contador iteraciones ordenamiento optimizado: " + contador2);
    }
}
