package Modulo_08_ClaseDate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio_Edades {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Ingresa una fecha de nacimiento con formato yyyy-MM-dd:");
        String fechaStr = s.next(); //Guardar la fecha en un String

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaNacimiento = null;
        try {
            fechaNacimiento = df.parse(fechaStr); //Formatear la fecha ingresada haciendo uso de DateFormat
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Date actual = new Date(); //Obtener fecha actual

        df = new SimpleDateFormat("yyyyMMdd"); //Volver a formatear las fechas para poder pasarlas a enteros
        int desde = Integer.parseInt(df.format(fechaNacimiento));
        int hasta = Integer.parseInt(df.format(actual));

        int edad = (hasta - desde) / 10000;
        System.out.println("La edad es: " + edad);


    }
}
