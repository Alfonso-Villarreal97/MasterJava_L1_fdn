package Modulo_12_Arreglos;

public class EjemploArreglosInverso {
    public static void main(String[] args) {

    /*ARREGLO INVERSO CON STRING*/

        String[] productos = new String[7];
        //Inicializar arreglo forma 1
        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco duro SSD Samsung";
        productos[3] = "Asus notebook";
        productos[4] = "MacBook Air";
        productos[5] = "Chromecast";
        productos[6] = "Bicicleta Oxford";

        /*Imprimir arreglo inverso*/
        System.out.println(" == Usando for ==");
        int total = productos.length; // <- Buena práctica para evitar iterar
        for (int i = 0; i < total; i++) {
            System.out.println("Para indice " + i + ":" + productos[i]);
        }

        System.out.println(" == Usando for inverso ==");
        for(int i =0; i<total; i++){
            /*total-1-i: con este algoritmo, podemos ir evaluando hacia atrás en la impresión*/
            System.out.println("Para i = " + (total-1-i) + " valor: " + productos[total - 1 - i]);
        }

        System.out.println(" == Usando for inverso 2==");
        for(int i = total-1; i>=0; i--){
            System.out.println("Para i = " + i + " valor " + productos[i]);
        }

        //Inicializar arreglo forma 2
        String[] productos2 = {"Kingston Pendrive 64GB", "Samsung Galaxy", "Disco duro SSD Samsung", "Asus notebook",
                "MacBook Air", "Chromecast", "Bicicleta Oxford"};

        /* Imprimir arreglo inverso */
        System.out.println("==Usando for en arreglo inicializado con {} ==");
        int total2 = productos2.length; // <- Buena práctica para evitar iterar
        for (int m = 0; m < total2; m++) {
            System.out.println("Para indice " + m + ":" + productos2[m]);
        }


    }
}
