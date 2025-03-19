package Modulo_06_Wrapper;

import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {

        // Reflexión de un objeto (un vistazo a sus atributos, métodos, entre otras cosas)
        String texto = "Hola que tal";

        // Retorna una instancia del tipo class
        Class strClass = texto.getClass();

        System.out.println("strClass = " + strClass.getName());
        System.out.println("strClass = " + strClass.getSimpleName());
        System.out.println("strClass = " + strClass.getPackageName());
        System.out.println("strClass = " + strClass);

        for(Method metodo: strClass.getMethods()){
            System.out.println("metodo = " + metodo.getName());
        }

        Integer num = 34;
        Class intClass = num.getClass();
        Class objClass = intClass.getSuperclass().getSuperclass();
        System.out.println("intClass.getSuperclass().getSuperclass() = " + intClass.getSuperclass().getSuperclass());
        System.out.println("intClass.getSuperclass().getSuperclass() = " + objClass);

        for(Method metodo: objClass.getMethods()){
            System.out.println("metodo.getName() = " + metodo.getName());
        }
    }
}
