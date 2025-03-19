package Modulo_04_Operadores.Exercise_2;

import java.util.Scanner;

public class CompareLiters_Ifs {
    public static void main(String[] args) {
        double usrLiters;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese los litros que desea consultar: ");
        usrLiters = scanner.nextDouble();

        if(usrLiters>70){
            System.out.print("La cantidad de litros a consultar excede la capacidad del estanque.");
        } else if (usrLiters == 70) {
            System.out.print("El estanque está lleno.");
        } else if (usrLiters >= 60) {
            System.out.print("El estanque está casi lleno.");
        } else if (usrLiters >= 40){
            System.out.print("El estanque está a 3/4");
        } else if(usrLiters >= 35){
            System.out.print("El estanque está a capacidad media");
        } else if (usrLiters >= 20){
            System.out.print("Suficiente");
        } else {
            System.out.print("Insuficiente");
        }
    }
}
