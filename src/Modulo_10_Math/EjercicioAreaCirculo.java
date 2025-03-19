package Modulo_10_Math;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EjercicioAreaCirculo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresa el radio de tu circulo: ");
        double radio = scan.nextDouble();
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area es: " + Math.round(area * 100d) / 100d);

    }
}
