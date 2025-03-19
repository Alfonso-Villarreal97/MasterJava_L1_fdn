package Modulo_10_Math;

import java.util.Random;

public class EjemploObjetoRandom {
    public static void main(String[] args) {
        Random randomObj = new Random();
        int randomInt = randomObj.nextInt(7); //Como argumento pasa el limite de 0 a 6
        System.out.println("randomInt = " + randomInt);

        //Rangos de random en int:
        // //Para añadir un rango es el numero inicial + la función random con el limite superior menos el limite inferior
        // Entonces: Obtener un rango randomizado entre 15 y 25 es:
        int randomInt2 = 15 + randomObj.nextInt(25-15);
        System.out.println("randomInt2 = " + randomInt2);

        String[] colores = {"azules", "amarillo", "rojo", "verde", "negro", "blanco"};
        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores = " + colores[randomInt]);

    }
}
