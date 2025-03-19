package Modulo_08_ClaseDate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {
        Date fecha = new Date();
        System.out.println("fecha = " + fecha);

        // Se puede customizar la fecha de diferentes maneras, esto con la instancia SimpleDateFormat
        // En la documentación se puede observar cómo podemos representar fechas
        SimpleDateFormat df = new SimpleDateFormat("dd MMMMM, yyyy");
        SimpleDateFormat df2 = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat df3 = new SimpleDateFormat("dd 'de' MMMM 'del' yyyy");
        String fechaStr = df.format(fecha);
        String fechaStr2 = df2.format(fecha);
        String fechaStr3 = df3.format(fecha);

        System.out.println("fechaStr = " + fechaStr);
        System.out.println("fechaStr2 = " + fechaStr2);
        System.out.println("fechaStr3 = " + fechaStr3);

        // Métodos de utilidad: getTime()
        // El método getTime permite calcular el tiempo transcurrido desde 1970 hasta el día de hoy
        long j = 0;
        for(int i=0; i < 100000000; i++){
            j += i;
        }
        
        Date fecha2 = new Date(); 
        long tiempoFinal = fecha2.getTime() - fecha.getTime();
        System.out.println("Tiempo transcurrido en el for en milisegs = " + tiempoFinal);
        System.out.println("j = " + j);
        
    }
}
