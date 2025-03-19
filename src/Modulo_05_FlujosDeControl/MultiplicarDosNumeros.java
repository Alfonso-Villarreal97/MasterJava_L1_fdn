package Modulo_05_FlujosDeControl;

import java.util.Scanner;

public class MultiplicarDosNumeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        int resultado = 0;

        System.out.println("Ingresa el primer número");
        num1 = scan.nextInt();
        System.out.println("Ingresa el segundo número");
        num2 = scan.nextInt();

        // Usamos el valor absoluto de num2 para asegurarnos de iterar correctamente
        int b = Math.abs(num2);

        // Sumamos num1 la cantidad de veces indicada por num2
        for (int i = 0; i < b; i++) {
            resultado += num1;
        }

        // Imprimir el resultado sin cambiar el signo de num1
        System.out.println("Resultado: " + resultado);

    }
}
