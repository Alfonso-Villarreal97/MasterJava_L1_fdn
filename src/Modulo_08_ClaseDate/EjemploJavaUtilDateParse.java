package Modulo_08_ClaseDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {
        //Convertir un string a una fecha

        Scanner s = new Scanner(System.in);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingrese una fecha con formato 'yyyy'-MM-dd'");
        try {
            Date fecha = format.parse(s.next());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));

            Date fecha2 = new Date();

            //Comparar fechas con after y before
            if(fecha.after(fecha2)){
                System.out.println("Fecha del usuario es después o mayor que la fecha actual");
            } else if(fecha.before(fecha2)){
                System.out.println("Fecha del usuario es anterior que fecha2");
            } else if(fecha.equals(fecha2)){
                System.out.println("Las fechas son iguales");
            }

            // Comparar fechas con compareTo
            if(fecha.compareTo(fecha2) > 0){
                System.out.println("CT: Fecha del usuario es después o mayor que la fecha actual");
            } else if(fecha.compareTo(fecha2) < 0){
                System.out.println("CT: Fecha del usuario es anterior que fecha2");
            } else if (fecha.compareTo(fecha2) == 0) {
                System.out.println("CT: Las fechas son iguales");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
