public class UD4_Apartado1_Casting {
    public static void main(String[] args) {
        // Ejercicio 1
        byte pequeño = 50;
        int mediano = pequeño; // Conversión implícita de byte a int
        double grande = mediano; // Conversión implícita de int a double

        System.out.println("byte: " + pequeño);
        System.out.println("int: " + mediano);
        System.out.println("double: " + grande);

        // Ejercicio 2
        double valorDouble = 123.456789;
        float valorFloat = (float) valorDouble; // Casting explícito

        System.out.println("double: " + valorDouble);
        System.out.println("float: " + valorFloat);

        // Ejercicio 3
        long grande1 = 1_000_000_000L;
        int pequeño1 = 500;

        long resultadoLong = grande1 + pequeño1; // Conversión implícita de
        // int a long;
        int resultadoInt = (int) (grande1 + pequeño1); // Casting explícito a int

        System.out.println("Resultado en long: " + resultadoLong);
        System.out.println("Resultado en int (cast): " + resultadoInt);

        // Ejercicio 4
        int numero = 40000;
        short convertido = (short) numero; // Pérdida de información

        System.out.println("int original: " + numero);
        System.out.println("short convertido: " + convertido);
        
        // Ejercicio 5
        char c1 = 'a';
        char c2 = 'b';
        int sumaCodigos = c1 + c2; // Conversión implícita a int en la operación

        System.out.println("Código de 'a': " + (int) c1);
        System.out.println("Código de 'b': " + (int) c2);
        System.out.println("Suma de códigos: " + sumaCodigos);
        
        // Ejercicio 6
        // int numero1 = 1;

        // boolean esVerdadero = (boolean) numero; // ERROR de compilación, no permitido;

        System.out.println("No es posible convertir directamente un int a boolean en Java.");
    }
}
