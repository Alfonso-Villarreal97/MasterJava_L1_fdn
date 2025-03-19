package ExamenJavaINB;

import java.util.Scanner;
import java.io.IOException;


public class InvertirPalabras {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        String miCadena = s.nextLine();
        //Haciendo uso de StringBuilder y el método .reverse()
        String reves = new StringBuilder(miCadena).reverse().toString();
        System.out.println(reves);
    }
}