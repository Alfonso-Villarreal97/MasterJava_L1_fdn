package Modulo_05_FlujosDeControl;

import java.util.Scanner;
//
public class DiezNumeros {

    public static void main(String[] args) {

        //Integer.MAX_VALUE sirve para almacenar el valor más grande un entero, con la iteración fácilmente podemos
        //sobreescribirlo.
        int i, valor_usuario, aux = Integer.MAX_VALUE, lim_num = 0;
        Scanner scan = new Scanner(System.in);

        while (lim_num < 10) {
            System.out.println("¿Cuántos números pretendes ingresar?");
            lim_num = scan.nextInt();

            if (lim_num < 10) {
                System.out.println("Debes ingresar mínimo 10 numeros");
            } else {
                for (i = 1; i <= lim_num; i++) {
                    System.out.println("Ingresa tu numero: ");
                    valor_usuario = scan.nextInt();
                    if (valor_usuario < aux) {
                        aux = valor_usuario;
                    }
                }
            }
        }

        System.out.println("El número menor es: " + aux);
        if(aux < 10){
            System.out.println("El número " + aux +  " es menor que 10!");
        } else{
            System.out.println("El número " + aux + "es igual o mayor que 10!");
        }
    }
}

