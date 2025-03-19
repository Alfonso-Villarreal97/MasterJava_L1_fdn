package Modulo_06_Wrapper;

public class WrapperInteger {
    public static void main(String[] args) {

    /* == EJEMPLOS DE USO DE CLASE WRAPPER DEL OBJETO INTEGER == */
        int intPrimitivo = 32768;
        //Forma 1
        Integer intObjeto = Integer.valueOf(intPrimitivo);
        //Forma 2
        Integer intObjeto2 = intPrimitivo;
        System.out.println("intObjeto = " + intObjeto);

        // Formas de convertir de Objeto Integer a Primitivo
        // Forma implícita
        int num = intObjeto;
        System.out.println("num = " + num);
        // Forma explícita
        int num2 = intObjeto.intValue();
        System.out.println("num = " + num2);

        //Convertir un String a Int
        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("Valor TV de STR a INT = " + valor);

        // Convertir Short a Int
        // Si el SHORT tiene un valor mayor al que soporta (32767), existe pérdida de información
        Short shortObjeto = intObjeto.shortValue(); //intObjeto aquí vale más de 32767 y marcará perdida de info al correr
        System.out.println("shortObjeto = " + shortObjeto);

        // Convertir byte a entero
        Byte byteObjeto = intObjeto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);

        //Convertir long a int
        Long longObjeto = intObjeto.longValue();
        System.out.println("longObjeto = " + longObjeto);
    /* == EJEMPLOS DE USO DE CLASE WRAPPER DEL OBJETO INTEGER == */

    }
}
