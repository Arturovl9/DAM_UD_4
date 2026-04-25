public class UD4_EjemploTiposPrimitivos {
    public static void main(String[] args) {
        // Ejemplo 01
            int edad = 20;
            System.out.println("Edad: " + edad);
            
        // Ejemplo 02
            double temperatura = 36.6;
            System.out.println("Temperatura corporal: " + temperatura + " °C");
            
        // Ejemplo 03
            boolean esMayorDeEdad = true;
            System.out.println("¿Es mayor de edad? " + esMayorDeEdad);
            
        // Ejemplo 04
            char inicial = 'A';
            System.out.println("Inicial del nombre: " + inicial);

        // Ejemplo 05
            byte diasSemana = 7;
            System.out.println("Días de la semana: " + diasSemana);
            
        // Ejemplo 06
            short año = 2025;
            System.out.println("Año actual: " + año);
            
        // Ejemplo 07
            long poblacionMundial = 8000000000L;
            System.out.println("Población mundial: " + poblacionMundial);
            
        // Ejemplo 08
            float precio = 19.99f;
            System.out.println("Precio del producto: $" + precio);
            
        // Ejemplo 09
            String nombre = "Ana";
            System.out.println("Nombre: " + nombre);
            
        // Ejemplo 10 Conversión implicita de int a double
            int numero = 10;
            double resultado1 = numero; // Conversión implícita
            System.out.println("Double: " + resultado1);
            
        // Ejemplo 11 Conversión explicíta de double a int
            double valor = 9.99;
            int entero = (int) valor; // Casting explícito
            System.out.println("Entero: " + entero);
            
        // Ejemplo 12 Suma de int y double con casting
            int a = 5;
            double b = 2.7;
            double suma = a + b; // `a` se convierte implícitamente a double
            System.out.println("Suma: " + suma);
            
        // Ejemplo 13 Divisón de enteros con resultado decimal
            int c = 7;
            int d = 2;
            double resultado2 = (double) c / d; // Forzar decimal
            System.out.println("Resultado: " + resultado2);

        // Ejemplo 14 De char a int
            char letra = 'A';
            int codigo = (int) letra; // Conversión explícita
            System.out.println("Código ASCII de 'A': " + codigo);
        
        // Ejemplo 15 De int a char
            int codigo1 = 66;
            char letra1 = (char) codigo1;
            System.out.println("Letra: " + letra1);
            
        // Ejemplo 16 Pérdida de información al castear long a int
            long numeroGrande = 2147483648L; // Mayor que el máximo de int
            int convertido = (int) numeroGrande; // Pérdida de datos
            System.out.println("Valor convertido: " + convertido);
            
        // Ejemplo 17 Convertir float a int truncando decimales
            float valor1 = 15.75f;
            int truncado = (int) valor1; // Trunca decimales
            System.out.println("Truncado: " + truncado);
            
        // Ejemplo 18 Cast implícito de short a int
            short pequeño = 123;
            int grande = pequeño; // Conversión implícita
            System.out.println("Int: " + grande);

        // Ejemplo 19
            int e = 5;
            int f = 2;
            
            double resultadoIncorrecto = e / f; // División entera
            double resultadoCorrecto = (double) e / f; // Cast antes de dividir
            
            System.out.println("Incorrecto: " + resultadoIncorrecto); // 2.0
            System.out.println("Correcto: " + resultadoCorrecto); // 2.5
        // Ejemplo 20

    }
}
