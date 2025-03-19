package Modulo_11_CommandLine;

public class ArgumentosLineaComandoCalcu {
    public static void main(String[] args) {

        if(args.length != 3){
            System.out.println("Porfavor ingresa una operación (suma, resta, div o multi) y dos enteros");
            System.exit(-1);
        }

        String operacion = args[0];
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        double resultado = 0.00;

        switch(operacion){
            case "suma":
                resultado = a + b;
                break;

            case "resta":
                resultado = a - b;
                break;

            case "multi":
                resultado = a * b;
                break;

            case "div":
                if(b == 0){
                    System.err.println("No se puede dividir entre 0");
                    System.exit(-1);
                } else {
                    resultado = (double)a / b;
                }
                break;

            default:
            resultado = a + b;
            break;
        }

        System.out.println("Resultado de la operación '" + operacion + "' es: " + resultado);

    }
}
