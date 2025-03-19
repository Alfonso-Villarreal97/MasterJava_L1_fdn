package ExamenJavaINB;

import java.util.Scanner;

public class Fibonacci {
    public static void fibonacci(int MAX) {
        // Si se requiere un solo elemento
        if (MAX == 1) {
            System.out.println("1");
            return;
        }

        // Inicializar la secuencia comenzando con dos unos
        int num1 = 1;
        int num2 = 1;
        System.out.print(num1 + " " + num2);

        // Iterar los términos a partir del tercero
        for (int i = 3; i <= MAX; i++) {
            int fibonacci = num1 + num2;
            System.out.print(" " + fibonacci);
            num1 = num2;
            num2 = fibonacci;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int MAX = scanner.nextInt();
        fibonacci(MAX);
        scanner.close();
    }
}