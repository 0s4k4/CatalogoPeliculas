public class EjemploOperadoresAsignacion {

    public static void main(String[] args) {

        //de esta manera podemos definir los valores

        int valor1 = 5;
        int valor2 = 6;

        System.out.println("Valor 1: " + valor1);

        valor1 += 15;

        System.out.println("Valor de asinacion combinado: " + valor1);


        System.out.println("------------OPERADORES ARITMETICOS------------");

        int suma = valor1 + valor2;

        System.out.println("Suma: " + suma);
        int resto = valor1 - valor2;
        System.out.println("Resto: " + resto);
        int multiplicacion = valor1 * valor2;
        System.out.println("Multiplicacion: " + multiplicacion);
        int division = valor1 / valor2;
        System.out.println("Division: " + division);
        int modulo = valor1 % valor2;
        System.out.println("Modulo: " + modulo);


        System.out.println("------------OPERADORES RELACIONALES------------");

        Boolean igual = valor1 == valor2;
        System.out.println("Igual: " + igual);
        boolean diferencia = valor1 != valor2;
        System.out.println("Diferencia: " + diferencia);
        boolean mayor = valor1 > valor2;
        System.out.println("Mayor: " + mayor);


        System.out.println("------------OPERADORES LOGICOS------------");

        boolean a = true;
        boolean b = false;
        if (a && b) {
            System.out.println("A");
        }

    }
}
