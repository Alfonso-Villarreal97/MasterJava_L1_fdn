/*
Obtener el nombre mas largo de tres personas, según los siguientes requerimientos
1. Mediante el teclado pedir el nombre completo (nombre + apellido) de tres miembros de la familia o amigos usando la clase JOptionPane y método showInputDialog().
2. Calcular e Imprimir el nombre de la persona que tenga el nombre más largo (en cantidad de caracteres)   (Imprimir sólo uno de los tres, el de más caracteres en el nombre.)
3. Podría usar .split(" "); del objeto String para separar nombre y apellido en un arreglo, y con el indice cero accedemos al nombre de la persona.
4. Restricción no usar loops en el desarrollo de la tarea.
Ejemplo del resultado: "Guillermo Doe tiene el nombre más largo."
*/


package Modulo_04_Operadores.Exercise_2;

import javax.swing.*;

public class Nombre_mas_largo {

    public static void main(String[] args) {
        String msgInput1 = JOptionPane.showInputDialog("Escribe el nombre 1");
        String msgInput2 = JOptionPane.showInputDialog("Escribe el nombre 2");
        String msgInput3 = JOptionPane.showInputDialog("Escribe el nombre 3");

        int aux1 = msgInput1.length();
        int aux2 = msgInput2.length();
        int aux3 = msgInput3.length();

        System.out.println("Los caracteres del nombre 1 son: " + aux1);
        System.out.println("Los caracteres del nombre 2 son: " + aux2);
        System.out.println("Los caracteres del nombre 3 son: " + aux3);

        if(aux1>aux2 && aux1>aux3){
            System.out.println(msgInput1 + " es el mayor");
        } else if (aux2>aux3) {
            System.out.println(msgInput2 + " es el mayor");
        } else {
            System.out.println(msgInput3 + " es el mayor");
        }


    }


}
