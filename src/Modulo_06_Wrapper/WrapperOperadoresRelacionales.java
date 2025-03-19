package Modulo_06_Wrapper;

import java.sql.SQLOutput;

public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {
        // Aquí son objetos
        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Compara objeto con objeto #Salida: True
        System.out.println("Son el mismo objeto? " + (num1 == num2));

        // Aquí num2 es primitivo
        num2 = 1000;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Compara objeto con primitivo #Salida: False
        System.out.println("Son el mismo objeto? " + (num1 == num2));

        System.out.println("Tienen el mismo valor? " + (num1.equals(num2)));
        System.out.println("Tienen el mismo valor? " + (num1.intValue() == num2.intValue()));

        // Uso de operadores relacionales con autoboxing y unboxing
        num2 = 500;
        boolean condicion = num1 > num2;
        System.out.println("condicion = " + condicion);

        boolean condicion2 = num1.intValue() < num2.intValue();
        System.out.println("condicion2 = " + condicion2);


    }
}
