package Modulo_08_ClaseDate;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {
        // El método Calendar no se puede instanciar mediante el objeto new
        Calendar calendario = Calendar.getInstance();

        // Calendario.set --asigna-- y pasa por argumentos, el año, el mes (donde enero empieza con 0 y diciembre es 11), y la hora separada cada una por enteros
        calendario.set(2025, 0, 25, 19,20,10);
        // También puede asignarse una fecha en particular usando la constante del mes.
        calendario.set(2025, Calendar.SEPTEMBER, 25, 19,20,10);

        // Otra manera de especificar una fecha estática con calendario podríamos hacer lo siguiente:
        // Setteamos la fecha a través del método set

        calendario.set(Calendar.YEAR,2020);
        calendario.set(Calendar.MONTH, Calendar.JULY);
        calendario.set(Calendar.DAY_OF_MONTH, 25);

        // Setteamos la hora a través del método set
        //calendario.set(Calendar.HOUR_OF_DAY, 21);
        calendario.set(Calendar.HOUR, 7);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 10);

        Date fecha = calendario.getTime();
        System.out.println("fecha sin formato = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
        String fechaConFormato = formato.format(fecha);
        System.out.println("fechaConFormato = " + fechaConFormato);
    }
}
