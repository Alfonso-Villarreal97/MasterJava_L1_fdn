package Modulo_04_Operadores.Exercise_2;

import java.util.Scanner;

public class FamilyNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String aux1, aux2, aux3;
        System.out.print("Ingresa el nombre de tu familiar 1: ");
        String name1 = scanner.next();
        System.out.print("Ingresa el nombre de tu familiar 2: ");
        String name2 = scanner.next();
        System.out.print("Ingresa el nombre de tu familiar 3: ");
        String name3 = scanner.next();

        aux1 = name1.substring(name1.length()-2);
        aux2 = name2.substring(name2.length()-2);
        aux3 = name3.substring(name3.length()-2);

        name1 = String.valueOf(name1.toUpperCase().charAt(1));
        name2 = String.valueOf(name2.toUpperCase().charAt(1));
        name3 = String.valueOf(name3.toUpperCase().charAt(1));

        String finalName = name1 + "." + aux1 + "_" + name2 + "." + aux2 + "_" + name3 + "." + aux3;

        System.out.println(finalName);
    }
}
