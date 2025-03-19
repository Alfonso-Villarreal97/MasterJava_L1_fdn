package Modulo_07_ValorVSReferencia;

class Persona{
    private String nombre;

    public void modificarNombre(String nuevoNombre){
        //This se refiere a esta misma clase o instancia
        this.nombre = nuevoNombre;
    }

    public String leerNombre(){
        return this.nombre;
    }
}

public class PasarPorReferencia2 {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombre("Diego");

        System.out.println("iniciamos el método main");

        System.out.println("persona = " + persona.leerNombre());
        System.out.println("Antes de llamar al método test");
        test(persona);
        System.out.println("Después de llamar al metodo test");
        System.out.println("persona = " + persona.leerNombre());
        System.out.println("finaliza el método main con los datos de la persona modificados!");
    }

    public static void test(Persona persona){
        System.out.println("Iniciamos el método test");
        persona.modificarNombre("Alfonso");
        System.out.println("Finaliza el método test");
    }

    // Usar una clase Wrapper (Integer) vuelve al objeto Inmutable...
}
