package Modulo_07_ValorVSReferencia;

public class PasarPorValor {
    public static void main(String[] args) {

        // Toda variable primitiva se pasa por valor y no por referencia
        int i = 10;

        System.out.println("iniciamos el método main con i = " + i);
        test(i);
        System.out.println("Finaliza el método main con el valor de i = " + i);
    }

    public static void test(int i){
        System.out.println("Iniciamos el método test con i = " + i);
        i = 35;
        System.out.println("Finaliza el método test con i = " + i);
    }

    // Usar una clase Wrapper (Integer) vuelve al objeto Inmutable...
}
