package Modulo_09_System;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Properties;

public class EjemploAsignarPropiedadesDelSistema {
    public static void main(String[] args) {
        try {
            FileInputStream archivo = new FileInputStream("src/Modulo_09_System/config.properties"); //leer archivo

            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto properties"); //settear un valor en el archivo Properties (Uso solo en tiempo de ejecución)

            System.setProperties(p);
            Properties ps = System.getProperties();
            System.out.println("ps.getProperty(...) = " + ps.getProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto properties" ));
            System.out.println(System.getProperty("config.puerto.servidor")); //Obtener el valor de una propiedad
            System.out.println(System.getProperty("config.autor.nombre"));
            System.out.println(System.getProperty("config.autor.email"));
            /*System.getProperties().list(System.out);*/
            ps.list(System.out); //Listar todas las propiedades del sistema

        } catch (Exception e) {
            System.out.println("no existe el archivo = " + e);
        }
    }
}
