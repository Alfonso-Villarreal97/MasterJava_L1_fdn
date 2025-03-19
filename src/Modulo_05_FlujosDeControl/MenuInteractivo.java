package Modulo_05_FlujosDeControl;

import java.util.Scanner;

public class MenuInteractivo {
    public static void main(String[] args) {
        int opcion = 0;
        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("- - - Bienvenido a este menú improvisado - - - \n");
            System.out.println("""
                Opciones:\s
                1. Crear
                2. Actualizar
                3. Eliminar
                4. Listar
                0. Salir
                """);

            System.out.println("Elige tu opcion: ");
            opcion = scan.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Usuario creado exitosamente.");
                    break;

                case 2:
                    System.out.println("Usuario actualizado exitosamente.");
                    break;

                case 3:
                    System.out.println("Usuario eliminar exitosamente.");
                    break;

                case 4:
                    System.out.println("Usuarios listados exitosamente.");
                    break;

                case 0:
                    System.out.println("Hasta luego...");
                    break;
            }

        }while(opcion!=0);

    }
}
