package Modulo_10_Math;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        String[] colores = {"azules", "amarillo", "rojo", "verde", "negro", "blanco"};

        double random = Math.random();
        System.out.println("random = " + random);
        random *= colores.length; // (random = random *7)

        System.out.println("random = " + random);
        random = Math.floor(random);
        System.out.println("random = " + random);

        System.out.println("colores[random] = " + colores[(int) random]);


    }
}
