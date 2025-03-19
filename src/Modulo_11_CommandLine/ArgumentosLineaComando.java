package Modulo_11_CommandLine;

public class ArgumentosLineaComando {
    public static void main(String[] args) {

        /* Compilar este código directamente desde el src sería
        * 1. javac A_rgumentosLineaComando.java
        * 2. java ArgumentosLineaComando Arg1 Arg2
        *
        * Si se compila desde un package es diferente ya que hay que indicar la ruta completa añadiendo la carpeta:
        * 1. javac Modulo__11_CommandLine/ArgumentosLineaComando.java //Esto compila el src > package > archivo o clase
        * 2. java Modulo__11_CommandLine.ArgumentosLineaComando argumento1 argumento2
        * */

        if(args.length == 0){
            System.out.println("Debe ingresar argumentos o parámetros");
            System.exit(-1);
        }
        for(int i = 0; i < args.length; i++){
            System.out.println("Argumentos n° " + i + ": " + args[i]);
        }

    }
}


