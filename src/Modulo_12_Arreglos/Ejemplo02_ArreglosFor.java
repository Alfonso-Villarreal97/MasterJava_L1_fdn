package Modulo_12_Arreglos;

public class Ejemplo02_ArreglosFor {
    public static void main(String[] args) {

    /*ARREGLOS CON ENTEROS*/

        int[] numeros = new int[4]; //Definir el tamaño del arreglo
        int totalNumeros = numeros.length;


        for(int k = 0; k<totalNumeros; k++){
            numeros[k] = k*3;
        }

        for (int numero : numeros) {
            System.out.println("Números: " + numero);
        }


    /*ARREGLOS CON STRING*/
        String[] productos = new String[7];
        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco duro SSD Samsung";
        productos[3] = "Asus notebook";
        productos[4] = "MacBook Air";
        productos[5] = "Chromecast";
        productos[6] = "Bicicleta Oxford";

        System.out.println(" == Usando for ==");
        int total = productos.length; // <- Buena práctica para evitar iterar
        for (int i = 0; i < total; i++) {
            System.out.println("Para indice " + i + ":" + productos[i]);
        }

        System.out.println(" == Usando foreach ==");
        for (String prod: productos){
            System.out.println("prod = " + prod);
        }

        System.out.println(" == Usando while ==");
        int i = 0;
        while (i < total) { //Mientras se cumpla una condición haz esto, está menos optimizado que el for
            System.out.println("Para indice " + i + ":" + productos[i]);
            i++;
        }

        System.out.println(" == Usando do-while ==");
        int j = 0;
        do{
            System.out.println("Para indice " + i + ":" + productos[j]);
            j++;
        }while (j<total);


    }
}
