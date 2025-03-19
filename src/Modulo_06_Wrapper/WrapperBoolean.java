package Modulo_06_Wrapper;

public class WrapperBoolean {
    public static void main(String[] args) {

        Integer num1, num2;
        //Forma implícita
        num1 = 1;
        num2 = 2;

        // Primitivo Boolean
        boolean primBoolean = num1 > num2;

        //Wrapper Boolean
        Boolean objBoolean = Boolean.valueOf(primBoolean);
        Boolean objBoolean2 = Boolean.valueOf("false");
        Boolean objBoolean3 = true;


        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objBoolean = " + objBoolean);
        System.out.println("objBoolean2 = " + objBoolean2);

        System.out.println("comparando dos objetos boolean: " + (objBoolean == objBoolean2));
        System.out.println("comparando dos objetos boolean: " + (objBoolean.equals(objBoolean2)));
        System.out.println("comparando dos objetos boolean: " + (objBoolean2 == objBoolean3));
        System.out.println("comparando dos objetos boolean: " + (objBoolean2.equals(objBoolean3)));

        // Se obtiene el valor booleano primitivo (Unboxing)
        boolean primBoolean2 = objBoolean2.booleanValue();
        System.out.println("primBoolean2 = " + primBoolean2);
    }
}
