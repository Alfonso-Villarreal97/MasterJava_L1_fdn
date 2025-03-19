package Modulo_04_Operadores.Exercise_2;

import java.util.Scanner;

public class DosNumerosMayorOMenor {
    public static void main(String[] args) {
        int number1, number2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        number1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número: ");
        number2 = scanner.nextInt();

        if(number1<number2){
            System.out.println("Ordenados: " + number1 + "," + number2);
        } else {
            System.out.println("Ordenados: " + number2 + "," + number1);
        }
    }
}
